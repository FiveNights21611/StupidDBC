package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class ObtainKaiokenProcedure {
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
			DoKaiokenProcedure.execute(entity);
		}
	}
}
