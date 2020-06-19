package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.client.model.operators.*;
import com.alexjw.siegecraft.server.operators.Operator;
import com.alexjw.siegecraft.server.operators.OperatorManager;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SiegeRendererManager {
    public static ArrayList<SiegeRenderer> siegeRenderers = new ArrayList<>();
    public static SiegeRenderer ash = new SiegeRenderer(OperatorManager.operatorAsh, new ModelOperatorAsh());
    public static SiegeRenderer bandit = new SiegeRenderer(OperatorManager.operatorBandit, new ModelOperatorBandit());
    public static SiegeRenderer capitao = new SiegeRenderer(OperatorManager.operatorCapitao, new ModelOperatorCapitao());
    public static SiegeRenderer doc = new SiegeRenderer(OperatorManager.operatorDoc, new ModelOperatorDoc());
    public static SiegeRenderer echo = new SiegeRenderer(OperatorManager.operatorEcho, new ModelOperatorEcho());
    public static SiegeRenderer ela = new SiegeRenderer(OperatorManager.operatorEla, new ModelOperatorEla());
    public static SiegeRenderer finka = new SiegeRenderer(OperatorManager.operatorFinka, new ModelOperatorFinka());
    public static SiegeRenderer frost = new SiegeRenderer(OperatorManager.operatorFrost, new ModelOperatorFrost());
    public static SiegeRenderer jackal = new SiegeRenderer(OperatorManager.operatorJackal, new ModelOperatorJackal());
    public static SiegeRenderer maverick = new SiegeRenderer(OperatorManager.operatorMaverick, new ModelOperatorMaverick());
    public static SiegeRenderer mute = new SiegeRenderer(OperatorManager.operatorMute, new ModelOperatorMute());
    public static SiegeRenderer rook = new SiegeRenderer(OperatorManager.operatorRook, new ModelOperatorRook());
    public static SiegeRenderer sledge = new SiegeRenderer(OperatorManager.operatorSledge, new ModelOperatorSledge());
    public static SiegeRenderer smoke = new SiegeRenderer(OperatorManager.operatorSmoke, new ModelOperatorSmoke());
    public static SiegeRenderer thatcher = new SiegeRenderer(OperatorManager.operatorThatcher, new ModelOperatorThatcher());
    public static SiegeRenderer thermite = new SiegeRenderer(OperatorManager.operatorThermite, new ModelOperatorThermite());
    public static SiegeRenderer vigil = new SiegeRenderer(OperatorManager.operatorVigil, new ModelOperatorVigil());
    public static SiegeRenderer vigilinvis = new SiegeRenderer(OperatorManager.operatorVigilInvis, new ModelOperatorVigil());

    public static void register() {
        Field[] fields = SiegeRendererManager.class.getFields();

        for (Field field : fields) {
            if (field.getType().equals(SiegeRenderer.class)) {
                try {
                    siegeRenderers.add((SiegeRenderer) field.get(null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
