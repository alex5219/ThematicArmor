package com.alexjw.siegecraft.server.operators;

public class OperatorEcho extends Operator {
    public OperatorEcho() {
        super(Team.DEFENDER, 1, 3, 3);
    }

    @Override
    public boolean isHidden() {return true;}
}
