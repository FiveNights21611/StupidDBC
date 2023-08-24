
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.stupiddragonblockc.world.biome.OtherworldType2Biome;
import net.mcreator.stupiddragonblockc.world.biome.OtherworldType1Biome;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, StupidDbcMod.MODID);
	public static final RegistryObject<Biome> OTHERWORLD_TYPE_1 = REGISTRY.register("otherworld_type_1", OtherworldType1Biome::createBiome);
	public static final RegistryObject<Biome> OTHERWORLD_TYPE_2 = REGISTRY.register("otherworld_type_2", OtherworldType2Biome::createBiome);
}
