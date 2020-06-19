package com.alexjw.siegecraft.server.operators;

public class OperatorEla extends Operator {
    public OperatorEla() {
        super(Team.DEFENDER, 3, 1, 1);
    }

    @Override
    public boolean isHidden() {return true;}
}
