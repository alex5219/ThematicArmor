package com.alexjw.siegecraft.server.operators;

import java.util.ArrayList;

public class OperatorManager {
    public static final ArrayList<Operator> operatorArrayList = new ArrayList<>();
    public static final OperatorAsh operatorAsh = new OperatorAsh();
    public static final OperatorBandit operatorBandit = new OperatorBandit();
    public static final OperatorDoc operatorDoc = new OperatorDoc();
    public static final OperatorFinka operatorFinka = new OperatorFinka();
    public static OperatorFrost operatorFrost = new OperatorFrost();
    public static final OperatorJackal operatorJackal = new OperatorJackal();
    public static final OperatorMaverick operatorMaverick = new OperatorMaverick();
    public static final OperatorRook operatorRook = new OperatorRook();
    public static final OperatorSledge operatorSledge = new OperatorSledge();
    public static final OperatorSmoke operatorSmoke = new OperatorSmoke();
    public static OperatorThermite operatorThermite = new OperatorThermite();
    public static final OperatorVigil operatorVigil = new OperatorVigil();
    public static final OperatorVigilInvis operatorVigilInvis = new OperatorVigilInvis();


    public static void init() {
        for (Operator operator : operatorArrayList) operator.init();
    }
}
