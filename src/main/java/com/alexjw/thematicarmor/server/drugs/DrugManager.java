package com.alexjw.thematicarmor.server.drugs;

import java.util.ArrayList;

public class DrugManager {
    public static ArrayList<Drug> drugs = new ArrayList<>();
    public static DrugChimichanga drugChimiChanga = new DrugChimichanga();

    public static void registerDrugs() {
        for (Drug drug : drugs) drug.init();
    }
}
