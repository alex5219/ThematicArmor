package com.alexjw.siegecraft.network;

import com.alexjw.siegecraft.server.data.SiegeData;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSwitchCamera implements IMessageHandler<MessageSwitchCamera, IMessage>, IMessage {
    private int sideSwitched;

    public MessageSwitchCamera() {
    }

    public MessageSwitchCamera(int sideSwitched) {
        this.sideSwitched = sideSwitched;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        sideSwitched = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(sideSwitched);
    }

    @Override
    public IMessage onMessage(MessageSwitchCamera message, MessageContext ctx) {
        EntityPlayer entityPlayer;
        if (ctx.side.isServer()) {
            entityPlayer = ctx.getServerHandler().player;
            if (!SiegeData.viewingCamera.containsKey(entityPlayer))
                SiegeData.viewingCamera.put(entityPlayer, 0);
            else {
                if (sideSwitched == 1) {
                    if (SiegeData.getCameras().size() > SiegeData.viewingCamera.get(entityPlayer) + 1) {
                        SiegeData.viewingCamera.put(entityPlayer, SiegeData.viewingCamera.get(entityPlayer) + 1);
                    }
                } else {
                    if (SiegeData.getCameras().size() > SiegeData.viewingCamera.get(entityPlayer) - 1) {
                        SiegeData.viewingCamera.put(entityPlayer, SiegeData.viewingCamera.get(entityPlayer) - 1);
                    }
                }
            }
            SiegeHelper.updateCamera(entityPlayer);
        }

        return null;
    }
}

