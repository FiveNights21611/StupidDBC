package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class SS4LBTrainingProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "SS4 LB: " + new java.text.DecimalFormat("###,###").format((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SS4LBTraining / 1000);
	}
}
