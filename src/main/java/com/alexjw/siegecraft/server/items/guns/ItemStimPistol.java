package com.alexjw.siegecraft.server.items.guns;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.network.MessageShootPistol;
import com.alexjw.siegecraft.network.SiegeNetworkHandler;
import com.alexjw.siegecraft.server.items.ModItems;
import com.google.common.collect.Multimap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.UUID;

public class ItemStimPistol extends Item implements IGun {
    protected static final UUID KNOCKBACK_RESIST_MODIFIER = UUID.fromString("77777777-645C-4F38-A497-9C13A33DB5CF");
    protected static final UUID MOVEMENT_SPEED_MODIFIER = UUID.fromString("99999999-4180-4865-B01B-BCCE9785ACA3");

    public ItemStimPistol() {
        this.maxStackSize = 1;
        this.setUnlocalizedName("doc_stim_pistol");
        this.setRegistryName(Siege.MODID, "doc_stim_pistol");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
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
        return new ActionResult(EnumActionResult.PASS, itemstack);
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(slot, stack);
        if (slot == EntityEquipmentSlot.MAINHAND) {
            multimap.put(SharedMonsterAttributes.KNOCKBACK_RESISTANCE.getName(), new AttributeModifier(KNOCKBACK_RESIST_MODIFIER, "KnockbackResist", 0.2, 0));
            multimap.put(SharedMonsterAttributes.MOVEMENT_SPEED.getName(), new AttributeModifier(MOVEMENT_SPEED_MODIFIER, "MovementSpeed", -0.1f, 2));
        }
        return multimap;
    }

    @SideOnly(Side.CLIENT)
    public boolean onLeftClick(ItemStack itemStack, EntityPlayer entityPlayer) {
        SiegeNetworkHandler.wrapper.sendToServer(new MessageShootPistol());
        return true;
    }
}
