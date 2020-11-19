package com.alexjw.thematicarmor.server.drugs;

import com.alexjw.thematicarmor.server.drugs.modifiers.DrugEffects;

public class DrugChimichanga extends Drug {
    public DrugChimichanga() {
        super(20, 8, 3, DrugEffects.drugEffectScramble, DrugEffects.drugEffectPotion);
    }
}
