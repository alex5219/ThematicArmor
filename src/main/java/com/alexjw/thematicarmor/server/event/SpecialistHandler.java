package com.alexjw.thematicarmor.server.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.data.TADataManager;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import com.alexjw.thematicarmor.server.specialists.SpecialistManager;
import com.alexjw.thematicarmor.server.specialists.SpecialistSkill;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import techguns.damagesystem.TGDamageSource;

import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class SpecialistHandler {
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
        if (ThematicArmor.isTGLoaded) {
            if (event.getSource() instanceof TGDamageSource) {
                TGDamageSource tgDamageSource = (TGDamageSource) event.getSource();
                if (tgDamageSource.attacker instanceof EntityPlayer) {
                    attacker = (EntityPlayer) tgDamageSource.attacker;
                }
            }
        }
        if (attacker != null && victim != null) {
            if (attackerSkills != null) {
                /* Specialist Firestarter */
                if (attackerSkills.contains(SpecialistManager.specialistFireStarter)) {
                    if (random.nextInt(10) == 1) {
                        attacker.setFire(120);
                    }
                }
                /* Specialist Infection */
                if (attackerSkills.contains(SpecialistManager.specialistInfection)) {
                    if (random.nextInt(10) == 1) {
                        attacker.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 100, 0));
                    }
                }
                /* Specialist Execution */
                if (attackerSkills.contains(SpecialistManager.specialistExecution)) {
                    if (event.getEntityLiving().getHealth() <= event.getEntityLiving().getMaxHealth() * 0.3f) {
                        if (random.nextBoolean()) {
                            event.setAmount(event.getEntityLiving().getHealth());
                        }
                    }
                }
                /* Specialist Neutralize */
                if (attackerSkills.contains(SpecialistManager.specialistNeutralize)) {
                    if (random.nextInt(10) == 1) {
                        attacker.addPotionEffect(new PotionEffect(Potion.getPotionById(4), 150, 2));
                        attacker.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 150, 2));
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
                /* Specialist Lifesteal */
                if (attackerSkills.contains(SpecialistManager.specialistLifesteal)) {
                    if (random.nextBoolean()) {
                        attacker.setHealth(attacker.getHealth() + (event.getAmount() * 0.25f));
                    }
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
                /* Specialist Parting Shot */
                if (victimSkills.contains(SpecialistManager.specialistPartingShot)) {
                    if (event.getAmount() >= victim.getHealth()) {
                        attacker.attackEntityFrom(DamageSource.causePlayerDamage(attacker), event.getAmount() * 3.0f);
                    }
                }
                /* Specialist Payback */
                if (victimSkills.contains(SpecialistManager.specialistPayback)) {
                    if (event.getAmount() > 3.0f) {
                        if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
                            attacker.attackEntityFrom(DamageSource.causePlayerDamage(attacker), event.getAmount() * 0.25f);
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
                            victim.attackEntityFrom(DamageSource.OUT_OF_WORLD, victim.getMaxHealth() * 10.0f);
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
}
