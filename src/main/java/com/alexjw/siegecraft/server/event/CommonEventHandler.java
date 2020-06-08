package com.alexjw.siegecraft.server.event;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.network.MessagePlayerUpdate;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import com.alexjw.siegecraft.server.blocks.ModBlocks;
import com.alexjw.siegecraft.server.data.SiegeData;
import com.alexjw.siegecraft.server.entity.EntityCamera;
import com.alexjw.siegecraft.server.entity.EntityFootprint;
import com.alexjw.siegecraft.server.entity.EntityRope;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.Operator;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.HashMap;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Siege.MODID)
public class CommonEventHandler {
    private static HashMap<EntityPlayer, Integer> timeSinceFootStep = new HashMap<>();
    private static Random random = new Random();

    @SubscribeEvent
    public static void footPrint(TickEvent.PlayerTickEvent event) {
        EntityPlayer entityPlayer = event.player;
        if (SiegeHelper.getOperator(entityPlayer) != null) {
            if (SiegeHelper.getOperator(entityPlayer).getEnumTeam().equals(Operator.Team.DEFENDER)) {
                if (timeSinceFootStep.get(entityPlayer) != null) {
                    timeSinceFootStep.put(entityPlayer, timeSinceFootStep.get(entityPlayer) + 1);
                } else {
                    timeSinceFootStep.put(entityPlayer, 0);
                }
                if (timeSinceFootStep.get(entityPlayer) > 13 && random.nextInt(12) == 1 && SiegeHelper.getOperator(entityPlayer) != null) {
                    EntityFootprint entityFootprint = new EntityFootprint(entityPlayer.world);
                    switch (random.nextInt(4)) {
                        case 0:
                            entityFootprint.setLocationAndAngles(entityPlayer.posX + random.nextFloat() / 3, entityPlayer.posY, entityPlayer.posZ + random.nextFloat() / 3, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
                            break;
                        case 1:
                            entityFootprint.setLocationAndAngles(entityPlayer.posX - random.nextFloat() / 3, entityPlayer.posY, entityPlayer.posZ + random.nextFloat() / 3, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
                            break;
                        case 2:
                            entityFootprint.setLocationAndAngles(entityPlayer.posX + random.nextFloat() / 3, entityPlayer.posY, entityPlayer.posZ - random.nextFloat() / 3, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
                            break;
                        case 3:
                            entityFootprint.setLocationAndAngles(entityPlayer.posX - random.nextFloat() / 3, entityPlayer.posY, entityPlayer.posZ - random.nextFloat() / 3, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
                            break;
                    }
                    entityPlayer.world.spawnEntity(entityFootprint);
                    timeSinceFootStep.put(entityPlayer, 0);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onRide(EntityMountEvent event) {
        if (event.isDismounting()) {
            if (event.getEntityMounting() instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer) event.getEntityBeingMounted();
                if (SiegeHelper.isDroning(entityPlayer)) {
                    SiegeHelper.exitCamera(entityPlayer);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onJoin(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            SiegeData.gameStart(event.getWorld());
        }
    }

    @SubscribeEvent
    public static void onSuffocate(LivingDamageEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntityLiving();

            if (SiegeHelper.isDroning(entityPlayer)) {
                if (event.getSource().equals(DamageSource.IN_WALL)) {
                    event.setCanceled(true);
                }
            }
        }
        if (event.getEntity() instanceof EntityCamera) {
            if (event.getSource().equals(DamageSource.IN_WALL)) {
                event.setCanceled(true);
            }
        }
        if (event.getEntity() instanceof EntityRope) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        if (SiegeHelper.isDroning(event.player)) {
            event.player.noClip = true;
            if (event.side.isServer()) {
                SiegeNetworkHandler.wrapper.sendToServer(new MessagePlayerUpdate(0.25f));
            } else if (event.side.isClient()) {
                event.player.eyeHeight = 0.35f;
                double d0 = (double) event.player.width / 2.0D;
                AxisAlignedBB droneBox = new AxisAlignedBB(event.player.posX - d0, event.player.posY, event.player.posZ - d0, event.player.posX + d0, event.player.posY + (double) event.player.height, event.player.posZ + d0);
                event.player.setEntityBoundingBox(new AxisAlignedBB(droneBox.minX, droneBox.minY, droneBox.minZ, droneBox.minX + (double) event.player.width, droneBox.minY + 0.25, droneBox.minZ + (double) event.player.width));
            }
            if (SiegeData.lastJump.get(event.player) == null) {
                SiegeData.lastJump.put(event.player, 0);
            } else {
                SiegeData.lastJump.put(event.player, SiegeData.lastJump.get(event.player) + 1);
            }
            if (SiegeData.timeDroning.get(event.player) == null) {
                SiegeData.timeDroning.put(event.player, 0);
            } else {
                SiegeData.timeDroning.put(event.player, SiegeData.timeDroning.get(event.player) + 1);
            }
        } else {
            event.player.eyeHeight = event.player.getDefaultEyeHeight();
        }
    }


    @SubscribeEvent
    public static void onDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntity();

            if (SiegeHelper.isDroning(entityPlayer)) {
                event.setCanceled(true);
                SiegeHelper.stopDroning(entityPlayer, entityPlayer.world);
            } else {
                /*
                  TODO:
                  - Death event for the game
                 */
            }
        } else if (event.getEntity() instanceof EntityCamera) {
            EntityCamera entityCamera = (EntityCamera) event.getEntity();
            entityCamera.getEntityWorld().setBlockState(entityCamera.getPosition(), ModBlocks.blockCamera.getDefaultState());
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onJump(LivingEvent.LivingJumpEvent event) {

        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntityLiving();
            if (SiegeHelper.getOperator(entityPlayer) != null) {
                /*
                  TODO:
                  - Prevent taking off armor
                 */
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
                if (entityPlayer.world.getBlockState(blockPosInfront).getBlock() instanceof BlockAir) {
                    entityPlayer.setVelocity(entityPlayer.motionX, entityPlayer.motionY * 0, entityPlayer.motionZ);
                }
            } else if (SiegeHelper.isDroning(entityPlayer)) {
                if (SiegeData.lastJump.get(entityPlayer) == null) {
                    SiegeData.lastJump.put(entityPlayer, 0);
                } else {
                    if ((SiegeData.lastJump.get(entityPlayer) / 20) >= 6) {
                        SiegeData.lastJump.put(entityPlayer, 0);
                    } else {
                        entityPlayer.setVelocity(entityPlayer.motionX, entityPlayer.motionY * 0, entityPlayer.motionZ);
                    }
                }
            }
        }
    }
}
