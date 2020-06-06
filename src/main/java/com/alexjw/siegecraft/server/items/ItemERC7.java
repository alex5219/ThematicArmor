package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.Operator;
import com.alexjw.siegecraft.server.operators.OperatorManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.model.IModelPart;

public class ItemERC7 extends Item implements IModelPart {
    public ItemERC7() {
        super();
        this.setUnlocalizedName("erc_7");
        this.setRegistryName(Siege.MODID, "erc_7");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        this.setMaxDamage(90);
        ModItems.ITEMS.add(this);
    }

    public boolean shouldCauseReequipAnimation(ItemStack p_shouldCauseReequipAnimation_1_, ItemStack p_shouldCauseReequipAnimation_2_, boolean p_shouldCauseReequipAnimation_3_) {
        return false;
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int p, boolean flag) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) entity;
            Operator operator = SiegeHelper.getOperator(entityPlayer);
            if (operator != null) {
                if (!entityPlayer.getCooldownTracker().hasCooldown(this)) {
                    if (operator.equals(OperatorManager.operatorVigil) || operator.equals(OperatorManager.operatorVigilInvis)) {
                        if (!entityPlayer.getHeldItem(EnumHand.MAIN_HAND).equals(stack)) {
                            if (SiegeHelper.getOperator(entityPlayer) == OperatorManager.operatorVigilInvis) {
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(OperatorManager.operatorVigil.getHelmet()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(OperatorManager.operatorVigil.getChestplate()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(OperatorManager.operatorVigil.getLeggings()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(OperatorManager.operatorVigil.getBoots()));
                                entityPlayer.getCooldownTracker().setCooldown(this, 15);
                            }
                            stack.setItemDamage(stack.getItemDamage() - 1);
                        } else {
                            if (stack.getItemDamage() != stack.getMaxDamage()) {
                                if (SiegeHelper.getOperator(entityPlayer) == OperatorManager.operatorVigil) {
                                    entityPlayer.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(OperatorManager.operatorVigilInvis.getHelmet()));
                                    entityPlayer.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(OperatorManager.operatorVigilInvis.getChestplate()));
                                    entityPlayer.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(OperatorManager.operatorVigilInvis.getLeggings()));
                                    entityPlayer.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(OperatorManager.operatorVigilInvis.getBoots()));
                                }
                                stack.setItemDamage(stack.getItemDamage() + 1);
                            } else {
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(OperatorManager.operatorVigil.getHelmet()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(OperatorManager.operatorVigil.getChestplate()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(OperatorManager.operatorVigil.getLeggings()));
                                entityPlayer.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(OperatorManager.operatorVigil.getBoots()));
                                entityPlayer.getCooldownTracker().setCooldown(this, 15);
                            }
                        }
                    }
                }
            }
        }
    }
}

