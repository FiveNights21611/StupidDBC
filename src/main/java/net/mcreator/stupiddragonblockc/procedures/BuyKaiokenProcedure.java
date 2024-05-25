package net.mcreator.stupiddragonblockc.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class BuyKaiokenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 0 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx2price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "Kaioken";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.TransformationType = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 1 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx3price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 2 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx4price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 3 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 4;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx5price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 4 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 5;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx10price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 5 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 6;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx20price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 6 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 7;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx50price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 7 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 8;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StupidDbcModVariables.kaiokenx100price;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 8 && ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).costOfKaioken;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 9;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KaiokenLvl = _setval;
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
					capability.costOfKaioken = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl == 9) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Kaioken Maxed"), false);
		}
	}
}
