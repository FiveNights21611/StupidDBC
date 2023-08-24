
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.stupiddragonblockc.world.features.ores.KatchinOreFeature;
import net.mcreator.stupiddragonblockc.world.features.GoReviveFeature;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

@Mod.EventBusSubscriber
public class StupidDbcModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, StupidDbcMod.MODID);
	public static final RegistryObject<Feature<?>> GO_REVIVE = REGISTRY.register("go_revive", GoReviveFeature::feature);
	public static final RegistryObject<Feature<?>> KATCHIN_ORE = REGISTRY.register("katchin_ore", KatchinOreFeature::feature);
}
