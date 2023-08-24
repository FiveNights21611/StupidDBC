/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;

import net.mcreator.stupiddragonblockc.StupidDbcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StupidDbcModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, StupidDbcMod.MODID);
	public static final RegistryObject<Attribute> ENTITY_DBC_MAX_HEALTH = ATTRIBUTES.register("entity_dbc_max_health", () -> (new RangedAttribute(StupidDbcMod.MODID + ".attribute" + ".entity_dbc_max_health", 0, 0, 1000000000)).setSyncable(true));
	public static final RegistryObject<Attribute> ENTITY_DBC_HEALTH = ATTRIBUTES.register("entity_dbc_health", () -> (new RangedAttribute(StupidDbcMod.MODID + ".attribute" + ".entity_dbc_health", 0, 0, 1000000000)).setSyncable(true));
	public static final RegistryObject<Attribute> ENTITY_DBC_SPAWNED_IN = ATTRIBUTES.register("entity_dbc_spawned_in", () -> (new RangedAttribute(StupidDbcMod.MODID + ".attribute" + ".entity_dbc_spawned_in", 0, 0, 1)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(StupidDbcModEntities.VEGETA_SS_1.get(), ENTITY_DBC_MAX_HEALTH.get());
		event.add(StupidDbcModEntities.VEGETA_SS_1.get(), ENTITY_DBC_HEALTH.get());
		event.add(StupidDbcModEntities.VEGETA_SS_1.get(), ENTITY_DBC_SPAWNED_IN.get());
	}
}
