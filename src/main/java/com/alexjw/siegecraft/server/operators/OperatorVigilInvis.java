package com.alexjw.siegecraft.server.operators;

public class OperatorVigilInvis extends Operator {
    public OperatorVigilInvis() {
        super(Team.DEFENDER, 3, 1, 1);
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
