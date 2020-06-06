package com.alexjw.siegecraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSwitchERC7 implements IMessageHandler<MessageSwitchERC7, IMessage>, IMessage {
    public MessageSwitchERC7() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageSwitchERC7 message, MessageContext ctx) {

        return null;
    }
}
