package com.alexjw.siegecraft.server.operators;

import java.util.ArrayList;

public class OperatorManager {
    public static ArrayList<Operator> operatorArrayList = new ArrayList<>();
    public static OperatorAsh operatorAsh = new OperatorAsh();
    public static OperatorBandit operatorBandit = new OperatorBandit();
    public static OperatorDoc operatorDoc = new OperatorDoc();
    public static OperatorFinka operatorFinka = new OperatorFinka();
    public static OperatorJackal operatorJackal = new OperatorJackal();
    public static OperatorMaverick operatorMaverick = new OperatorMaverick();
    public static OperatorRook operatorRook = new OperatorRook();
    public static OperatorSledge operatorSledge = new OperatorSledge();
    public static OperatorSmoke operatorSmoke = new OperatorSmoke();
    public static OperatorVigil operatorVigil = new OperatorVigil();

    public static void init() {
        for (Operator operator : operatorArrayList) operator.init();
    }
}
