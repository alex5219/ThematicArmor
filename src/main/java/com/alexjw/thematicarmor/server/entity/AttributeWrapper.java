package com.alexjw.thematicarmor.server.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.ai.attributes.IAttribute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AttributeWrapper {
    private final List<AttributePair> modifiers = new ArrayList<>();
    public final IAttribute attribute;

    public AttributeWrapper(IAttribute attribute)
    {
        this.attribute = attribute;
    }

    protected List<Double> getModifiers(int operation)
    {
        List<Double> list = new ArrayList<>();

        for (AttributePair pair : modifiers)
        {
            if (operation == pair.operation)
            {
                list.add(pair.amount);
            }
        }

        return list;
    }

    public ImmutableList<AttributePair> getModifiers()
    {
        return ImmutableList.copyOf(modifiers);
    }

    public void apply(double amount, int operation)
    {
        modifiers.add(new AttributePair(amount, operation));
    }

    public boolean isEmpty()
    {
        return modifiers.isEmpty();
    }

    public double getValue(double baseValue)
    {
        List<Double> list = new ArrayList<>(getModifiers(1));
        list.addAll(getModifiers(2));

        double amount;

        for (Iterator<Double> iter = list.iterator(); iter.hasNext(); baseValue *= 1 + amount)
        {
            amount = iter.next();
        }

        for (Iterator<Double> iter = getModifiers(0).iterator(); iter.hasNext(); baseValue += amount)
        {
            amount = iter.next();
        }

        return attribute.clampValue(baseValue);
    }

    public float getValue(float baseValue)
    {
        return (float) getValue((double) baseValue);
    }
}
