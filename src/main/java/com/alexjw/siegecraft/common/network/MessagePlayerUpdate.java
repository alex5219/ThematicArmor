package com.alexjw.siegecraft.common.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.ArrayList;

public class MessagePlayerUpdate implements IMessageHandler<MessagePlayerUpdate, IMessage>, IMessage {
    private float playerSize;

    public MessagePlayerUpdate() {
    }

    public MessagePlayerUpdate(float playerSize) {
        this.playerSize = playerSize;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        playerSize = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeFloat(playerSize);
    }

    @Override
    public IMessage onMessage(MessagePlayerUpdate message, MessageContext ctx) {
        if (ctx.side.isServer()) {
            ArrayList<EntityPlayer> playerEntities = (ArrayList<EntityPlayer>) ctx.getServerHandler().player.world.playerEntities;

            for (EntityPlayer entityPlayer : playerEntities) {
                double d0 = (double) entityPlayer.width / 2.0D;
                AxisAlignedBB droneBox = new AxisAlignedBB(entityPlayer.posX - d0, entityPlayer.posY, entityPlayer.posZ - d0, entityPlayer.posX + d0, entityPlayer.posY + (double) entityPlayer.height, entityPlayer.posZ + d0);
                entityPlayer.setEntityBoundingBox(new AxisAlignedBB(droneBox.minX, droneBox.minY, droneBox.minZ, droneBox.minX + (double) entityPlayer.width, droneBox.minY + (double) message.playerSize, droneBox.minZ + (double) entityPlayer.width));
            }
        }

        return null;
    }
}

