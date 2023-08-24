package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;
import net.mcreator.stupiddragonblockc.init.StupidDbcModParticleTypes;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerAuraProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind == true) {
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x + 0.75), y, z, 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x - 0.75), y, z, 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z - 0.75), 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z + 0.75), 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x + 0.5), y, z, 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x - 0.5), y, z, 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z - 0.5), 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z + 0.5), 0, 0.08, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x + 0.1), y, z, 0, 0.1, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), (x - 0.1), y, z, 0, 0.1, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z - 0.1), 0, 0.1, 0);
			world.addParticle((SimpleParticleType) (StupidDbcModParticleTypes.PLAYER_BASE_AURA.get()), x, y, (z + 0.1), 0, 0.1, 0);
			StupidDbcMod.LOGGER.info("Did Aura");
		} else {
			StupidDbcMod.LOGGER.info("Couldn't Do Aura");
		}
		StupidDbcMod.LOGGER.info("Tried Aura");
	}
}
