package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class DoTPGProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "\"The Primal God\"";
			entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.transformation = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
