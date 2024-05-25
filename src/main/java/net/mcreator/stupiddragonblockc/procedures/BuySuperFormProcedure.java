package net.mcreator.stupiddragonblockc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class BuySuperFormProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 0 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
					|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SSGrade2Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "SS Grade 2";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransformationType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained > 24999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 2;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SSGrade3Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained < 25000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained > 49999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 3;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.FPSSPrice;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained < 50000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan Grade 2!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained == 100000
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 4;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SS2Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan to the max!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained > 9999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SS3Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "SS2";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransformationType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 10000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train your Full Power Super Saiyan form just a little more!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 5
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained > 14999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 6;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
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
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 5
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained < 15000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train in Super Saiyan 2 a little more!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 6) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Super Form Maxed!"), false);
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 0 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
					|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
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
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "Buffed";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransformationType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 1) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Super Form Maxed!"), false);
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")) {
			if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 0 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
					|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SSGrade2Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "SS Grade 2";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransformationType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained > 24999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 2;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SSGrade3Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 1
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained < 25000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained > 49999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 3;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.FPSSPrice;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 2
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSGrade2Trained < 50000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan Grade 2!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained == 100000
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 4;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SS2Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 3
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperSaiyanTrained < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train Super Saiyan to the max!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained > 9999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 5;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.SS3Price;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "SS2";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransformationType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 4
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).FPSSTrained < 10000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train your Full Power Super Saiyan form just a little more!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 5
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained > 14999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 6;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 500000;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 5
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS2Trained < 15000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to train in Super Saiyan 2 a little more!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 6
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GoldenOozaruTraining > 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 7;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 675000;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 6
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).GoldenOozaruTraining < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to max out Golden Oozaru!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 7
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training > 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 8;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = StupidDbcModVariables.tpgprice;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 7
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training < 100000) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need to max out Super Saiyan 4!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 8
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training > 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining > 99999
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training > 99999)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm) {
				{
					double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
							- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tp = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 9;
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SuperFormLevel = _setval;
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
						capability.costOfSuperForm = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 8
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4Training > 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining > 99999
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training > 99999)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need more TP!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 8
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining < 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining > 999999
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training > 999999)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need To Train SS4-LB To The Max!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 8
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining > 99999
					&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueEvolvedTraining < 100000
							|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSRoseG2Training < 100000)
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp >= (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You need To Train SSBlueEvolved/RoseGrade2 to the Max!"), false);
			} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel == 9) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Super Form Maxed!"), false);
			}
		}
	}
}
