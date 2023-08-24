package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class DoKingKaiLinesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double r = 0;
		r = Mth.nextInt(RandomSource.create(), 1, 2);
		if (r == 1) {
			{
				String _setval = "\"Goku's told me about you!\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KingKaiSpeaking = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (r == 2) {
			{
				String _setval = "\"Tell me a joke, and I'll teach you something!\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.KingKaiSpeaking = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
