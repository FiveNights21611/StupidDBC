
package net.mcreator.stupiddragonblockc.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.procedures.VegetaInitializeProcedure;
import net.mcreator.stupiddragonblockc.procedures.VegetaHealthProcedure;
import net.mcreator.stupiddragonblockc.procedures.VegetaFlightProcedure;
import net.mcreator.stupiddragonblockc.init.StupidDbcModEntities;

import javax.annotation.Nullable;

import java.util.EnumSet;

public class VegetaSS1Entity extends Monster {
	public VegetaSS1Entity(PlayMessages.SpawnEntity packet, Level world) {
		this(StupidDbcModEntities.VEGETA_SS_1.get(), world);
	}

	public VegetaSS1Entity(EntityType<VegetaSS1Entity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 100;
		setNoAi(false);
		setCustomName(Component.literal("Vegeta, Prince Of All Saiyans"));
		setCustomNameVisible(true);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (VegetaSS1Entity.this.getTarget() != null && !VegetaSS1Entity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return VegetaSS1Entity.this.getMoveControl().hasWanted() && VegetaSS1Entity.this.getTarget() != null && VegetaSS1Entity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = VegetaSS1Entity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				VegetaSS1Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = VegetaSS1Entity.this.getTarget();
				if (VegetaSS1Entity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					VegetaSS1Entity.this.doHurtTarget(livingentity);
				} else {
					double d0 = VegetaSS1Entity.this.distanceToSqr(livingentity);
					if (d0 < 32) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						VegetaSS1Entity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, (float) 6));
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = VegetaSS1Entity.this.getRandom();
				double dir_x = VegetaSS1Entity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = VegetaSS1Entity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = VegetaSS1Entity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = VegetaSS1Entity.this.getX();
				double y = VegetaSS1Entity.this.getY();
				double z = VegetaSS1Entity.this.getZ();
				Entity entity = VegetaSS1Entity.this;
				Level world = VegetaSS1Entity.this.level;
				return super.canUse() && VegetaFlightProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = VegetaSS1Entity.this.getX();
				double y = VegetaSS1Entity.this.getY();
				double z = VegetaSS1Entity.this.getZ();
				Entity entity = VegetaSS1Entity.this;
				Level world = VegetaSS1Entity.this.level;
				return super.canContinueToUse() && VegetaFlightProcedure.execute(entity);
			}

		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(7, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		VegetaInitializeProcedure.execute(this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		VegetaHealthProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 100);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}
