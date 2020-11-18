package com.alexjw.thematicarmor.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Random;

public class MessageScrambleInventory implements IMessageHandler<MessageScrambleInventory, IMessage>, IMessage {
    private Random random = new Random();

    public MessageScrambleInventory() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageScrambleInventory message, MessageContext ctx) {
        EntityPlayer player = null;

        if (ctx.side.isClient()) {
            player = Minecraft.getMinecraft().player;
        }

        if (ctx.side.isServer()) {
            player = ctx.getServerHandler().player;
        }

        if (player != null) {
        }
        return null;
    }
}