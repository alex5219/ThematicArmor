package com.alexjw.siegecraft.common.network;

import com.alexjw.siegecraft.common.data.SiegePlayer;
import com.alexjw.siegecraft.common.entity.EntityRope;
import com.alexjw.siegecraft.common.helper.SiegeHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageAttemptRappel implements IMessageHandler<MessageAttemptRappel, IMessage>, IMessage {
    public MessageAttemptRappel() {
    }

    @Override
    public void fromBytes(ByteBuf buf) {
    }

    @Override
    public void toBytes(ByteBuf buf) {
    }

    @Override
    public IMessage onMessage(MessageAttemptRappel message, MessageContext ctx) {
        if (ctx.side.isServer()) {
            EntityPlayer entityPlayer = ctx.getServerHandler().player;
            if (entityPlayer != null) {
                SiegePlayer siegePlayer = SiegeHelper.getSiegePlayerByEntity(entityPlayer);
                if (siegePlayer != null) {
                    BlockPos blockPosInfront;
                    EnumFacing enumFacing = entityPlayer.getHorizontalFacing();
                    switch (enumFacing) {
                        case EAST:
                            blockPosInfront = new BlockPos(entityPlayer.getPosition().getX() + 0.75, entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ());
                            break;
                        case WEST:
                            blockPosInfront = new BlockPos(entityPlayer.getPosition().getX() - 0.75, entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ());
                            break;
                        case NORTH:
                            blockPosInfront = new BlockPos(entityPlayer.getPosition().getX(), entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ() - 0.75);
                            break;
                        case SOUTH:
                            blockPosInfront = new BlockPos(entityPlayer.getPosition().getX(), entityPlayer.getPosition().getY(), entityPlayer.getPosition().getZ() + 0.75);
                            break;
                        default:
                            blockPosInfront = entityPlayer.getPosition();
                            break;
                    }
                    if (!(entityPlayer.world.getBlockState(blockPosInfront).getBlock() instanceof BlockAir)) {
                        entityPlayer.setVelocity(entityPlayer.motionX, entityPlayer.motionY * 0, entityPlayer.motionZ);
                        if (entityPlayer.world.canSeeSky(entityPlayer.getPosition())){
                            siegePlayer.setRepelling(!siegePlayer.isRapelling());
                            EntityRope entityRope = new EntityRope(entityPlayer.world);
                            entityRope.setEntityPlayer(siegePlayer);
                            siegePlayer.setEntityRope(entityRope);
                            entityPlayer.world.spawnEntity(entityRope);
                            siegePlayer.setEnumFacing(entityPlayer.getHorizontalFacing());
                        }
                    }
                }
            }
        }

        return null;
    }
}

