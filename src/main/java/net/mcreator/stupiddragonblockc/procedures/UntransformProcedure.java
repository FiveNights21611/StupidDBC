package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class UntransformProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind2 == false) {
			{
				String _setval = "\"Base\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.transformation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				String _setval = "\"None\"";
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.technique = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind2 == true) {
			if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 3\"")) {
				{
					String _setval = "\"Super Saiyan Rose 2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose 2\"")) {
				{
					String _setval = "\"Super Saiyan Rose Grade 2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose Grade 2\"")) {
				{
					String _setval = "\"Super Saiyan Rose\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Rose\"")) {
				{
					String _setval = "\"Super Saiyan God\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan God\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 3\"")) {
				{
					String _setval = "\"Super Saiyan Blue 2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue 2\"")) {
				{
					String _setval = "\"Super Saiyan Blue Evolved\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue Evolved\"")) {
				{
					String _setval = "\"Super Saiyan Blue\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Blue\"")) {
				{
					String _setval = "\"Super Saiyan God\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan God\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4 - Limit Breaker\"")) {
				{
					String _setval = "\"Super Saiyan 4\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 4\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 3\"")) {
				{
					String _setval = "\"Super Saiyan 2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan 2\"")) {
				{
					String _setval = "\"Full Power Super Saiyan\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Full Power Super Saiyan\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 3\"")) {
				{
					String _setval = "\"Super Saiyan Grade 2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 2\"")
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel > 3) {
				{
					String _setval = "\"Full Power Super Saiyan\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan Grade 2\"")
					&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).SuperFormLevel < 4) {
				{
					String _setval = "\"Super Saiyan\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Full Power Super Saiyan\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).transformation).equals("\"Super Saiyan\"")) {
				{
					String _setval = "\"Base\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.transformation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x100\"")) {
				{
					String _setval = "\"Kaioken x50\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x50\"")) {
				{
					String _setval = "\"Kaioken x20\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x20\"")) {
				{
					String _setval = "\"Kaioken x10\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x10\"")) {
				{
					String _setval = "\"Kaioken x5\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x5\"")) {
				{
					String _setval = "\"Kaioken x4\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x4\"")) {
				{
					String _setval = "\"Kaioken x3\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x3\"")) {
				{
					String _setval = "\"Kaioken x2\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken x2\"")) {
				{
					String _setval = "\"Kaioken\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Kaioken\"")) {
				{
					String _setval = "\"None\"";
					entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.technique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		TransformationHandlerProcedure.execute(entity);
		TechniqueHandlerProcedure.execute(entity);
		TransformationSizeProcedure.execute(entity);
		DoChangeStrengthProcedure.execute(entity);
		DoChangeDefProcedure.execute(entity);
		DoChangeWilProcedure.execute(entity);
	}
}
