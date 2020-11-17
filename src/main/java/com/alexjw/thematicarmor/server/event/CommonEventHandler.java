package com.alexjw.thematicarmor.server.event;

import com.alexjw.thematicarmor.ThematicArmor;
import com.alexjw.thematicarmor.server.armors.Armor;
import com.alexjw.thematicarmor.server.entity.ThematicAttributes;
import com.alexjw.thematicarmor.server.helper.ThematicHelper;
import com.alexjw.thematicarmor.server.utils.ThematicServerUtils;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod.EventBusSubscriber(modid = ThematicArmor.MODID)
public class CommonEventHandler {
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        EntityPlayer player = event.player;

        if (event.phase == TickEvent.Phase.END) {
            if (!player.world.isRemote) {
                ThematicAttributes.applyModifiers(player);
            }
        }
    }

    @SubscribeEvent
    public void onLivingJump(LivingEvent.LivingJumpEvent event) {
        EntityLivingBase entity = event.getEntityLiving();
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            Armor armor = ThematicHelper.getTheme(player);

            if (armor != null) {
                float scale = 1;

                entity.motionY += 0.15 * (ThematicAttributes.JUMP_HEIGHT.get(player, armor, 1) - 1);
                entity.motionY += 0.185 * (scale - 1);
            }
        }
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        EntityPlayer attacker = null;

        if (event.getSource().getImmediateSource() instanceof EntityPlayer) {
            attacker = (EntityPlayer) event.getSource().getImmediateSource();
        }

        EntityLivingBase entity = event.getEntityLiving();

        if (attacker != null) {
            Armor armor2 = ThematicHelper.getTheme(attacker);

            if (ThematicServerUtils.isMeleeDamage(event.getSource())) {
                int i = 0;

                if (entity != null) {
                    i += EnchantmentHelper.getKnockbackModifier(entity);
                }

                if (attacker.isSprinting()) {
                    ++i;
                }

                float knockback = ThematicAttributes.KNOCKBACK.get(attacker, armor2, i);

                if (knockback > 0) {
                    if (entity != null) {
                        entity.addVelocity(-MathHelper.sin(attacker.rotationYaw * (float) Math.PI / 180F) * knockback * 0.5, 0, MathHelper.cos(attacker.rotationYaw * (float) Math.PI / 180F) * knockback * 0.5);
                    }
                }

                event.setAmount(ThematicAttributes.ATTACK_DAMAGE.get(attacker, armor2, event.getAmount()));

                if (ThematicHelper.isHoldingSword(attacker)) {
                    event.setAmount(ThematicAttributes.SWORD_DAMAGE.get(attacker, armor2, event.getAmount()));
                } else {
                    event.setAmount(ThematicAttributes.PUNCH_DAMAGE.get(attacker, armor2, event.getAmount()));
                }
            }
        }
    }
}
