package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveLegendaryProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		StupidDbcModVariables.WorldVariables.get(world).i2 = StupidDbcModVariables.WorldVariables.get(world).i2 + 1;
		StupidDbcModVariables.WorldVariables.get(world).syncData(world);
		if (StupidDbcModVariables.WorldVariables.get(world).i2 >= 20 * 60 * StupidDbcModVariables.LegendaryRate) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= StupidDbcModVariables.LegendaryChance) {
				DoGiveLegendaryProcedure.execute(world, x, y, z);
			}
		}
	}
}
