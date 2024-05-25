
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.stupiddragonblockc.block.entity.UniversalCommunicatorBlockEntity;
import net.mcreator.stupiddragonblockc.block.entity.TheRevivinatorBlockEntity;
import net.mcreator.stupiddragonblockc.block.entity.GravitySimulatorBlockEntity;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StupidDbcMod.MODID);
	public static final RegistryObject<BlockEntityType<TheRevivinatorBlockEntity>> THE_REVIVINATOR = REGISTRY.register("the_revivinator",
			() -> BlockEntityType.Builder.of(TheRevivinatorBlockEntity::new, StupidDbcModBlocks.THE_REVIVINATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<GravitySimulatorBlockEntity>> GRAVITY_SIMULATOR = REGISTRY.register("gravity_simulator",
			() -> BlockEntityType.Builder.of(GravitySimulatorBlockEntity::new, StupidDbcModBlocks.GRAVITY_SIMULATOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<UniversalCommunicatorBlockEntity>> UNIVERSAL_COMMUNICATOR = REGISTRY.register("universal_communicator",
			() -> BlockEntityType.Builder.of(UniversalCommunicatorBlockEntity::new, StupidDbcModBlocks.UNIVERSAL_COMMUNICATOR.get()).build(null));
}
