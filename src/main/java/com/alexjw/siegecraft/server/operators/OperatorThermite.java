package com.alexjw.siegecraft.server.operators;

public class OperatorThermite extends Operator {
    public OperatorThermite() {
        super(Team.DEFENDER, 2, 2, 1);
    }

    @Override
    public boolean isHidden() {
        return true;
    }
}
