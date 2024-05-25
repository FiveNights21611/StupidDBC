package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class AddTechniqueXPProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "technique")).equals("Kaioken")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 0) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenTraining + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenTraining = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenTraining + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenTraining = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx2")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 1) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx2Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx2Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx2Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx2Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx3")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 2) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx3Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx3Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx3Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx3Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx4")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 3) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx4Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx4Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx4Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx4Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx5")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 4) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx5Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx5Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx5Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx5Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx10")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 5) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx10Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx10Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx10Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx10Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx20")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 6) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx20Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx20Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx20Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx20Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx50")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 7) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx50Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx50Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx50Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx50Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "technique")).equals("Kaiokenx100")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
					if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).KaiokenLvl > 8) {
						if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx100Training + DoubleArgumentType.getDouble(arguments, "xp") > 100000) {
							{
								double _setval = 100000;
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx100Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							{
								double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).kaiokenx100Training + DoubleArgumentType.getDouble(arguments, "xp");
								entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.kaiokenx100Training = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
