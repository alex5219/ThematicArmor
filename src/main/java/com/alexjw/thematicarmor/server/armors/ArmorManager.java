package com.alexjw.thematicarmor.server.armors;

import java.util.ArrayList;

public class ArmorManager {
    public static ArrayList<Armor> armorArrayList = new ArrayList<>();
    public static ArmorBillyButcher boysBillyButcher = new ArmorBillyButcher();
    public static ArmorAsh operatorAsh = new ArmorAsh();
    public static ArmorBandit operatorBandit = new ArmorBandit();
    public static ArmorBatman armorBatman = new ArmorBatman();
    public static ArmorBuck operatorBuck = new ArmorBuck();
    public static ArmorCapitao operatorCapitao = new ArmorCapitao();
    public static ArmorDoc operatorDoc = new ArmorDoc();
    public static ArmorEcho operatorEcho = new ArmorEcho();
    public static ArmorEla operatorEla = new ArmorEla();
    public static ArmorFinka operatorFinka = new ArmorFinka();
    public static ArmorFrost operatorFrost = new ArmorFrost();
    public static ArmorJackal operatorJackal = new ArmorJackal();
    public static ArmorMaverick operatorMaverick = new ArmorMaverick();
    public static ArmorMozzie operatorMozzie = new ArmorMozzie();
    public static ArmorMute operatorMute = new ArmorMute();
    public static ArmorRook operatorRook = new ArmorRook();
    public static ArmorSledge operatorSledge = new ArmorSledge();
    public static ArmorSmoke operatorSmoke = new ArmorSmoke();
    public static ArmorTachanka operatorTachanka = new ArmorTachanka();
    public static ArmorThatcher operatorThatcher = new ArmorThatcher();
    public static ArmorThermite operatorThermite = new ArmorThermite();
    public static ArmorVigil operatorVigil = new ArmorVigil();
    public static ArmorRickGrimes wdRickGrimes = new ArmorRickGrimes();
    public static ArmorRandy spRandy = new ArmorRandy();
    public static ArmorSmokeElite operatorSmokeElite = new ArmorSmokeElite();

    public static void init() {
        for (Armor armor : armorArrayList) armor.init();
    }
}
