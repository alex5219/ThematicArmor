package com.alexjw.siegecraft.network;

import io.netty.buffer.ByteBuf;
import mod.chiselsandbits.chiseledblock.data.BitLocation;
import mod.chiselsandbits.helpers.BitOperation;
import mod.chiselsandbits.modes.ChiselMode;
import mod.chiselsandbits.network.NetworkRouter;
import mod.chiselsandbits.network.packets.PacketChisel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageBlowtorch implements IMessageHandler<MessageBlowtorch, IMessage>, IMessage {
    public MessageBlowtorch() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageBlowtorch message, MessageContext ctx) {
        if (ctx.side.isServer()) {
            EntityPlayer playerIn = ctx.getServerHandler().player;
            RayTraceResult rayTraceResult = playerIn.rayTrace(1, 5);
            if (rayTraceResult != null) {
                if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.BLOCK)) {
                    EnumFacing enumFacing = rayTraceResult.sideHit;
                    BitLocation location = new BitLocation(rayTraceResult, true, BitOperation.CHISEL);
                    PacketChisel pc = new PacketChisel(BitOperation.CHISEL, location, enumFacing, ChiselMode.CUBE_LARGE, EnumHand.MAIN_HAND);
                    NetworkRouter.instance.sendToServer(pc);
                } else if (rayTraceResult.typeOfHit.equals(RayTraceResult.Type.ENTITY)) {
                    Entity entityHit = rayTraceResult.entityHit;
                    if (entityHit instanceof EntityPlayer) {
                        EntityPlayer entityPlayerHit = (EntityPlayer) entityHit;
                        if (entityPlayerHit.canAttackPlayer(playerIn)) {
                            entityPlayerHit.attackEntityFrom(DamageSource.causePlayerDamage(entityPlayerHit), 0.25f);
                        }
                    }
                }
            }
        }
        return null;
    }
}
