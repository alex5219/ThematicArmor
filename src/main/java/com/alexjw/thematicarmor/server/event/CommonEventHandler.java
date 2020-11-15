package com.alexjw.thematicarmor.server.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.data.TADataManager;
import com.alexjw.thematicarmor.server.enchantment.ModEnchantments;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import com.alexjw.thematicarmor.server.specialists.SpecialistSkill;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import static net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class CommonEventHandler {
    private static Random random = new Random();

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void livingDamageEvent(LivingDamageEvent event) {
        List<SpecialistSkill> attackerSkills = null;
        Armor attackerArmor = null;
        EntityPlayer attacker = null;
        EntityPlayer victim = null;
        Armor victimArmor = null;
        List<SpecialistSkill> victimSkills = null;
        if (event.getSource().getImmediateSource() != null) {
            if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
                attacker = (EntityPlayer) event.getSource().getImmediateSource();
                attackerArmor = ThematicHelper.getTheme(attacker);
                if (attackerArmor != null)
                    attackerSkills = attackerArmor.getSpecialistSkill();
            }
        }
        if (event.getEntity() instanceof EntityPlayer) {
            victim = (EntityPlayer) event.getEntity();
            if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
                victimArmor = ThematicHelper.getTheme(victim);
                if (victimArmor != null) {
                    victimSkills = victimArmor.getSpecialistSkill();
                }
            }
        }
        if (attacker != null && victim != null) {
            if (attackerSkills != null) {
                /* Specialist Firestarter */
                if (attackerSkills.contains(SpecialistManager.specialistFireStarter)) {
                    if (random.nextInt(20) == 1) {
                        victim.setFire(50);
                    }
                }
                /* Specialist Infection */
                if (attackerSkills.contains(SpecialistManager.specialistInfection)) {
                    if (random.nextInt(20) == 1) {
                        event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(9), 30, 0));
                    }
                }
                /* Specialist Execution */
                if (attackerSkills.contains(SpecialistManager.specialistExecution)) {
                    if (event.getEntityLiving().getHealth() <= event.getEntityLiving().getMaxHealth() * 0.8f) {
                        if (random.nextBoolean()) {
                            event.setAmount(event.getEntityLiving().getHealth());
                        }
                    }
                }
                /* Specialist Disarm */
                if (attackerSkills.contains(SpecialistManager.specialistDisarm)) {
                    if (random.nextInt(10) == 1) {
                        ItemStack heldItem = victim.getHeldItemMainhand();
                        int slotToSwap = random.nextInt(26);
                        ItemStack slotItem = victim.inventory.getStackInSlot(slotToSwap);
                        victim.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, slotItem);
                        victim.inventory.setInventorySlotContents(slotToSwap, heldItem);
                    }
                }
                /* Specialist Buff */
                if (attackerSkills.contains(SpecialistManager.specialistBuff)) {
                    event.setAmount(event.getAmount() * 1.1f);
                }
            }
            if (victimSkills != null) {
                /* Specialist Guardian */
                if (victimSkills.contains(SpecialistManager.specialistGuardian)) {
                    if (event.getSource().isExplosion()) {
                        if (random.nextBoolean()) {
                            event.setCanceled(true);
                        }
                    }
                }
                /* Specialist Absolute Defense */
                if (victimSkills.contains(SpecialistManager.specialistAbsoluteDefense)) {
                    if (random.nextInt(20) == 1) {
                        event.setCanceled(true);
                    }
                }
                /* Specialist Infection */
                if (victimSkills.contains(SpecialistManager.specialistInfection)) {
                    if (random.nextInt(20) == 1) {
                        event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(19), 30, 0));
                    }
                }
                /* Specialist Neutralize */
                if (victimSkills.contains(SpecialistManager.specialistNeutralize)) {
                    if (random.nextInt(25) == 1) {
                        event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(4), 30, 2));
                        event.getEntityLiving().addPotionEffect(new PotionEffect(Potion.getPotionById(2), 30, 2));
                    }
                }
                /* Specialist Lifesteal */
                if (victimSkills.contains(SpecialistManager.specialistLifesteal)) {
                    if (random.nextBoolean()) {
                        attacker.setHealth(attacker.getHealth() + (event.getAmount() * 0.1f));
                    }
                }
                /* Specialist Parting Shot */
                if (victimSkills.contains(SpecialistManager.specialistPartingShot)) {
                    if (event.getAmount() >= victim.getHealth()) {
                        attacker.setHealth(attacker.getHealth() - event.getAmount() * 3.0f);
                    }
                }
                /* Specialist Payback */
                if (victimSkills.contains(SpecialistManager.specialistPayback)) {
                    if (event.getAmount() > 3.0f) {
                        if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
                            attacker.setHealth(attacker.getHealth() - event.getAmount() * 0.05f);
                        }
                    }
                }
            }
        }
        if (victim != null) {
            if (victimSkills != null) {
                /* Specialist Tenacity */
                if (victimSkills.contains(SpecialistManager.specialistTenacity)) {
                    if (event.getAmount() >= victim.getHealth()) {
                        if (!TADataManager.TENACITY.getBoolean(victim)) {
                            event.setCanceled(true);
                            victim.setHealth(victim.getMaxHealth() * 0.3f);
                            TADataManager.TENACITY.put(victim, true);
                        }
                    }
                }
                /* Specialist Outlast */
                if (victimSkills.contains(SpecialistManager.specialistOutlast)) {
                    if (event.getAmount() >= victim.getHealth()) {
                        if (!TADataManager.HAS_DIED.getBoolean(victim)) {
                            event.setCanceled(true);
                            victim.setHealth(victim.getMaxHealth());
                            TADataManager.HAS_DIED.put(victim, true);
                            TADataManager.TIME_DEAD.put(victim, 0);
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onSpiderEvent(TickEvent.PlayerTickEvent event) {
        if (ThematicHelper.getTheme(event.player) != null) {
            if (ThematicHelper.getTheme(event.player).getSpecialistSkill() != null) {
                if (ThematicHelper.getTheme(event.player).getSpecialistSkill().contains(SpecialistManager.specialistSpider)) {
                    if (event.player.collidedHorizontally) {
                        event.player.fallDistance = 0.0F;
                        if (event.player.isSneaking()) {
                            event.player.motionY = 0.0D;
                        } else {
                            event.player.motionY = 0.1176D; //(0.2D - 0.08D) * 0.98D
                        }
                    }
                    if (!event.player.world.isRemote) {
                        double motionX = event.player.posX - event.player.lastTickPosX;
                        double motionZ = event.player.posZ - event.player.lastTickPosZ;
                        double motionY = event.player.posY - event.player.lastTickPosY - 0.765D;
                        if (motionY > 0.0D && (motionX == 0D || motionZ == 0D)) {
                            event.player.fallDistance = 0.0F;
                        }
                    }
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void onRespawn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent event) {
        if (TADataManager.TENACITY.getBoolean(event.player)) {
            TADataManager.TENACITY.put(event.player, false);
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void lastDamage(LivingDamageEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer) event.getEntityLiving();
            TADataManager.LAST_HEAL.put(entityPlayer, 0);
        }
    }

    @SubscribeEvent (priority = EventPriority.HIGH)
    public void handlePlayerDropsEvent(PlayerDropsEvent event) {
        EntityPlayer player = event.getEntityPlayer();

        if (player instanceof FakePlayer) {
            return;
        }
        if (player.world.getGameRules().getBoolean("keepInventory")) {
            return;
        }
        ListIterator<EntityItem> iter = event.getDrops().listIterator();
        while (iter.hasNext()) {
            EntityItem drop = iter.next();
            ItemStack stack = drop.getItem();
            if (isSoulbound(stack)) {
                if (addToPlayerInventory(player, stack)) {
                    iter.remove();
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGH)
    public void handlePlayerCloneEvent(PlayerEvent.Clone event) {
        if (!event.isWasDeath()) {
            return;
        }
        EntityPlayer player = event.getEntityPlayer();
        EntityPlayer oldPlayer = event.getOriginal();

        if (player instanceof FakePlayer) {
            return;
        }
        if (player.world.getGameRules().getBoolean("keepInventory")) {
            return;
        }
        for (int i = 0; i < oldPlayer.inventory.armorInventory.size(); i++) {
            ItemStack stack = oldPlayer.inventory.armorInventory.get(i);
            int encSoulbound = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.SOULBOUND, stack);
            if (encSoulbound > 0) {
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.armorInventory.set(i, ItemStack.EMPTY);
                }
            }
        }
        for (int i = 0; i < oldPlayer.inventory.mainInventory.size(); i++) {
            ItemStack stack = oldPlayer.inventory.mainInventory.get(i);
            int encSoulbound = MathHelper.clamp(EnchantmentHelper.getEnchantmentLevel(ModEnchantments.SOULBOUND, stack), 0, ModEnchantments.SOULBOUND.getMaxLevel() * 2);
            if (encSoulbound > 0) {
                if (addToPlayerInventory(player, stack)) {
                    oldPlayer.inventory.mainInventory.set(i, ItemStack.EMPTY);
                }
            }
        }
    }
    public boolean isSoulbound(ItemStack stack) {
        return getEnchantmentLevel(ModEnchantments.SOULBOUND, stack) > 0;
    }


    public static boolean addToPlayerInventory(EntityPlayer player, ItemStack stack) {
        if (stack.isEmpty() || player == null) {
            return false;
        }
        InventoryPlayer inv = player.inventory;
        for (int i = 0; i < inv.mainInventory.size(); i++) {
            if (inv.mainInventory.get(i).isEmpty()) {
                inv.mainInventory.set(i, stack.copy());
                return true;
            }
        }
        if (stack.getItem() instanceof ItemArmor) {
            ItemArmor arm = (ItemArmor) stack.getItem();
            int index = arm.armorType.getIndex();
            if (player.inventory.armorInventory.get(index).isEmpty()) {
                inv.mainInventory.set(inv.mainInventory.size() + 1, stack.copy());
                return true;
            }
        }
        return false;
    }
}
