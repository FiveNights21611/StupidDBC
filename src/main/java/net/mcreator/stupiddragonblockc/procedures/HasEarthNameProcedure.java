package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import java.util.HashMap;

public class HasEarthNameProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("checkbox:hasEarthName") ? ((Checkbox) guistate.get("checkbox:hasEarthName")).selected() : false) == true) {
			{
				boolean _setval = true;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hasEarthName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((guistate.containsKey("checkbox:hasEarthName") ? ((Checkbox) guistate.get("checkbox:hasEarthName")).selected() : false) == false) {
			{
				boolean _setval = false;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.hasEarthName = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
