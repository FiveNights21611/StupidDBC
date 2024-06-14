package net.mcreator.stupiddragonblockc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;
import net.mcreator.stupiddragonblockc.init.StupidDbcModParticleTypes;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class PlayerAuraProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
			StupidDbcMod.LOGGER.debug("Did Aura");
		} else {
			StupidDbcMod.LOGGER.debug("Couldn't Do Aura");
		}
		StupidDbcMod.LOGGER.debug("Tried Aura");
	}
}
