package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class TPCostGFProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "TP Cost: " + new java.text.DecimalFormat("###,###,###,###.##").format((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).CosrOfGodForm);
	}
}
