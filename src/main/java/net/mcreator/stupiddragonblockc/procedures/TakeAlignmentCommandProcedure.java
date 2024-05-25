package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class TakeAlignmentCommandProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
				if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment - DoubleArgumentType.getDouble(arguments, "alignment") < -100) {
					{
						double _setval = -100;
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Alignment = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Alignment - DoubleArgumentType.getDouble(arguments, "alignment");
						entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Alignment = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
