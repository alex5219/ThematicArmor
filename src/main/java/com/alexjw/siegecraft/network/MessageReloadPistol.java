package com.alexjw.siegecraft.network;

import com.alexjw.siegecraft.server.items.ModItems;
import com.alexjw.siegecraft.server.items.guns.ItemStimPistol;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageReloadPistol implements IMessageHandler<MessageReloadPistol, IMessage>, IMessage {

    public MessageReloadPistol() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageReloadPistol message, MessageContext ctx) {
        if (ctx.side.isServer()) {
            EntityPlayer entityPlayer = ctx.getServerHandler().player;
            if (entityPlayer.getHeldItemMainhand().getItem().equals(ModItems.itemStimPistol)) {
                ItemStimPistol itemStimPistol = (ItemStimPistol) entityPlayer.getHeldItemMainhand().getItem();
                itemStimPistol.attemptReload(entityPlayer, entityPlayer.getHeldItemMainhand());
            }
        }

        return null;
    }
}

