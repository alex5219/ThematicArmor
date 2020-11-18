package com.alexjw.thematicarmor.server.drugs;

import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffect;
import com.alexjw.thematicarmor.server.items.ItemDrug;
import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Drug {
    public ItemDrug itemDrug;
    public ArrayList<DrugEffect> buffs;
    private Random random = new Random();
    private int count = 1;

    public Drug(int amount, float saturation, int count, DrugEffect... effects) {
        itemDrug = new ItemDrug(this, amount, saturation);
        ArrayList<DrugEffect> effectArrayList = new ArrayList<>();
        Collections.addAll(effectArrayList, effects);
        this.buffs = effectArrayList;
        this.count = count;
    }

    public Drug(int amount, float saturation, DrugEffect... effects) {
        itemDrug = new ItemDrug(this, amount, saturation);
        ArrayList<DrugEffect> effectArrayList = new ArrayList<>();
        Collections.addAll(effectArrayList, effects);
        this.buffs = effectArrayList;
    }

    public Drug(DrugEffect... effects) {
        itemDrug = new ItemDrug(this, 0, 0);
        ArrayList<DrugEffect> effectArrayList = new ArrayList<>();
        Collections.addAll(effectArrayList, effects);
        this.buffs = effectArrayList;
    }

    public ItemDrug getItemDrug() {
        return itemDrug;
    }

    public void onConsume(EntityPlayer entityPlayer) {
        int didFire = 0;

        while (!(didFire >= count)) {
            for (DrugEffect drugEffect : buffs) {
                if (random.nextInt(100) <= drugEffect.getChance()) {
                    drugEffect.onConsume(entityPlayer, this);
                    didFire++;
                }
            }
        }
    }

    public void init() {
    }

    public String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    public String getUnlocalizedName() {
        return this.getName().replaceAll("drug", "drug_");
    }
}
