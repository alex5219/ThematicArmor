package com.alexjw.siegecraft.server.operators;

public class OperatorCapitao extends Operator {
    public OperatorCapitao() {
        super(Team.ATTACKER, 3, 1, 2);
    }

    @Override
    public boolean isHidden() {
        return true;
    }
}
