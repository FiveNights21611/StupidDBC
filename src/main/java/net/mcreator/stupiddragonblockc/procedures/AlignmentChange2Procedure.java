package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.AdvancementEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AlignmentChange2Procedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
				|| ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
				|| ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
			if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
					&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:husbandry/bred_all_animals"))).isDone()
					&& StupidDbcModVariables.MapVariables.get(world).gotBreedAllAnimals == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 25;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				StupidDbcModVariables.MapVariables.get(world).gotBreedAllAnimals = true;
				StupidDbcModVariables.MapVariables.get(world).syncData(world);
			} else if (entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_all_mobs"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotMonstersHunted == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 10;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotMonstersHunted = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/kill_a_mob"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotKillMob == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 2;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotKillMob = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
					&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:husbandry/tame_an_animal"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotTamedAnimal == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotTamedAnimal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
					&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:husbandry/breed_an_animal"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotBreedAnimal == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotBreedAnimal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
					&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:adventure/summon_iron_golem"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotIronGolem == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotIronGolem = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:nether/summon_wither"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotKillWither == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment - 20;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotSummonedWither = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel && _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("minecraft:end/kill_dragon"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotKillDragon == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment - 30;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotKillDragon = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel && _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("stupid_dbc:kill_wither"))).isDone()
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).gotKillWither == false) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment + 20;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Alignment = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = true;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.gotKillWither = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
