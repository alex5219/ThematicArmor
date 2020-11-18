package com.alexjw.thematicarmor.server.drugs;

import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffects;

public class DrugChimichanga extends Drug {
    public DrugChimichanga() {
        super(3, 8, 3, DrugEffects.drugEffectScramble, DrugEffects.drugEffectFire, DrugEffects.drugEffectPotion);
    }
}
