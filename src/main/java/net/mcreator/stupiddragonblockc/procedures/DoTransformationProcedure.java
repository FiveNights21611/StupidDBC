package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class DoTransformationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingSSGrade2 == true) {
			DoSSGradesProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingSS2 == true) {
			DOSS2Procedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingKaioken == true) {
			DoKaiokenProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingSSGod == true) {
			DoSSGodProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingSSBlue == true) {
			DoSSBlueProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).IsUsingSS4 == true) {
			DoSS4Procedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DoUltimate == true) {
			TransformIntoUltimateProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).DoBeast == true) {
			TransformIntoBeastProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).isUsingTPG == true) {
			DoTPGProcedure.execute(entity);
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).isUsingUI == true) {
			DoUIProcedure.execute(entity);
		}
		TransformationHandlerProcedure.execute(entity);
		TechniqueHandlerProcedure.execute(entity);
		TransformationSizeProcedure.execute(entity);
		DoChangeStrengthProcedure.execute(entity);
		DoChangeDefProcedure.execute(entity);
		DoChangeWilProcedure.execute(entity);
	}
}
