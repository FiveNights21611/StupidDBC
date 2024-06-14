package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GainGodKiProcedure {
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
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed == 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed > 99999)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment > 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed > 99999)) {
				if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("stupid_dbc:otherworld_type_1")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_highlands"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_barrens")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_midlands"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("small_end_islands")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("the_end"))) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed + 10;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(EnderMan.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).endermanNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Endermite.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).EndermiteNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(EnderDragon.class, AABB.ofSize(new Vec3(x, y, z), 100, 100, 100), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed + 20;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.GodKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed > 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodKiAbsorbed <= 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment > 0
					&& !((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed <= 0)) {
				if (world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("stupid_dbc:otherworld_type_1")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_highlands"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_barrens")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("end_midlands"))
						|| world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("small_end_islands")) || world.getBiome(new BlockPos(x, y, z)).is(new ResourceLocation("the_end"))) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed - 10;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(EnderMan.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).endermanNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(Endermite.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed
								- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).EndermiteNearby;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (!world.getEntitiesOfClass(EnderDragon.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() == true) {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DemonicKiAbsorbed - 20;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DemonicKiAbsorbed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
