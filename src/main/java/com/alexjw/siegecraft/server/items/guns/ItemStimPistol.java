package com.alexjw.siegecraft.server.items.guns;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.entity.EntityStim;
import com.alexjw.siegecraft.server.items.ModItems;
import com.alexjw.siegecraft.server.items.ammo.ItemStim;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ItemStimPistol extends Item {
    public ItemStimPistol() {
        this.maxStackSize = 1;
        this.setUnlocalizedName("stim_pistol");
        this.setRegistryName(Siege.MODID, "stim_pistol");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack itemStack, @Nullable World world, @Nullable EntityLivingBase entityLivingBase) {
                if (entityLivingBase == null) {
                    return 0.0F;
                } else {
                    return entityLivingBase.getActiveItemStack().getItem() != Items.BOW ? 0.0F : (float) (itemStack.getMaxItemUseDuration() - entityLivingBase.getItemInUseCount()) / 20.0F;
                }
            }
        });
        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack itemStack, @Nullable World world, @Nullable EntityLivingBase entityLivingBase) {
                return entityLivingBase != null && entityLivingBase.isHandActive() && entityLivingBase.getActiveItemStack() == itemStack ? 1.0F : 0.0F;
            }
        });
    }

    public static float getArrowVelocity(int getArrowVelocity) {
        float f = (float) getArrowVelocity / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    private ItemStack findAmmo(EntityPlayer entityPlayer) {
        if (this.isAmmo(entityPlayer.getHeldItem(EnumHand.OFF_HAND))) {
            return entityPlayer.getHeldItem(EnumHand.OFF_HAND);
        } else if (this.isAmmo(entityPlayer.getHeldItem(EnumHand.MAIN_HAND))) {
            return entityPlayer.getHeldItem(EnumHand.MAIN_HAND);
        } else {
            for (int i = 0; i < entityPlayer.inventory.getSizeInventory(); ++i) {
                ItemStack itemstack = entityPlayer.inventory.getStackInSlot(i);
                if (this.isAmmo(itemstack)) {
                    return itemstack;
                }
            }
            return ItemStack.EMPTY;
        }
    }

    protected boolean isAmmo(ItemStack itemStack) {
        return itemStack.getItem() instanceof ItemStim;
    }

    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityLivingBase entityLivingBase, int playerStoppedUsing) {
        if (entityLivingBase instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer) entityLivingBase;
            boolean flag = entityplayer.capabilities.isCreativeMode;
            ItemStack itemstack = this.findAmmo(entityplayer);
            int i = this.getMaxItemUseDuration(itemStack) - playerStoppedUsing;
            i = ForgeEventFactory.onArrowLoose(itemStack, world, entityplayer, i, !itemstack.isEmpty() || flag);
            if (i < 0) {
                return;
            }

            if (!itemstack.isEmpty() || flag) {
                if (itemstack.isEmpty()) {
                    itemstack = new ItemStack(Items.ARROW);
                }

                float f = getArrowVelocity(i);
                if ((double) f >= 0.1D) {
                    boolean flag1 = entityplayer.capabilities.isCreativeMode || itemstack.getItem() instanceof ItemArrow && ((ItemArrow) itemstack.getItem()).isInfinite(itemstack, itemStack, entityplayer);
                    if (!world.isRemote) {
                        ItemStim itemAmmo = itemstack.getItem() instanceof ItemStim ? itemstack.getItem() : Items.ARROW;
                        EntityStim entityStim = itemAmmo.createBullet(world, itemstack, entityplayer);
                        entityStim.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);
                        itemStack.damageItem(1, entityplayer);
                        world.spawnEntity(entityStim);
                    }

                    world.playSound(null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
                    if (!flag1 && !entityplayer.capabilities.isCreativeMode) {
                        itemstack.shrink(1);
                        if (itemstack.isEmpty()) {
                            entityplayer.inventory.deleteStack(itemstack);
                        }
                    }

                    entityplayer.addStat(StatList.getObjectUseStats(this));
                }
            }
        }

    }

    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 72000;
    }

    public EnumAction getItemUseAction(ItemStack itemStack) {
        return EnumAction.BOW;
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand enumHand) {
        ItemStack itemstack = entityPlayer.getHeldItem(enumHand);
        boolean flag = !this.findAmmo(entityPlayer).isEmpty();
        ActionResult<ItemStack> ret = ForgeEventFactory.onArrowNock(itemstack, world, entityPlayer, enumHand, flag);
        if (ret != null) {
            return ret;
        } else if (!entityPlayer.capabilities.isCreativeMode && !flag) {
            return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
        } else {
            entityPlayer.setActiveHand(enumHand);
            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
        }
    }

    public int getItemEnchantability() {
        return 1;
    }
}

