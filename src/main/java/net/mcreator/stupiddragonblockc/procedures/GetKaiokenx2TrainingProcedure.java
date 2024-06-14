package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class GetKaiokenx2TrainingProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Kaioken x2: " + new java.text.DecimalFormat("###.##").format((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx2Training / 1000);
	}
}
