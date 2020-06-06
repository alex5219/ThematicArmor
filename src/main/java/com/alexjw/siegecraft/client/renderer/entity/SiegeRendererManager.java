package com.alexjw.siegecraft.client.renderer.entity;

import com.alexjw.siegecraft.client.model.operators.*;
import com.alexjw.siegecraft.server.operators.OperatorManager;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SiegeRendererManager {
    public static final ArrayList<SiegeRenderer> siegeRenderers = new ArrayList<>();
    public static final SiegeRenderer ash = new SiegeRenderer(OperatorManager.operatorAsh, new ModelOperatorAsh());
    public static final SiegeRenderer bandit = new SiegeRenderer(OperatorManager.operatorBandit, new ModelOperatorBandit());
    public static final SiegeRenderer doc = new SiegeRenderer(OperatorManager.operatorDoc, new ModelOperatorDoc());
    public static final SiegeRenderer capitao = new SiegeRenderer(OperatorManager.operatorCapitao, new ModelOperatorCapitao());
    public static final SiegeRenderer finka = new SiegeRenderer(OperatorManager.operatorFinka, new ModelOperatorFinka());
    public static final SiegeRenderer jackal = new SiegeRenderer(OperatorManager.operatorJackal, new ModelOperatorJackal());
    public static final SiegeRenderer maverick = new SiegeRenderer(OperatorManager.operatorMaverick, new ModelOperatorMaverick());
    public static final SiegeRenderer rook = new SiegeRenderer(OperatorManager.operatorRook, new ModelOperatorRook());
    public static final SiegeRenderer sledge = new SiegeRenderer(OperatorManager.operatorSledge, new ModelOperatorSledge());
    public static final SiegeRenderer smoke = new SiegeRenderer(OperatorManager.operatorSmoke, new ModelOperatorSmoke());
    public static final SiegeRenderer vigil = new SiegeRenderer(OperatorManager.operatorVigil, new ModelOperatorVigil());
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
