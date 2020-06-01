package com.alexjw.core.server.items;

import com.alexjw.core.server.guns.Bullet;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public abstract class ItemBullet extends Item {
    private Bullet bullet;

    public ItemBullet(Bullet bullet) {
        this.setUnlocalizedName(bullet.getBulletName());
        this.setRegistryName(bullet.getModID(), bullet.getBulletName());
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.bullet = bullet;
    }

    /**
     * Set/Add ammo into the mag.
     *
     * @param itemStack - This itemstack.
     * @param count     - The amount of bullets in the magazine, usually bullet.getMax
     */
    public void setLoadedAmmo(ItemStack itemStack, int count) {
        NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
        if (nbtTagCompound != null) {
            nbtTagCompound.setInteger("ammo", count);
        } else {
            NBTTagCompound newNbtTagCompound = new NBTTagCompound();
            newNbtTagCompound.setInteger("ammo", count);
            itemStack.setTagCompound(newNbtTagCompound);
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
     * Check the maximum ammunition size of this particular mag.
     */
    public int getMaxAmmo() {
        return bullet.getBulletMag();
    }
}
