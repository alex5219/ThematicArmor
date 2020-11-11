package com.alexjw.thematicarmor.client.renderer;

import com.alexjw.thematicarmor.client.model.operators.*;
import com.alexjw.thematicarmor.client.model.southpark.ModelRandy;
import com.alexjw.thematicarmor.client.model.supes.ModelBatman;
import com.alexjw.thematicarmor.client.model.theboys.ModelBillyButcher;
import com.alexjw.thematicarmor.client.model.walkingdead.ModelRickGrimes;
import com.alexjw.thematicarmor.server.armors.ArmorManager;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SiegeRendererManager {
    public static ArrayList<SiegeRenderer> siegeRenderers = new ArrayList<>();
    public static SiegeRenderer ash = new SiegeRenderer(ArmorManager.operatorAsh, new ModelOperatorAsh());
    public static SiegeRenderer bandit = new SiegeRenderer(ArmorManager.operatorBandit, new ModelOperatorBandit());
    public static SiegeRenderer batman = new SiegeRenderer(ArmorManager.armorBatman, new ModelBatman());
    public static SiegeRenderer billybutcher = new SiegeRenderer(ArmorManager.boysBillyButcher, new ModelBillyButcher());
    public static SiegeRenderer buck = new SiegeRenderer(ArmorManager.operatorBuck, new ModelOperatorBuck());
    public static SiegeRenderer capitao = new SiegeRenderer(ArmorManager.operatorCapitao, new ModelOperatorCapitao());
    public static SiegeRenderer doc = new SiegeRenderer(ArmorManager.operatorDoc, new ModelOperatorDoc());
    public static SiegeRenderer echo = new SiegeRenderer(ArmorManager.operatorEcho, new ModelOperatorEcho());
    public static SiegeRenderer ela = new SiegeRenderer(ArmorManager.operatorEla, new ModelOperatorEla());
    public static SiegeRenderer finka = new SiegeRenderer(ArmorManager.operatorFinka, new ModelOperatorFinka());
    public static SiegeRenderer frost = new SiegeRenderer(ArmorManager.operatorFrost, new ModelOperatorFrost());
    public static SiegeRenderer jackal = new SiegeRenderer(ArmorManager.operatorJackal, new ModelOperatorJackal());
    public static SiegeRenderer maverick = new SiegeRenderer(ArmorManager.operatorMaverick, new ModelOperatorMaverick());
    public static SiegeRenderer mozzie = new SiegeRenderer(ArmorManager.operatorMozzie, new ModelOperatorMozzie());
    public static SiegeRenderer mute = new SiegeRenderer(ArmorManager.operatorMute, new ModelOperatorMute());
    public static SiegeRenderer rook = new SiegeRenderer(ArmorManager.operatorRook, new ModelOperatorRook());
    public static SiegeRenderer sledge = new SiegeRenderer(ArmorManager.operatorSledge, new ModelOperatorSledge());
    public static SiegeRenderer smoke = new SiegeRenderer(ArmorManager.operatorSmoke, new ModelOperatorSmoke());
    public static SiegeRenderer tachanka = new SiegeRenderer(ArmorManager.operatorTachanka, new ModelOperatorTachanka());
    public static SiegeRenderer thatcher = new SiegeRenderer(ArmorManager.operatorThatcher, new ModelOperatorThatcher());
    public static SiegeRenderer thermite = new SiegeRenderer(ArmorManager.operatorThermite, new ModelOperatorThermite());
    public static SiegeRenderer vigil = new SiegeRenderer(ArmorManager.operatorVigil, new ModelOperatorVigil());
    public static SiegeRenderer rick = new SiegeRenderer(ArmorManager.wdRickGrimes, new ModelRickGrimes());
    public static SiegeRenderer randy = new SiegeRenderer(ArmorManager.spRandy, new ModelRandy());
    public static SiegeRenderer smokeelite = new SiegeRenderer(ArmorManager.operatorSmokeElite, new ModelOperatorSmokeElite());
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