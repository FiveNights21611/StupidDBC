package net.mcreator.stupiddragonblockc.procedures;

import top.theillusivec4.curios.api.event.CurioChangeEvent;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;
import net.mcreator.stupiddragonblockc.init.StupidDbcModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MoreCuriosStuffProcedure {
	@SubscribeEvent
	public static void onCurioUnequip(CurioChangeEvent event) {
		execute(event, event.getEntity(), event.getFrom());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == StupidDbcModItems.TURTLE_SHELL_WEIGHT.get() || itemstack.getItem() == StupidDbcModItems.T_SHIRT_WEIGHT.get()) {
			{
				double _setval = 1;
				entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.weight = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
