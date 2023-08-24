package net.mcreator.stupiddragonblockc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class BuyGodFormProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000) {
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.costOfSSBlue;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough TP"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train FPSS More!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained == 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained == 100000) {
				{
					double _setval = 2;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.costOfSSBE;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 100000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained < 100000)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train FPSS and SSGod more!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained == 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained == 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough TP"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained >= 100000) {
				{
					double _setval = 3;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert("MAXED");
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained < 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need To Train SSBlue and SSGrade 3 to the max!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained >= 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need More TP!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 3) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("God Form Maxed"), (false));
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000) {
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.costOfSSBlue;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough TP"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train FPSS More!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained >= 100000) {
				{
					double _setval = 2;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.costOfSSBE;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 100000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained < 100000)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train FPSS and SSGod more!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGodTrained >= 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough TP"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained >= 100000) {
				{
					double _setval = 3;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.ssblue2price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained < 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need To Train SSBlue and SSGrade 3 to the max!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade3Trained >= 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need More TP!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining >= 75000) {
				{
					double _setval = 4;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.ssblue3price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained >= 100000
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining >= 75000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need More TP!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained < 100000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining < 75000)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train SSBlue and SSBlue Evolved to the Max!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training >= 10000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training >= 10000)) {
				{
					double _setval = 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert("MAXED");
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training >= 10000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training >= 10000)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You Need More TP!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).ssblue2training < 10000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRose2Training < 10000)) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train SSBlue and SSBlue Evolved to the Max!"), (false));
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning >= 60000) {
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GodFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert("MAXED");
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.CosrOfGodForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning >= 50000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You don't have enough TP"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 0
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).BuffedTraning < 50000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Buffed More!"), (false));
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GodFormLevel == 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("God Form Maxed"), (false));
			}
		}
	}
}
