package com.alexjw.siegecraft.server.operators;

public class OperatorThatcher extends Operator {
    public OperatorThatcher() {
        super(Team.ATTACKER, 2, 2, 1);
    }

    @Override
    public boolean isHidden() {
        return true;
    }
}
