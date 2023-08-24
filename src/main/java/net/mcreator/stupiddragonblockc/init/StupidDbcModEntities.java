
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.stupiddragonblockc.entity.WhisMasterEntity;
import net.mcreator.stupiddragonblockc.entity.VegetaSS1Entity;
import net.mcreator.stupiddragonblockc.entity.KingKaiEntity;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StupidDbcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StupidDbcMod.MODID);
	public static final RegistryObject<EntityType<KingKaiEntity>> KING_KAI = register("king_kai",
			EntityType.Builder.<KingKaiEntity>of(KingKaiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KingKaiEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VegetaSS1Entity>> VEGETA_SS_1 = register("vegeta_ss_1",
			EntityType.Builder.<VegetaSS1Entity>of(VegetaSS1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VegetaSS1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhisMasterEntity>> WHIS_MASTER = register("whis_master",
			EntityType.Builder.<WhisMasterEntity>of(WhisMasterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhisMasterEntity::new)

					.sized(0.6f, 2.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KingKaiEntity.init();
			VegetaSS1Entity.init();
			WhisMasterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KING_KAI.get(), KingKaiEntity.createAttributes().build());
		event.put(VEGETA_SS_1.get(), VegetaSS1Entity.createAttributes().build());
		event.put(WHIS_MASTER.get(), WhisMasterEntity.createAttributes().build());
	}
}
