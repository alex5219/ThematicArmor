package com.alexjw.thematicarmor.server.drugs;

import com.alexjw.thematicarmor.server.armors.ArmorManager;
import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffect;
import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffectDeadpool;
import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffects;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import net.minecraft.entity.player.EntityPlayer;

public class DrugChimichanga extends Drug {
    public DrugChimichanga() {
        super(20, 8, 3, DrugEffects.drugEffectDeadpool);
    }

    @Override
    public void onConsume(EntityPlayer entityPlayer) {
        int didFire = 0;

        while (!(didFire >= count)) {
            for (DrugEffect drugEffect : buffs) {
                if (random.nextInt(100) <= drugEffect.getChance()) {
                    if (drugEffect instanceof DrugEffectDeadpool) {
                        if (ThematicHelper.getTheme(entityPlayer) != null) {
                            if (ThematicHelper.getTheme(entityPlayer).equals(ArmorManager.armorDeadpool)) {
                                drugEffect.onConsume(entityPlayer, this);
                            } else {
                                DrugEffects.drugEffectPotion.onConsume(entityPlayer, this);
                            }
                        } else {
                            DrugEffects.drugEffectPotion.onConsume(entityPlayer, this);
                        }
                    }
                    didFire++;
                }
            }
        }
    }
}
