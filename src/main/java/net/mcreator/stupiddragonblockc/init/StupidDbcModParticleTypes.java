
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, StupidDbcMod.MODID);
	public static final RegistryObject<SimpleParticleType> PLAYER_BASE_AURA = REGISTRY.register("player_base_aura", () -> new SimpleParticleType(true));
}
