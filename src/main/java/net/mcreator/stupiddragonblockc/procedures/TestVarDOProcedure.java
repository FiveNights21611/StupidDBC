package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

public class TestVarDOProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Charging Up: " + (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind)), false);
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Charging Down: " + (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind2)), false);
	}
}
