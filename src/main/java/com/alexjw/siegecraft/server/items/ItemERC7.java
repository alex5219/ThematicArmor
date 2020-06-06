package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.client.renderer.entity.SiegeRendererManager;
import com.alexjw.siegecraft.server.helper.SiegeHelper;
import com.alexjw.siegecraft.server.operators.Operator;
import com.alexjw.siegecraft.server.operators.OperatorManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.Objects;

public class ItemERC7 extends Item {
    public ItemERC7() {
        super();
        this.setUnlocalizedName("erc_7");
        this.setRegistryName(Siege.MODID, "erc_7");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        this.setMaxDamage(90);
        ModItems.ITEMS.add(this);
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int p, boolean flag) {
        if(entity instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) entity;
            Operator operator = SiegeHelper.getOperator(entityPlayer);
            if(operator != null) {
                if(operator.equals(OperatorManager.operatorVigil) || operator.equals(OperatorManager.operatorVigilInvis)) {
                    if(!entityPlayer.getHeldItem(EnumHand.MAIN_HAND).equals(stack)) {
                        entityPlayer.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(OperatorManager.operatorVigil.getHelmet()));
                        entityPlayer.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(OperatorManager.operatorVigil.getChestplate()));
                        entityPlayer.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(OperatorManager.operatorVigil.getLeggings()));
                        entityPlayer.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(OperatorManager.operatorVigil.getBoots()));
                        stack.setItemDamage(stack.getItemDamage() - 1);
                    } else {
                        if(stack.getItemDamage() != stack.getMaxDamage()) {
                            entityPlayer.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(OperatorManager.operatorVigilInvis.getHelmet()));
                            entityPlayer.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(OperatorManager.operatorVigilInvis.getChestplate()));
                            entityPlayer.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(OperatorManager.operatorVigilInvis.getLeggings()));
                            entityPlayer.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(OperatorManager.operatorVigilInvis.getBoots()));
                            stack.setItemDamage(stack.getItemDamage() + 1);
                        }
                    }
                }
            }
        }
    }
}

