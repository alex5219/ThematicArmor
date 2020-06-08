package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.data.SiegeData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemEyenox extends Item {
    private static final ResourceLocation jackalHudTexture = new ResourceLocation(Siege.MODID, "textures/gui/jackal_hud.png");

    public ItemEyenox() {
        super();
        this.setUnlocalizedName("eyenox_model_iii");
        this.setRegistryName(Siege.MODID, "eyenox_model_iii");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand enumHand) {
        if (!world.isRemote) {
            if (SiegeData.isEyenoxActive.get(entityPlayer) != null) {
                SiegeData.isEyenoxActive.put(entityPlayer, !SiegeData.isEyenoxActive.get(entityPlayer));
            } else {
                SiegeData.isEyenoxActive.put(entityPlayer, true);
            }
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, entityPlayer.getHeldItem(enumHand));
    }
}

