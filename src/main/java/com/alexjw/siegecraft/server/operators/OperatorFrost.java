package com.alexjw.siegecraft.server.operators;

public class OperatorFrost extends Operator {
    public OperatorFrost() {
        super(Team.DEFENDER, 2, 2, 1);
    }

    @Override
    public boolean isHidden() {
        return true;
    }
}
