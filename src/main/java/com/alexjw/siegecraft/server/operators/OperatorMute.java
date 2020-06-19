package com.alexjw.siegecraft.server.operators;

import com.alexjw.siegecraft.server.gadgets.Gadget;
import com.alexjw.siegecraft.server.gadgets.GadgetBlowTorch;

import java.util.ArrayList;

public class OperatorMute extends Operator {
    public OperatorMute() {
        super(Team.DEFENDER, 2, 2, 1);
    }
    @Override
    public boolean isHidden(){return true;}

    public ArrayList<Gadget> getGadgets() {
        ArrayList<Gadget> gadgets = new ArrayList<>();
        gadgets.add(new GadgetBlowTorch());
        return gadgets;
    }
}
