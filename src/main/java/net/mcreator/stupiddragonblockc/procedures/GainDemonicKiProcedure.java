package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GainDemonicKiProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
				|| ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
				|| ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed == 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed >= 100000)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment < 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed > 99999)) {
				if (!world.getEntitiesOfClass(Blaze.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BlazeNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Ghast.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GhastNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(WitherBoss.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).WitherNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(WitherSkeleton.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).witherSkeletonsNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Piglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).piglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Hoglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).hoglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Zoglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).zoglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(ZombifiedPiglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ZombifiedPiglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("stupid_dbc:otherworld_type_1")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("nether_wastes"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("soul_sand_valley")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("basalt_deltas"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("crimson_forest")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("warped_forest"))) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed + 10;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed > 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment < 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed > 99999)) {
				if (!world.getEntitiesOfClass(Blaze.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BlazeNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Ghast.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GhastNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(WitherBoss.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).WitherNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(WitherSkeleton.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).witherSkeletonsNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Piglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).piglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Hoglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).hoglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Zoglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).zoglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(ZombifiedPiglin.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ZombifiedPiglinNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("stupid_dbc:otherworld_type_2")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("nether_wastes"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("soul_sand_valley")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("basalt_deltas"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("crimson_forest")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("warped_forest"))) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed - 10;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
