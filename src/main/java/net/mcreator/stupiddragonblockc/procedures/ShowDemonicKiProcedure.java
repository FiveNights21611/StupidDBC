package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class ShowDemonicKiProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment < 0;
	}
}
