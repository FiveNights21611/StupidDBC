package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TransformationKiDrainProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained / (100000 / (StupidDbcModVariables.SSKiDrain - 1)))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained / (100000 / (StupidDbcModVariables.SSKiDrain - 1))));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained / (100000 / (StupidDbcModVariables.SSKiDrain - 1)))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained / (100000 / StupidDbcModVariables.SSGrade2KD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained / (100000 / StupidDbcModVariables.SSGrade2KD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained / (100000 / StupidDbcModVariables.SSGrade2KD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained / (100000 / StupidDbcModVariables.SSGrade3KD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained / (100000 / StupidDbcModVariables.SSGrade3KD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGrade3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained / (100000 / StupidDbcModVariables.SSGrade3KD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Full Power Super Saiyan\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.FPSSKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained / (100000 / StupidDbcModVariables.FPSSKD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.FPSSKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained / (100000 / StupidDbcModVariables.FPSSKD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Full Power Super Saiyan\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.FPSSKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained / (100000 / StupidDbcModVariables.FPSSKD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained / (100000 / StupidDbcModVariables.SS2KD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained / (100000 / StupidDbcModVariables.SS2KD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained / (100000 / StupidDbcModVariables.SS2KD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS3Trained / (100000 / StupidDbcModVariables.SS3KD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS3Trained / (100000 / StupidDbcModVariables.SS3KD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS3KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS3Trained / (100000 / StupidDbcModVariables.SS3KD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan God\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGodKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained / (100000 / StupidDbcModVariables.SSGodKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGodKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained / (100000 / StupidDbcModVariables.SSGodKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan God\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSGodKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained / (100000 / StupidDbcModVariables.SSGodKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained / (100000 / StupidDbcModVariables.SSBlueKD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained / (100000 / StupidDbcModVariables.SSBlueKD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained / (100000 / StupidDbcModVariables.SSBlueKD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Buffed\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.BuffedKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning / (100000 / StupidDbcModVariables.BuffedKD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.BuffedKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning / (100000 / StupidDbcModVariables.BuffedKD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Buffed\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.BuffedKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning / (100000 / StupidDbcModVariables.BuffedKD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool == 0
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool < 0) {
			{
				String _setval = "\"Base\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.transformation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"None\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue Evolved\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueEvolvedKiDrain - Math
						.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining / (100000 / StupidDbcModVariables.SSBlueEvolvedKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue Evolved\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueEvolvedKiDrain - Math
						.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining / (100000 / StupidDbcModVariables.SSBlueEvolvedKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSBlueEvolvedKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining / (100000 / StupidDbcModVariables.SSBlueEvolvedKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Golden Oozaru\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.GoldenOozaruKiDrain - Math
						.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GoldenOozaruTraining / (100000 / StupidDbcModVariables.GoldenOozaruKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.GoldenOozaruKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GoldenOozaruTraining / (100000 / StupidDbcModVariables.GoldenOozaruKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4KiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training / (100000 / StupidDbcModVariables.SS4KiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4KiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training / (100000 / StupidDbcModVariables.SS4KiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4 - Limit Breaker\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4LBKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining / (100000 / StupidDbcModVariables.SS4LBKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4LBKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining / (100000 / StupidDbcModVariables.SS4LBKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Golden Oozaru\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.GoldenOozaruKiDrain - Math
						.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GoldenOozaruTraining / (100000 / StupidDbcModVariables.GoldenOozaruKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4KiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training / (100000 / StupidDbcModVariables.SS4KiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4 - Limit Breaker\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SS4LBKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining / (100000 / StupidDbcModVariables.SS4LBKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseTraining / (100000 / StupidDbcModVariables.SSRoseKD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseTraining / (100000 / StupidDbcModVariables.SSRoseKD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseKD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseTraining / (100000 / StupidDbcModVariables.SSRoseKD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose Grade 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseG2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training / (100000 / StupidDbcModVariables.SSRoseG2KD))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseG2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training / (100000 / StupidDbcModVariables.SSRoseG2KD)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose Grade 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.SSRoseG2KD
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training / (100000 / StupidDbcModVariables.SSRoseG2KD))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Ultimate\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ultimateKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ultimateTraining / (100000 / StupidDbcModVariables.ultimateKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ultimateKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ultimateTraining / (100000 / StupidDbcModVariables.ultimateKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Ultimate\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ultimateKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ultimateTraining / (100000 / StupidDbcModVariables.ultimateKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Beast\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.beastKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).beastTraining / (100000 / StupidDbcModVariables.beastKiDrain))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.beastKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).beastTraining / (100000 / StupidDbcModVariables.ultimateKiDrain)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Beast\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.beastKiDrain
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).beastTraining / (100000 / StupidDbcModVariables.beastKiDrain))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training / (100000 / StupidDbcModVariables.ssblue2kd))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training / (100000 / StupidDbcModVariables.ssblue2kd)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training / (100000 / StupidDbcModVariables.ssblue2kd))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training / (100000 / StupidDbcModVariables.ssrose2kd))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training / (100000 / StupidDbcModVariables.ssrose2kd)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 2\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose2kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training / (100000 / StupidDbcModVariables.ssrose2kd))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue3training / (100000 / StupidDbcModVariables.ssblue3kd))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue3training / (100000 / StupidDbcModVariables.ssblue3kd)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssblue3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue3training / (100000 / StupidDbcModVariables.ssblue3kd))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose3Training / (100000 / StupidDbcModVariables.ssrose3kd))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose3Training / (100000 / StupidDbcModVariables.ssrose3kd)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 3\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.ssrose3kd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose3Training / (100000 / StupidDbcModVariables.ssrose3kd))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"The Primal God\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.tpgkd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tpgTraining / (100000 / StupidDbcModVariables.tpgkd))) > 0) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.tpgkd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tpgTraining / (100000 / StupidDbcModVariables.tpgkd)));
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"The Primal God\"")
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool - (StupidDbcModVariables.tpgkd
						- Math.round((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tpgTraining / (100000 / StupidDbcModVariables.tpgkd))) <= 0) {
			{
				double _setval = 0;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KiPool = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KiPool <= 0) {
			{
				String _setval = "\"Base\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.transformation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"None\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
