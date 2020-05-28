package com.alexjw.siegecraft.common.operators;

import com.alexjw.siegecraft.common.gadgets.Gadget;
import com.alexjw.siegecraft.common.gadgets.GadgetBlowTorch;

import java.util.ArrayList;

public class OperatorMaverick extends Operator {
    public OperatorMaverick() {
        super(Team.ATTACKER, 3, 1, 2);
    }

    public ArrayList<Gadget> getGadgets() {
        ArrayList<Gadget> gadgets = new ArrayList<>();
        gadgets.add(new GadgetBlowTorch());
        return gadgets;
    }
}
