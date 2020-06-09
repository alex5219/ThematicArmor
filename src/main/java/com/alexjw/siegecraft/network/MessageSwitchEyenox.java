package com.alexjw.siegecraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSwitchEyenox implements IMessageHandler<MessageSwitchEyenox, IMessage>, IMessage {
    public MessageSwitchEyenox() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageSwitchEyenox message, MessageContext ctx) {

        return null;
    }
}
