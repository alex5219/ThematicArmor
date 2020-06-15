package com.alexjw.siegecraft.server.items.guns;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.client.event.ClientEventHandler;
import com.alexjw.siegecraft.network.MessageShootPistol;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import com.alexjw.siegecraft.server.entity.EntityStim;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.items.ModItems;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemStimPistol extends Item implements IGun {
    private float weaponZoom;

    public ItemStimPistol() {
        this.maxStackSize = 1;
        this.setUnlocalizedName("doc_stim_pistol");
        this.setRegistryName(Siege.MODID, "doc_stim_pistol");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        this.weaponZoom = 0.35f;
        ModItems.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List list, ITooltipFlag iTooltipFlag) {
        if (getAmmo(itemstack) != -1) {
            list.add(TextFormatting.GRAY + "Ammo: " + getAmmo(itemstack) + "/1");
        }
    }

    public boolean onLeftClickEntity(ItemStack p_onLeftClickEntity_1_, EntityPlayer p_onLeftClickEntity_2_, Entity p_onLeftClickEntity_3_) {
        return false;
    }

    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 72000;
    }

    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.BOW;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return false;
    }

    @Override
    public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
        return EnumActionResult.FAIL;
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand enumHand) {
        ItemStack itemstack = entityPlayer.getHeldItem(enumHand);
        if (world.isRemote) {
            ClientEventHandler.isZooming = !ClientEventHandler.isZooming;
        }
        return new ActionResult(EnumActionResult.PASS, itemstack);
    }

    public boolean onLeftClick(ItemStack itemStack, EntityPlayer entityPlayer) {
        SiegeNetworkHandler.wrapper.sendToServer(new MessageShootPistol());
        return true;
    }

    public void onServerFire(ItemStack itemStack, EntityPlayer entityPlayer) {
        World world = entityPlayer.getEntityWorld();
        if (!entityPlayer.getCooldownTracker().hasCooldown(this)) {
            if (isLoaded(itemStack)) {
                if (getAmmo(itemStack) > 0 && !world.isRemote) {
                    EntityStim entityStim = new EntityStim(world, entityPlayer);
                    entityStim.shoot(entityPlayer, entityPlayer.rotationPitch, entityPlayer.rotationYaw, 0.0F, 100 * 3.0F, 1.0F);
                    world.spawnEntity(entityStim);
                    entityPlayer.getCooldownTracker().setCooldown(this, 10);
                    consumeAmmo(itemStack);
                } else {
                    attemptReload(entityPlayer, itemStack);
                }
            } else {
                attemptReload(entityPlayer, itemStack);
            }
        }
    }

    public float getWeaponZoom() {
        return weaponZoom;
    }

    public boolean isLoaded(ItemStack itemStack) {
        return getAmmo(itemStack) > 0;
    }

    public int getAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound == null) {
            nbtTagCompound = new NBTTagCompound();
            nbtTagCompound.setInteger("weaponAmmo", 0);
        }
        return nbtTagCompound.getInteger("weaponAmmo");
    }

    public void consumeAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound == null) {
            nbtTagCompound = new NBTTagCompound();
        }
        nbtTagCompound.setInteger("weaponAmmo", (nbtTagCompound.getInteger("weaponAmmo") - 1));
    }

    public void attemptReload(EntityPlayer entityPlayer, ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (SiegeHelper.hasAmmo(entityPlayer) && !isLoaded(itemStack)) {
            ItemStack ammo = SiegeHelper.findAmmo(entityPlayer);
            if (!entityPlayer.capabilities.isCreativeMode) {
                ammo.shrink(1);
                if (ammo.isEmpty()) {
                    entityPlayer.inventory.deleteStack(ammo);
                }
            }
            entityPlayer.getCooldownTracker().setCooldown(this, 45);
            if (nbtTagCompound == null) {
                nbtTagCompound = new NBTTagCompound();
                nbtTagCompound.setInteger("weaponAmmo", 1);
            }
            nbtTagCompound.setInteger("weaponAmmo", 1);
            entityPlayer.getHeldItemMainhand().setTagCompound(nbtTagCompound);
        }
    }
}
