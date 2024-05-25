package net.mcreator.stupiddragonblockc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class BuyUltraInstinctProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).UltraInstintLevel == 0
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained > 49999
				&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
						|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfUltraInstinct;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.UltraInstintLevel = _setval;
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
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).UltraInstintLevel == 0
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained < 50000
				&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm
						|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm)) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You need to train Super Saiyan Blue!"), false);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).UltraInstintLevel == 0
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SSBlueTrained > 49999
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfSuperForm) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You need to more TP!"), false);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfUltraInstinct == 1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Super Form Maxed!"), false);
		}
	}
}
