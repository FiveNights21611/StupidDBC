package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class VegetaFlightProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean logic = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player) {
			logic = entity.getY() < (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY();
		} else {
			logic = false;
		}
		return logic;
	}
}
