
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.stupiddragonblockc.potion.LegendaryMobEffect;
import net.mcreator.stupiddragonblockc.potion.ChargingUpMobEffect;
import net.mcreator.stupiddragonblockc.potion.ChargingDownMobEffect;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StupidDbcMod.MODID);
	public static final RegistryObject<MobEffect> CHARGING_UP = REGISTRY.register("charging_up", () -> new ChargingUpMobEffect());
	public static final RegistryObject<MobEffect> CHARGING_DOWN = REGISTRY.register("charging_down", () -> new ChargingDownMobEffect());
	public static final RegistryObject<MobEffect> LEGENDARY = REGISTRY.register("legendary", () -> new LegendaryMobEffect());
}
