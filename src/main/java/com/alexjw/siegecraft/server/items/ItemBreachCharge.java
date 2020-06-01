package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.sounds.SiegeSounds;
import net.minecraft.command.CommandException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketTitle;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.world.World;

public class ItemBreachCharge extends Item {
    public ItemBreachCharge() {
        super();
        this.setUnlocalizedName("breach_charge");
        this.setRegistryName(Siege.MODID, "breach_charge");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.getBlockState(pos).getBlockHardness(worldIn, pos) <= 4 && !(worldIn.getBlockState(pos).getBlockHardness(worldIn, pos) == -1)) {
            NBTTagCompound nbtTagCompound = player.getHeldItemMainhand().getTagCompound();
            int[] blockPos = new int[3];
            blockPos[0] = pos.getX();
            blockPos[1] = pos.getY();
            blockPos[2] = pos.getZ();
            if (nbtTagCompound == null) {
                NBTTagCompound nbtTagCompound2 = new NBTTagCompound();
                nbtTagCompound2.setBoolean("isIgnited", true);
                nbtTagCompound2.setInteger("ignitedTime", 120);
                nbtTagCompound2.setIntArray("blockPos", blockPos);
                player.getHeldItemMainhand().setTagCompound(nbtTagCompound2);
            } else {
                nbtTagCompound.setBoolean("isIgnited", true);
                nbtTagCompound.setInteger("ignitedTime", 120);
                nbtTagCompound.setIntArray("blockPos", blockPos);
                player.getHeldItemMainhand().setTagCompound(nbtTagCompound);
            }
            worldIn.playSound(player, new BlockPos(blockPos[0], blockPos[1], blockPos[2]), SiegeSounds.breach_charge, SoundCategory.PLAYERS, .9f, 1);
            player.playSound(SiegeSounds.breach_charge, 1f, 1f);
            SiegeSounds.PlaySoundForPlayer(player, SiegeSounds.breach_charge, 1f, 1f);
            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.FAIL;
        }
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int metadata, boolean bool) {
        if (itemstack.getTagCompound() == null) {
            NBTTagCompound nbtTagCompound = new NBTTagCompound();
            nbtTagCompound.setBoolean("isIgnited", false);
            nbtTagCompound.setInteger("ignitedTime", -1);
            itemstack.setTagCompound(nbtTagCompound);
        } else {
            NBTTagCompound nbtTagCompound = itemstack.getTagCompound();
            if (nbtTagCompound.getBoolean("isIgnited")) {
                int[] blockPos = nbtTagCompound.getIntArray("blockPos");
                if (nbtTagCompound.getInteger("ignitedTime") == 0) {
                    int radius = 1;
                    int x = blockPos[0] - 1;
                    int y = blockPos[1] - 1;
                    int z = blockPos[2] - 1;
                    AxisAlignedBB axisAlignedBB = new AxisAlignedBB(x, y, z, x + 1, y + 1, z + 1).expand(radius, radius, radius);
                    removeBlocks(axisAlignedBB, world);
                    nbtTagCompound.setBoolean("isIgnited", false);
                    nbtTagCompound.setInteger("ignitedTime", -1);
                    itemstack.setTagCompound(nbtTagCompound);
                } else {
                    nbtTagCompound.setInteger("ignitedTime", nbtTagCompound.getInteger("ignitedTime") - 1);
                }
                if (entity instanceof EntityPlayerMP) {
                    EntityPlayerMP player = (EntityPlayerMP) entity;
                    try {
                        SPacketTitle title = new SPacketTitle(SPacketTitle.Type.TITLE, TextComponentUtils.processComponent(player, new TextComponentString("" + nbtTagCompound.getInteger("ignitedTime") / 20), player), 0, 0, 0);
                        player.connection.sendPacket(title);
                    } catch (CommandException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void removeBlocks(AxisAlignedBB aabb, World world) {
        int i = MathHelper.floor(aabb.minX);
        int j = MathHelper.floor(aabb.maxX + 1.0D);
        int k = MathHelper.floor(aabb.minY);
        int l = MathHelper.floor(aabb.maxY + 1.0D);
        int i1 = MathHelper.floor(aabb.minZ);
        int j1 = MathHelper.floor(aabb.maxZ + 1.0D);

        for (int k1 = i; k1 < j; ++k1) {
            for (int l1 = k; l1 < l; ++l1) {
                for (int i2 = i1; i2 < j1; ++i2) {
                    world.destroyBlock(new BlockPos(k1, l1, i2), false);
                    world.spawnParticle(EnumParticleTypes.PORTAL, k1 * 0.25D * 0.6D - 0.3D, l1 * 0.25D - 0.5D, i1 * 0.25D * 0.6D - 0.3D, 0, 0, 0);
                }
            }
        }
    }
}
