package com.alexjw.siegecraft.server.operators;

import com.alexjw.siegecraft.client.model.operators.ModelOperatorEcho;

import java.util.ArrayList;

public class OperatorManager {
    public static ArrayList<Operator> operatorArrayList = new ArrayList<>();
    public static OperatorAsh operatorAsh = new OperatorAsh();
    public static OperatorBandit operatorBandit = new OperatorBandit();
    public static OperatorCapitao operatorCapitao = new OperatorCapitao();
    public static OperatorDoc operatorDoc = new OperatorDoc();
    public static OperatorEcho operatorEcho = new OperatorEcho();
    public static OperatorEla operatorEla = new OperatorEla();
    public static OperatorFinka operatorFinka = new OperatorFinka();
    public static OperatorFrost operatorFrost = new OperatorFrost();
    public static OperatorJackal operatorJackal = new OperatorJackal();
    public static OperatorMaverick operatorMaverick = new OperatorMaverick();
    public static OperatorMute operatorMute = new OperatorMute();
    public static OperatorRook operatorRook = new OperatorRook();
    public static OperatorSledge operatorSledge = new OperatorSledge();
    public static OperatorSmoke operatorSmoke = new OperatorSmoke();
    public static OperatorThatcher operatorThatcher = new OperatorThatcher();
    public static OperatorThermite operatorThermite = new OperatorThermite();
    public static OperatorVigil operatorVigil = new OperatorVigil();
    public static OperatorVigilInvis operatorVigilInvis = new OperatorVigilInvis();


    public static void init() {
        for (Operator operator : operatorArrayList) operator.init();
    }
}
