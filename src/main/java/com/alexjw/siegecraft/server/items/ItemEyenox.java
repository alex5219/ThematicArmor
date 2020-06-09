package com.alexjw.siegecraft.server.items;

import com.alexjw.siegecraft.Siege;
import com.alexjw.siegecraft.SiegeTabs;
import com.alexjw.siegecraft.server.data.SiegeData;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEyenox extends Item {
    public ItemEyenox() {
        super();
        this.setUnlocalizedName("eyenox_model_iii");
        this.setRegistryName(Siege.MODID, "eyenox_model_iii");
        this.setCreativeTab(SiegeTabs.tabGadgets);
        ModItems.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand enumHand) {
        if (world.isRemote) {
            EntityPlayer clientPlayer = Minecraft.getMinecraft().player;
            if (SiegeData.isEyenoxActive.get(clientPlayer) != null) {
                SiegeData.isEyenoxActive.put(clientPlayer, !SiegeData.isEyenoxActive.get(clientPlayer));
            } else {
                SiegeData.isEyenoxActive.put(clientPlayer, true);
            }
        }
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, entityPlayer.getHeldItem(enumHand));
    }
}

