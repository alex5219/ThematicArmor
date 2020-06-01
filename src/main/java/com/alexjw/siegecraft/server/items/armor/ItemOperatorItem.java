package com.alexjw.siegecraft.server.items.armor;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.gadgets.Gadget;
import com.alexjw.siegecraft.server.items.ModItems;
import com.alexjw.siegecraft.server.operators.Operator;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemOperatorItem extends Item {
    public Operator operator;

    public ItemOperatorItem(Operator operator) {
        super();
        this.setUnlocalizedName(operator.getUnlocalizedName());
        this.setRegistryName(Siege.MODID, operator.getUnlocalizedName());
        this.setCreativeTab(SiegeTabs.tabOperators);
        this.operator = operator;
        this.setMaxDamage(1);
        ModItems.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, World world, List list, ITooltipFlag iTooltipFlag) {
        switch (operator.getTeam()) {
            case ATTACKER:
                list.add("Team: " + TextFormatting.BLUE + TextFormatting.BOLD + "Attacker");
                break;
            case DEFENDER:
                list.add("Team: " + TextFormatting.RED + TextFormatting.BOLD + "Defender");
                break;
            default:
                list.add("Team: " + TextFormatting.WHITE + TextFormatting.BOLD + "None");
                break;
        }
        switch (operator.getSpeed()) {
            case 1:
                list.add("Armor: " + TextFormatting.WHITE + "***");
                list.add("Speed: " + TextFormatting.WHITE + "*" + TextFormatting.DARK_GRAY + "**");
                break;
            case 2:
                list.add("Armor: " + TextFormatting.WHITE + "**" + TextFormatting.DARK_GRAY + "*");
                list.add("Speed: " + TextFormatting.WHITE + "**" + TextFormatting.DARK_GRAY + "*");
                break;
            case 3:
                list.add("Armor: " + TextFormatting.WHITE + "*" + TextFormatting.DARK_GRAY + "**");
                list.add("Speed: " + TextFormatting.WHITE + "***");
                break;
        }
        if (operator.getGadgets().size() > 0) {
            list.add("Gadgets: ");
            for (Gadget gadget : operator.getGadgets()) {
                list.add("- " + gadget.getName());
            }
        }
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if (entityIn instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase) entityIn;
            EntityPlayer entityPlayer = (EntityPlayer) entityIn;
            ItemStack helmet = new ItemStack(operator.getHelmet());
            ItemStack chestplate = new ItemStack(operator.getChestplate());
            ItemStack leggings = new ItemStack(operator.getLeggings());
            ItemStack boots = new ItemStack(operator.getBoots());
            entitylivingbase.setItemStackToSlot(EntityEquipmentSlot.HEAD, helmet);
            entitylivingbase.setItemStackToSlot(EntityEquipmentSlot.CHEST, chestplate);
            entitylivingbase.setItemStackToSlot(EntityEquipmentSlot.LEGS, leggings);
            entitylivingbase.setItemStackToSlot(EntityEquipmentSlot.FEET, boots);
            for (int i = 0; i < entityPlayer.inventory.getSizeInventory(); i++) {
                ItemStack stackLoop = entityPlayer.inventory.getStackInSlot(i);
                if (stackLoop == stack) {
                    entityPlayer.inventory.setInventorySlotContents(i, new ItemStack(Items.AIR));
                }
            }
            for (Item item : operator.getLoadoutItems()) {
                entityPlayer.addItemStackToInventory(new ItemStack(item));
                entityPlayer.sendMessage(new TextComponentString("" + item.getUnlocalizedName()));
            }
        }
    }
}
