package com.alexjw.siegecraft.server.entity;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SPacketChangeGameState;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityStim extends Entity implements IProjectile {
    private static final Predicate<Entity> ARROW_TARGETS;
    private static final DataParameter<Byte> CRITICAL;
    private int xTile;
    private int yTile;
    private int zTile;
    private Block inTile;
    private int inData;

    static {
        ARROW_TARGETS = Predicates.and(EntitySelectors.NOT_SPECTATING, EntitySelectors.IS_ALIVE, new Predicate<Entity>() {
            public boolean apply(@Nullable Entity p_apply_1_) {
                return p_apply_1_.canBeCollidedWith();
            }
        });
        CRITICAL = EntityDataManager.createKey(EntityArrow.class, DataSerializers.BYTE);
    }

    public EntityArrow.PickupStatus pickupStatus;
    public int arrowShake;
    public Entity shootingEntity;
    protected boolean inGround;
    private int ticksInGround;
    private int ticksInAir;
    private double damage;
    private int knockbackStrength;
    protected int timeInGround;

    public EntityStim(World p_i1753_1_) {
        super(p_i1753_1_);
        this.xTile = -1;
        this.yTile = -1;
        this.zTile = -1;
        this.pickupStatus = EntityArrow.PickupStatus.DISALLOWED;
        this.damage = 2.0D;
        this.setSize(0.5F, 0.5F);
    }

    public EntityStim(World p_i1754_1_, double p_i1754_2_, double p_i1754_4_, double p_i1754_6_) {
        this(p_i1754_1_);
        this.setPosition(p_i1754_2_, p_i1754_4_, p_i1754_6_);
    }

    public EntityStim(World p_i46777_1_, EntityLivingBase p_i46777_2_) {
        this(p_i46777_1_, p_i46777_2_.posX, p_i46777_2_.posY + (double) p_i46777_2_.getEyeHeight() - 0.10000000149011612D, p_i46777_2_.posZ);
        this.shootingEntity = p_i46777_2_;
        if (p_i46777_2_ instanceof EntityPlayer) {
            this.pickupStatus = EntityArrow.PickupStatus.ALLOWED;
        }

    }

    public static void registerFixesArrow(DataFixer p_registerFixesArrow_0_, String p_registerFixesArrow_1_) {
    }

    public static void registerFixesArrow(DataFixer p_registerFixesArrow_0_) {
        registerFixesArrow(p_registerFixesArrow_0_, "Arrow");
    }

    @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double p_isInRangeToRenderDist_1_) {
        double d0 = this.getEntityBoundingBox().getAverageEdgeLength() * 10.0D;
        if (Double.isNaN(d0)) {
            d0 = 1.0D;
        }

        d0 = d0 * 64.0D * getRenderDistanceWeight();
        return p_isInRangeToRenderDist_1_ < d0 * d0;
    }

    @SideOnly(Side.CLIENT)
    public void setPositionAndRotationDirect(double p_setPositionAndRotationDirect_1_, double p_setPositionAndRotationDirect_3_, double p_setPositionAndRotationDirect_5_, float p_setPositionAndRotationDirect_7_, float p_setPositionAndRotationDirect_8_, int p_setPositionAndRotationDirect_9_, boolean p_setPositionAndRotationDirect_10_) {
        this.setPosition(p_setPositionAndRotationDirect_1_, p_setPositionAndRotationDirect_3_, p_setPositionAndRotationDirect_5_);
        this.setRotation(p_setPositionAndRotationDirect_7_, p_setPositionAndRotationDirect_8_);
    }

    protected void entityInit() {
        this.dataManager.register(CRITICAL, (byte) 0);
    }

    public void shoot(Entity p_shoot_1_, float p_shoot_2_, float p_shoot_3_, float p_shoot_4_, float p_shoot_5_, float p_shoot_6_) {
        float f = -MathHelper.sin(p_shoot_3_ * 0.017453292F) * MathHelper.cos(p_shoot_2_ * 0.017453292F);
        float f1 = -MathHelper.sin(p_shoot_2_ * 0.017453292F);
        float f2 = MathHelper.cos(p_shoot_3_ * 0.017453292F) * MathHelper.cos(p_shoot_2_ * 0.017453292F);
        this.shoot(f, f1, f2, p_shoot_5_, p_shoot_6_);
        this.motionX += p_shoot_1_.motionX;
        this.motionZ += p_shoot_1_.motionZ;
        if (!p_shoot_1_.onGround) {
            this.motionY += p_shoot_1_.motionY;
        }

    }

    public void shoot(double p_shoot_1_, double p_shoot_3_, double p_shoot_5_, float p_shoot_7_, float p_shoot_8_) {
        float f = MathHelper.sqrt(p_shoot_1_ * p_shoot_1_ + p_shoot_3_ * p_shoot_3_ + p_shoot_5_ * p_shoot_5_);
        p_shoot_1_ /= f;
        p_shoot_3_ /= f;
        p_shoot_5_ /= f;
        p_shoot_1_ += this.rand.nextGaussian() * 0.007499999832361937D * (double) p_shoot_8_;
        p_shoot_3_ += this.rand.nextGaussian() * 0.007499999832361937D * (double) p_shoot_8_;
        p_shoot_5_ += this.rand.nextGaussian() * 0.007499999832361937D * (double) p_shoot_8_;
        p_shoot_1_ *= p_shoot_7_;
        p_shoot_3_ *= p_shoot_7_;
        p_shoot_5_ *= p_shoot_7_;
        this.motionX = p_shoot_1_;
        this.motionY = p_shoot_3_;
        this.motionZ = p_shoot_5_;
        float f1 = MathHelper.sqrt(p_shoot_1_ * p_shoot_1_ + p_shoot_5_ * p_shoot_5_);
        this.rotationYaw = (float) (MathHelper.atan2(p_shoot_1_, p_shoot_5_) * 57.29577951308232D);
        this.rotationPitch = (float) (MathHelper.atan2(p_shoot_3_, f1) * 57.29577951308232D);
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.ticksInGround = 0;
    }

    @SideOnly(Side.CLIENT)
    public void setVelocity(double p_setVelocity_1_, double p_setVelocity_3_, double p_setVelocity_5_) {
        this.motionX = p_setVelocity_1_;
        this.motionY = p_setVelocity_3_;
        this.motionZ = p_setVelocity_5_;
        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt(p_setVelocity_1_ * p_setVelocity_1_ + p_setVelocity_5_ * p_setVelocity_5_);
            this.rotationPitch = (float) (MathHelper.atan2(p_setVelocity_3_, f) * 57.29577951308232D);
            this.rotationYaw = (float) (MathHelper.atan2(p_setVelocity_1_, p_setVelocity_5_) * 57.29577951308232D);
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.ticksInGround = 0;
        }

    }

    protected void arrowHit(EntityLivingBase p_arrowHit_1_) {
    }

    public void onUpdate() {
        super.onUpdate();
        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float) (MathHelper.atan2(this.motionX, this.motionZ) * 57.29577951308232D);
            this.rotationPitch = (float) (MathHelper.atan2(this.motionY, f) * 57.29577951308232D);
            this.prevRotationYaw = this.rotationYaw;
            this.prevRotationPitch = this.rotationPitch;
        }

        BlockPos blockpos = new BlockPos(this.xTile, this.yTile, this.zTile);
        IBlockState iblockstate = this.world.getBlockState(blockpos);
        Block block = iblockstate.getBlock();
        if (iblockstate.getMaterial() != Material.AIR) {
            AxisAlignedBB axisalignedbb = iblockstate.getCollisionBoundingBox(this.world, blockpos);
            if (axisalignedbb != Block.NULL_AABB && axisalignedbb.offset(blockpos).contains(new Vec3d(this.posX, this.posY, this.posZ))) {
                this.inGround = true;
            }
        }

        if (this.arrowShake > 0) {
            --this.arrowShake;
        }

        if (this.inGround) {
            int j = block.getMetaFromState(iblockstate);
            if ((block != this.inTile || j != this.inData) && !this.world.collidesWithAnyBlock(this.getEntityBoundingBox().grow(0.05D))) {
                this.inGround = false;
                this.motionX *= this.rand.nextFloat() * 0.2F;
                this.motionY *= this.rand.nextFloat() * 0.2F;
                this.motionZ *= this.rand.nextFloat() * 0.2F;
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            } else {
                ++this.ticksInGround;
                if (this.ticksInGround >= 1200) {
                    this.setDead();
                }
            }

            ++this.timeInGround;
        } else {
            this.timeInGround = 0;
            ++this.ticksInAir;
            Vec3d vec3d1 = new Vec3d(this.posX, this.posY, this.posZ);
            Vec3d vec3d = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            RayTraceResult raytraceresult = this.world.rayTraceBlocks(vec3d1, vec3d, false, true, false);
            vec3d1 = new Vec3d(this.posX, this.posY, this.posZ);
            vec3d = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            if (raytraceresult != null) {
                vec3d = new Vec3d(raytraceresult.hitVec.x, raytraceresult.hitVec.y, raytraceresult.hitVec.z);
            }

            Entity entity = this.findEntityOnPath(vec3d1, vec3d);
            if (entity != null) {
                raytraceresult = new RayTraceResult(entity);
            }

            if (raytraceresult != null && raytraceresult.entityHit instanceof EntityPlayer) {
                EntityPlayer entityplayer = (EntityPlayer) raytraceresult.entityHit;
                if (this.shootingEntity instanceof EntityPlayer && !((EntityPlayer) this.shootingEntity).canAttackPlayer(entityplayer)) {
                    raytraceresult = null;
                }
            }

            if (raytraceresult != null && !ForgeEventFactory.onProjectileImpact(this, raytraceresult)) {
                this.onHit(raytraceresult);
            }

            if (this.getIsCritical()) {
                for (int k = 0; k < 4; ++k) {
                    this.world.spawnParticle(EnumParticleTypes.CRIT, this.posX + this.motionX * (double) k / 4.0D, this.posY + this.motionY * (double) k / 4.0D, this.posZ + this.motionZ * (double) k / 4.0D, -this.motionX, -this.motionY + 0.2D, -this.motionZ);
                }
            }

            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            float f4 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float) (MathHelper.atan2(this.motionX, this.motionZ) * 57.29577951308232D);

            for (this.rotationPitch = (float) (MathHelper.atan2(this.motionY, f4) * 57.29577951308232D); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
            }

            while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
                this.prevRotationPitch += 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
                this.prevRotationYaw -= 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
                this.prevRotationYaw += 360.0F;
            }

            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            float f1 = 0.99F;
            float f2 = 0.05F;
            if (this.isInWater()) {
                for (int i = 0; i < 4; ++i) {
                    float f3 = 0.25F;
                    this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
                }

                f1 = 0.6F;
            }

            if (this.isWet()) {
                this.extinguish();
            }

            this.motionX *= f1;
            this.motionY *= f1;
            this.motionZ *= f1;
            if (!this.hasNoGravity()) {
                this.motionY -= 0.05000000074505806D;
            }

            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }

    }

    protected void onHit(RayTraceResult p_onHit_1_) {
        Entity entity = p_onHit_1_.entityHit;
        if (entity != null) {
            float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            int i = MathHelper.ceil((double) f * this.damage);
            if (this.getIsCritical()) {
                i += this.rand.nextInt(i / 2 + 2);
            }

            DamageSource damagesource = null;
            if (this.shootingEntity == null) {
                damagesource = DamageSource.causePlayerDamage((EntityPlayer) this.shootingEntity);
            } else {
                damagesource = DamageSource.causePlayerDamage((EntityPlayer) this.shootingEntity);
            }

            if (this.isBurning() && !(entity instanceof EntityEnderman)) {
                entity.setFire(5);
            }

            if (entity.attackEntityFrom(damagesource, (float) i)) {
                if (entity instanceof EntityLivingBase) {
                    EntityLivingBase entitylivingbase = (EntityLivingBase) entity;
                    if (!this.world.isRemote) {
                        entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1);
                    }

                    if (this.knockbackStrength > 0) {
                        float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
                        if (f1 > 0.0F) {
                            entitylivingbase.addVelocity(this.motionX * (double) this.knockbackStrength * 0.6000000238418579D / (double) f1, 0.1D, this.motionZ * (double) this.knockbackStrength * 0.6000000238418579D / (double) f1);
                        }
                    }

                    if (this.shootingEntity instanceof EntityLivingBase) {
                        EnchantmentHelper.applyThornEnchantments(entitylivingbase, this.shootingEntity);
                        EnchantmentHelper.applyArthropodEnchantments((EntityLivingBase) this.shootingEntity, entitylivingbase);
                    }

                    this.arrowHit(entitylivingbase);
                    if (this.shootingEntity != null && entitylivingbase != this.shootingEntity && entitylivingbase instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP) {
                        ((EntityPlayerMP) this.shootingEntity).connection.sendPacket(new SPacketChangeGameState(6, 0.0F));
                    }
                }

                this.playSound(SoundEvents.ENTITY_ARROW_HIT, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
                if (!(entity instanceof EntityEnderman)) {
                    this.setDead();
                }
            } else {
                this.motionX *= -0.10000000149011612D;
                this.motionY *= -0.10000000149011612D;
                this.motionZ *= -0.10000000149011612D;
                this.rotationYaw += 180.0F;
                this.prevRotationYaw += 180.0F;
                this.ticksInAir = 0;
                if (!this.world.isRemote && this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ < 0.0010000000474974513D) {
                    this.setDead();
                }
            }
        } else {
            BlockPos blockpos = p_onHit_1_.getBlockPos();
            this.xTile = blockpos.getX();
            this.yTile = blockpos.getY();
            this.zTile = blockpos.getZ();
            IBlockState iblockstate = this.world.getBlockState(blockpos);
            this.inTile = iblockstate.getBlock();
            this.inData = this.inTile.getMetaFromState(iblockstate);
            this.motionX = (float) (p_onHit_1_.hitVec.x - this.posX);
            this.motionY = (float) (p_onHit_1_.hitVec.y - this.posY);
            this.motionZ = (float) (p_onHit_1_.hitVec.z - this.posZ);
            float f2 = MathHelper.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            this.posX -= this.motionX / (double) f2 * 0.05000000074505806D;
            this.posY -= this.motionY / (double) f2 * 0.05000000074505806D;
            this.posZ -= this.motionZ / (double) f2 * 0.05000000074505806D;
            this.playSound(SoundEvents.ENTITY_ARROW_HIT, 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
            this.inGround = true;
            this.arrowShake = 7;
            this.setIsCritical(false);
            if (iblockstate.getMaterial() != Material.AIR) {
                this.inTile.onEntityCollidedWithBlock(this.world, blockpos, iblockstate, this);
            }
        }

    }

    public void move(MoverType p_move_1_, double p_move_2_, double p_move_4_, double p_move_6_) {
        super.move(p_move_1_, p_move_2_, p_move_4_, p_move_6_);
        if (this.inGround) {
            this.xTile = MathHelper.floor(this.posX);
            this.yTile = MathHelper.floor(this.posY);
            this.zTile = MathHelper.floor(this.posZ);
        }

    }

    @Nullable
    protected Entity findEntityOnPath(Vec3d p_findEntityOnPath_1_, Vec3d p_findEntityOnPath_2_) {
        Entity entity = null;
        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).grow(1.0D), ARROW_TARGETS);
        double d0 = 0.0D;

        for (Entity value : list) {
            if (value != this.shootingEntity || this.ticksInAir >= 5) {
                AxisAlignedBB axisalignedbb = value.getEntityBoundingBox().grow(0.30000001192092896D);
                RayTraceResult raytraceresult = axisalignedbb.calculateIntercept(p_findEntityOnPath_1_, p_findEntityOnPath_2_);
                if (raytraceresult != null) {
                    double d1 = p_findEntityOnPath_1_.squareDistanceTo(raytraceresult.hitVec);
                    if (d1 < d0 || d0 == 0.0D) {
                        entity = value;
                        d0 = d1;
                    }
                }
            }
        }

        return entity;
    }

    public void writeEntityToNBT(NBTTagCompound p_writeEntityToNBT_1_) {
        p_writeEntityToNBT_1_.setInteger("xTile", this.xTile);
        p_writeEntityToNBT_1_.setInteger("yTile", this.yTile);
        p_writeEntityToNBT_1_.setInteger("zTile", this.zTile);
        p_writeEntityToNBT_1_.setShort("life", (short) this.ticksInGround);
        ResourceLocation resourcelocation = Block.REGISTRY.getNameForObject(this.inTile);
        p_writeEntityToNBT_1_.setString("inTile", resourcelocation == null ? "" : resourcelocation.toString());
        p_writeEntityToNBT_1_.setByte("inData", (byte) this.inData);
        p_writeEntityToNBT_1_.setByte("shake", (byte) this.arrowShake);
        p_writeEntityToNBT_1_.setByte("inGround", (byte) (this.inGround ? 1 : 0));
        p_writeEntityToNBT_1_.setByte("pickup", (byte) this.pickupStatus.ordinal());
        p_writeEntityToNBT_1_.setDouble("damage", this.damage);
        p_writeEntityToNBT_1_.setBoolean("crit", this.getIsCritical());
    }

    public void readEntityFromNBT(NBTTagCompound p_readEntityFromNBT_1_) {
        this.xTile = p_readEntityFromNBT_1_.getInteger("xTile");
        this.yTile = p_readEntityFromNBT_1_.getInteger("yTile");
        this.zTile = p_readEntityFromNBT_1_.getInteger("zTile");
        this.ticksInGround = p_readEntityFromNBT_1_.getShort("life");
        if (p_readEntityFromNBT_1_.hasKey("inTile", 8)) {
            this.inTile = Block.getBlockFromName(p_readEntityFromNBT_1_.getString("inTile"));
        } else {
            this.inTile = Block.getBlockById(p_readEntityFromNBT_1_.getByte("inTile") & 255);
        }

        this.inData = p_readEntityFromNBT_1_.getByte("inData") & 255;
        this.arrowShake = p_readEntityFromNBT_1_.getByte("shake") & 255;
        this.inGround = p_readEntityFromNBT_1_.getByte("inGround") == 1;
        if (p_readEntityFromNBT_1_.hasKey("damage", 99)) {
            this.damage = p_readEntityFromNBT_1_.getDouble("damage");
        }

        if (p_readEntityFromNBT_1_.hasKey("pickup", 99)) {
            this.pickupStatus = EntityArrow.PickupStatus.getByOrdinal(p_readEntityFromNBT_1_.getByte("pickup"));
        } else if (p_readEntityFromNBT_1_.hasKey("player", 99)) {
            this.pickupStatus = p_readEntityFromNBT_1_.getBoolean("player") ? EntityArrow.PickupStatus.ALLOWED : EntityArrow.PickupStatus.DISALLOWED;
        }

        this.setIsCritical(p_readEntityFromNBT_1_.getBoolean("crit"));
    }

    protected boolean canTriggerWalking() {
        return false;
    }

    public void onCollideWithPlayer(EntityPlayer p_onCollideWithPlayer_1_) {
        if (!this.world.isRemote && this.inGround && this.arrowShake <= 0) {
            boolean flag = this.pickupStatus == EntityArrow.PickupStatus.ALLOWED || this.pickupStatus == EntityArrow.PickupStatus.CREATIVE_ONLY && p_onCollideWithPlayer_1_.capabilities.isCreativeMode;
            if (this.pickupStatus == EntityArrow.PickupStatus.ALLOWED) {
                flag = false;
            }

            if (flag) {
                p_onCollideWithPlayer_1_.onItemPickup(this, 1);
                this.setDead();
            }
        }

    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double p_setDamage_1_) {
        this.damage = p_setDamage_1_;
    }

    public boolean canBeAttackedWithItem() {
        return false;
    }

    public float getEyeHeight() {
        return 0.0F;
    }

    public void setKnockbackStrength(int p_setKnockbackStrength_1_) {
        this.knockbackStrength = p_setKnockbackStrength_1_;
    }

    public boolean getIsCritical() {
        byte b0 = this.dataManager.get(CRITICAL);
        return (b0 & 1) != 0;
    }

    public void setIsCritical(boolean p_setIsCritical_1_) {
        byte b0 = this.dataManager.get(CRITICAL);
        if (p_setIsCritical_1_) {
            this.dataManager.set(CRITICAL, (byte) (b0 | 1));
        } else {
            this.dataManager.set(CRITICAL, (byte) (b0 & -2));
        }

    }

    public void setEnchantmentEffectsFromEntity(EntityLivingBase p_setEnchantmentEffectsFromEntity_1_, float p_setEnchantmentEffectsFromEntity_2_) {
        int i = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.POWER, p_setEnchantmentEffectsFromEntity_1_);
        int j = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.PUNCH, p_setEnchantmentEffectsFromEntity_1_);
        this.setDamage((double) (p_setEnchantmentEffectsFromEntity_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (double) ((float) this.world.getDifficulty().getDifficultyId() * 0.11F));
        if (i > 0) {
            this.setDamage(this.getDamage() + (double) i * 0.5D + 0.5D);
        }

        if (j > 0) {
            this.setKnockbackStrength(j);
        }

        if (EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.FLAME, p_setEnchantmentEffectsFromEntity_1_) > 0) {
            this.setFire(100);
        }

    }

    public enum PickupStatus {
        DISALLOWED,
        ALLOWED,
        CREATIVE_ONLY;

        PickupStatus() {
        }

        public static PickupStatus getByOrdinal(int p_getByOrdinal_0_) {
            if (p_getByOrdinal_0_ < 0 || p_getByOrdinal_0_ > values().length) {
                p_getByOrdinal_0_ = 0;
            }

            return values()[p_getByOrdinal_0_];
        }
    }
}
