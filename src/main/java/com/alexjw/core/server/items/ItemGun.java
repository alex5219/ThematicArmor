package com.alexjw.core.server.items;

import com.alexjw.core.server.guns.Bullet;
import com.alexjw.core.server.guns.Bullets;
import com.alexjw.core.server.guns.Gun;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public abstract class ItemGun extends Item {
    private Gun gun;

    public ItemGun(Gun gun) {
        this.setUnlocalizedName(gun.getGunName());
        this.setRegistryName(gun.getModID(), gun.getGunName());
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.gun = gun;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, World world, List list, ITooltipFlag iTooltipFlag) {
        list.add("" + TextFormatting.GRAY + getAmmo(itemStack) + TextFormatting.GRAY + ":" + TextFormatting.GRAY + getMaxAmmo(itemStack));

    }

    /**
     * Set/Add ammo into the gun.
     *
     * @param itemStack - This itemstack.
     * @param bullet    - The bullet that's being added.
     * @param count     - The amount of bullets in the magazine, usually bullet.getMax
     */
    public void setLoadedAmmo(ItemStack itemStack, Bullet bullet, int count) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            nbtTagCompound.setString("loaded_ammo", bullet.getBulletName());
            nbtTagCompound.setInteger("ammo", count);
        } else {
            NBTTagCompound newNbtTagCompound = new NBTTagCompound();
            newNbtTagCompound.setString("loaded_ammo", bullet.getBulletName());
            newNbtTagCompound.setInteger("ammo", count);
            itemStack.setTagCompound(newNbtTagCompound);
        }
    }

    /**
     * Get the Bullet that is currently loaded.
     *
     * @param itemStack - This itemstack.
     */
    public Bullet getLoadedAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            return Bullets.getBulletByName(nbtTagCompound.getString("loaded_ammo"));
        } else {
            return null;
        }
    }

    /**
     * Check how much ammo is currently loaded in the gun.
     *
     * @param itemStack - This itemstack
     */
    public int getAmmo(ItemStack itemStack) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            return nbtTagCompound.getInteger("ammo");
        } else {
            return 0;
        }
    }

    /**
     * Check the maximum ammunition size of this particular gun.
     *
     * @param itemStack - This itemstack
     */
    public int getMaxAmmo(ItemStack itemStack) {
        return getLoadedAmmo(itemStack).getBulletMag();
    }
}
