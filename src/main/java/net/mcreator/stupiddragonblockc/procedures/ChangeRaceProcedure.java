package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class ChangeRaceProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).InBetweenRace).equals("\"Saiyan\"")) {
			{
				String _setval = "\"Half-Saiyan\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InBetweenRace = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).InBetweenRace).equals("\"Half-Saiyan\"")) {
			{
				String _setval = "\"Human\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InBetweenRace = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).InBetweenRace).equals("\"Human\"")) {
			{
				String _setval = "\"Saiyan\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InBetweenRace = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).InBetweenRace).equals("\"\"")) {
			{
				String _setval = "\"Saiyan\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InBetweenRace = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
