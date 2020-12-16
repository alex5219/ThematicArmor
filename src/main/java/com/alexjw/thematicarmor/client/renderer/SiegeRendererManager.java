package com.alexjw.thematicarmor.client.renderer;

import com.alexjw.thematicarmor.client.model.games.ModelAmongUs;
import com.alexjw.thematicarmor.client.model.games.ModelJoel;
import com.alexjw.thematicarmor.client.model.games.ModelMario;
import com.alexjw.thematicarmor.client.model.games.ModelWoods;
import com.alexjw.thematicarmor.client.model.operators.*;
import com.alexjw.thematicarmor.client.model.southpark.ModelRandy;
import com.alexjw.thematicarmor.client.model.supes.*;
import com.alexjw.thematicarmor.client.model.theboys.ModelBillyButcher;
import com.alexjw.thematicarmor.client.model.walkingdead.ModelMichonne;
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
    public static SiegeRenderer mario = new SiegeRenderer(ArmorManager.gameMario, new ModelMario());
    public static SiegeRenderer deadpool = new SiegeRenderer(ArmorManager.armorDeadpool, new ModelDeadpool());
    public static SiegeRenderer joker = new SiegeRenderer(ArmorManager.armorJoker, new ModelJoker());
    public static SiegeRenderer amongus = new SiegeRenderer(ArmorManager.armorAmongUs, new ModelAmongUs());
    public static SiegeRenderer thelegend = new SiegeRenderer(ArmorManager.armorTheLegend, new ModelTheLegend());
    public static SiegeRenderer michonne = new SiegeRenderer(ArmorManager.armorMichonne, new ModelMichonne());
    public static SiegeRenderer catwoman = new SiegeRenderer(ArmorManager.armorCatwoman, new ModelCatwoman());
    public static SiegeRenderer woods = new SiegeRenderer(ArmorManager.armorWoods, new ModelWoods());
    public static SiegeRenderer joel = new SiegeRenderer(ArmorManager.armorJoel, new ModelJoel());

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