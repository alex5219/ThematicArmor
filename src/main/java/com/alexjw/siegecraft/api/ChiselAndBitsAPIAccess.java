package com.alexjw.siegecraft.api;

import mod.chiselsandbits.api.ChiselsAndBitsAddon;
import mod.chiselsandbits.api.IChiselAndBitsAPI;
import mod.chiselsandbits.api.IChiselsAndBitsAddon;

@ChiselsAndBitsAddon
public class ChiselAndBitsAPIAccess implements IChiselsAndBitsAddon {
    public static IChiselAndBitsAPI apiInstance;

    @Override
    public void onReadyChiselsAndBits(IChiselAndBitsAPI api) {
        apiInstance = api;
    }
}
