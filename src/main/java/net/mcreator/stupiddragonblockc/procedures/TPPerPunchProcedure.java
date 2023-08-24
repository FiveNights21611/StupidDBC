package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class TPPerPunchProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")) {
			{
				double _setval = (sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp + Mth.nextInt(RandomSource.create(),
						(int) Math.round(((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.saiyanTpGain * 0.1 + 1)) / 2),
						(int) Math.round((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.saiyanTpGain * 0.1 + 1)));
				sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		} else if (((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")) {
			{
				double _setval = (sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp + Mth.nextInt(RandomSource.create(),
						(int) Math.round(
								((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.halfSaiyanTpGain * 0.1 + 1)) / 2),
						(int) Math.round((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.halfSaiyanTpGain * 0.1 + 1)));
				sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		} else if (((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
			{
				double _setval = (sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).tp + Mth.nextInt(RandomSource.create(),
						(int) Math.round(((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.humanTpGain * 0.1 + 1)) / 2),
						(int) Math.round((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).AvailableMind * (StupidDbcModVariables.humanTpGain * 0.1 + 1)));
				sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tp = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
