package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class IncreaseStrengthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double tmp = 0;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tpCost
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).tpCost)
				&& (StupidDbcModVariables.MaxStats > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Strength
						+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).amountToBuy
						|| StupidDbcModVariables.MaxStats == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Strength
								+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).amountToBuy)) {
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Strength
						+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).amountToBuy;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp
						- (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tpCost;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			DoChangeStrengthProcedure.execute(entity);
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp > (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new StupidDbcModVariables.PlayerVariables())).tpCost
				|| (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp == (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new StupidDbcModVariables.PlayerVariables())).tpCost)
				&& StupidDbcModVariables.MaxStats < (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Strength
						+ (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).amountToBuy) {
			tmp = StupidDbcModVariables.MaxStats - (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Strength;
			{
				double _setval = StupidDbcModVariables.MaxStats;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Strength = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp - tmp * StupidDbcModVariables.BaseTpCost;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			DoChangeStrengthProcedure.execute(entity);
		}
	}
}
