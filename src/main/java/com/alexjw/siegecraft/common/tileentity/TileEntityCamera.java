package com.alexjw.siegecraft.common.tileentity;

import com.alexjw.siegecraft.common.data.SiegeData;
import com.alexjw.siegecraft.common.entity.EntityCamera;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityCamera extends TileEntity implements ITickable {

    public void update() {
        if (!world.isRemote) {
            SiegeData.setGameSetup(false);
            world.setBlockToAir(pos);
            EntityCamera entityCamera = new EntityCamera(world);
            entityCamera.setNoGravity(true);
            entityCamera.setPositionAndUpdate(pos.getX() + 0.5d, pos.getY(), pos.getZ() + 0.5d);
            world.spawnEntity(entityCamera);
            SiegeData.addCamera(entityCamera);
        }
    }
}
