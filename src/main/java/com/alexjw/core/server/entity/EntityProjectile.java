package com.alexjw.core.server.entity;

public abstract class EntityProjectile {

}
/*
  public abstract class EntityProjectile extends Entity implements IProjectile {
  private static final Logger logger = LogManager.getLogger(EntityProjectile.class);
  private static final String TAG_GRAVITY_VELOCITY = "gravityVelocity";
  private static final int MAX_TICKS = 200;
  private static final int DEFAULT_MAX_LIFETIME = 5000;
  public int throwableShake;
  protected boolean inGround;
  protected EntityLivingBase thrower;
  protected float gravityVelocity;
  protected float velocity;
  protected float inaccuracy;
  protected long maxLifetime;
  private int xTile;
  private int yTile;
  private int zTile;
  private String throwerName;
  private int ticksInAir;
  private long timestamp;
  <p>
  public EntityProjectile(World world) {
  super(world);
  this.xTile = -1;
  this.yTile = -1;
  this.zTile = -1;
  this.maxLifetime = 5000L;
  this.setSize(0.25F, 0.25F);
  this.timestamp = System.currentTimeMillis();
  }
  <p>
  public EntityProjectile(World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float inaccuracy) {
  this(world);
  this.thrower = thrower;
  this.velocity = velocity;
  this.gravityVelocity = gravityVelocity;
  this.inaccuracy = inaccuracy;
  }
  <p>
  public EntityProjectile(World world, double posX, double posY, double posZ) {
  super(world);
  this.xTile = -1;
  this.yTile = -1;
  this.zTile = -1;
  this.maxLifetime = 5000L;
  this.setSize(0.25F, 0.25F);
  this.setPosition(posX, posY, posZ);
  }
  <p>
  public void setPositionAndDirection() {
  this.setLocationAndAngles(this.thrower.posX, this.thrower.posY + (double) this.thrower.getEyeHeight(), this.thrower.posZ, CompatibilityProvider.compatibility.getCompatibleAimingRotationYaw(this.thrower), this.thrower.rotationPitch);
  setRotation();
  }
  <p>
  private void setRotation() {
  this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F;
  this.posY -= 0.10000000149011612D;
  this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F;
  this.setPosition(this.posX, this.posY, this.posZ);
  float f = this.velocity;
  this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f;
  this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f;
  this.motionY = -MathHelper.sin((this.rotationPitch + this.getPitchOffset()) / 180.0F * 3.1415927F) * f;
  this.shoot(this.motionX, this.motionY, this.motionZ, this.velocity, this.inaccuracy);
  }
  <p>
  public void setPositionAndDirection(double x, double y, double z, float rotationYaw, float rotationPitch) {
  this.setLocationAndAngles(x, y + (double) this.thrower.getEyeHeight(), z, rotationYaw, rotationPitch);
  setRotation();
  }
  <p>
  protected float getPitchOffset() {
  return 0.0F;
  }
  <p>
  public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
  float f2 = MathHelper.sqrt(x * x + y * y + z * z);
  x /= f2;
  y /= f2;
  z /= f2;
  x += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
  y += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
  z += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
  x *= velocity;
  y *= velocity;
  z *= velocity;
  this.motionX = x;
  this.motionY = y;
  this.motionZ = z;
  float f3 = MathHelper.sqrt(x * x + z * z);
  this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(x, z) * 180.0D / 3.141592653589793D);
  this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(y, f3) * 180.0D / 3.141592653589793D);
  }
  <p>
  public void setVelocity(double mX, double mY, double mZ) {
  this.motionX = mX;
  this.motionY = mY;
  this.motionZ = mZ;
  if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
  float f = MathHelper.sqrt(mX * mX + mZ * mZ);
  this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(mX, mZ) * 180.0D / 3.141592653589793D);
  this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(mY, f) * 180.0D / 3.141592653589793D);
  }
  <p>
  }
  <p>
  public void onUpdate() {
  if (this.ticksExisted > 300)
  this.setDead();
  else {
  this.lastTickPosX = this.posX;
  this.lastTickPosY = this.posY;
  this.lastTickPosZ = this.posZ;
  super.onUpdate();
  if (this.throwableShake > 0) --this.throwableShake;
  <p>
  if (this.inGround) {
  this.inGround = false;
  this.motionX *= this.rand.nextFloat() * 0.2F;
  this.motionY *= this.rand.nextFloat() * 0.2F;
  this.motionZ *= this.rand.nextFloat() * 0.2F;
  this.ticksInAir = 0;
  } else ++this.ticksInAir;
  <p>
  Vec3d vec3 = new Vec3d(this.posX, this.posY, this.posZ);
  Vec3d vec31 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
  CompatibleRayTraceResult movingobjectposition = CompatibleRayTracing.rayTraceBlocks(CompatibilityProvider.compatibility.world(this), vec3, vec31, (block, blockMetadata) -> {
  return this.canCollideWithBlock(block, blockMetadata);
  });
  vec3 = new CompatibleVec3(this.posX, this.posY, this.posZ);
  vec31 = new CompatibleVec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
  if (movingobjectposition != null)
  vec31 = CompatibleVec3.fromCompatibleVec3(movingobjectposition.getHitVec());
  <p>
  if (!CompatibilityProvider.compatibility.world(this).isRemote) {
  Entity entity = this.getRayTraceEntities(vec3, vec31);
  if (entity != null)
  movingobjectposition = new CompatibleRayTraceResult(entity);
  }
  <p>
  if (movingobjectposition != null)
  this.onImpact(movingobjectposition);
  <p>
  this.posX += this.motionX;
  this.posY += this.motionY;
  this.posZ += this.motionZ;
  float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
  this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.141592653589793D);
  <p>
  while (this.rotationPitch - this.prevRotationPitch >= 180.0F) this.prevRotationPitch += 360.0F;
  <p>
  while (this.rotationYaw - this.prevRotationYaw < -180.0F) this.prevRotationYaw -= 360.0F;
  <p>
  while (this.rotationYaw - this.prevRotationYaw >= 180.0F) this.prevRotationYaw += 360.0F;
  <p>
  this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
  this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
  float f2 = 0.99F;
  float f3 = this.gravityVelocity;
  if (this.isInWater()) {
  for (int i = 0; i < 4; ++i) {
  float f4 = 0.25F;
  //CompatibilityProvider.compatibility.spawnParticle(CompatibilityProvider.compatibility.world(this), "bubble", this.posX - this.motionX * (double) f4, this.posY - this.motionY * (double) f4, this.posZ - this.motionZ * (double) f4, this.motionX, this.motionY, this.motionZ);
  }
  f2 = 0.8F;
  }
  <p>
  this.motionX *= f2;
  this.motionY *= f2;
  this.motionZ *= f2;
  this.motionY -= f3;
  this.setPosition(this.posX, this.posY, this.posZ);
  }
  }
  /**
  private Entity getRayTraceEntities(CompatibleVec3 vec3, CompatibleVec3 vec31) {
  Entity entity = null;
  List<?> list = CompatibilityProvider.compatibility.getEntitiesWithinAABBExcludingEntity(CompatibilityProvider.compatibility.world(this), this, CompatibilityProvider.compatibility.getBoundingBox(this).addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
  double d0 = 0.0D;
  EntityLivingBase entitylivingbase = this.getThrower();
  <p>
  for (Object o : list) {
  Entity entity1 = (Entity) o;
  if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5)) {
  float f = 0.3F;
  CompatibleAxisAlignedBB axisalignedbb = CompatibilityProvider.compatibility.expandEntityBoundingBox(entity1, (double) f, (double) f, (double) f);
  CompatibleRayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);
  if (movingobjectposition1 != null) {
  double d1 = vec3.distanceTo(movingobjectposition1.getHitVec());
  if (d1 < d0 || d0 == 0.0D) {
  entity = entity1;
  d0 = d1;
  }
  }
  }
  }
  <p>
  return entity;
  }
  <p>
  protected abstract void onImpact(RayTraceResult var1);
  <p>
  public void writeEntityToNBT(NBTTagCompound tagCompound) {
  tagCompound.setLong("timestamp", this.timestamp);
  tagCompound.setShort("xTile", (short) this.xTile);
  tagCompound.setShort("yTile", (short) this.yTile);
  tagCompound.setShort("zTile", (short) this.zTile);
  tagCompound.setByte("shake", (byte) this.throwableShake);
  tagCompound.setByte("inGround", (byte) (this.inGround ? 1 : 0));
  if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof EntityPlayer)
  //this.throwerName = CompatibilityProvider.compatibility.getPlayerName((EntityPlayer) this.thrower);
  <p>
  tagCompound.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
  tagCompound.setFloat("gravityVelocity", this.gravityVelocity);
  }
  <p>
  public void readEntityFromNBT(NBTTagCompound tagCompound) {
  this.xTile = tagCompound.getShort("xTile");
  this.yTile = tagCompound.getShort("yTile");
  this.zTile = tagCompound.getShort("zTile");
  this.throwableShake = tagCompound.getByte("shake") & 255;
  this.inGround = tagCompound.getByte("inGround") == 1;
  this.throwerName = tagCompound.getString("ownerName");
  if (this.throwerName.length() == 0)
  this.throwerName = null;
  <p>
  this.gravityVelocity = tagCompound.getFloat("gravityVelocity");
  this.timestamp = tagCompound.getLong("timestamp");
  if (System.currentTimeMillis() > this.timestamp + this.maxLifetime)
  this.setDead();
  }
  <p>
  public void writeSpawnData(ByteBuf buffer) {
  buffer.writeFloat(this.gravityVelocity);
  }
  <p>
  public void readSpawnData(ByteBuf buffer) {
  this.gravityVelocity = buffer.readFloat();
  }
  <p>
  public float getShadowSize() {
  return 0.0F;
  }
  <p>
  public EntityLivingBase getThrower() {
  if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0)
  this.thrower = CompatibilityProvider.compatibility.world(this).getPlayerEntityByName(this.throwerName);
  return this.thrower;
  }
  <p>
  protected void entityInit() { }
  <p>
  public boolean isInRangeToRenderDist(double p_70112_1_) {
  double d1 = 0;//CompatibilityProvider.compatibility.getBoundingBox(this).getAverageEdgeLength() * 4.0D;
  d1 *= 64.0D;
  return p_70112_1_ < d1 * d1;
  }
  <p>
  public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
  return CompatibilityProvider.compatibility.canCollideCheck(block, metadata, false);
  }
  }
 */