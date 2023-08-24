
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stupiddragonblockc.block.entity.UniversalCommunicatorBlockEntity;
import net.mcreator.stupiddragonblockc.block.entity.TheRevivinatorBlockEntity;
import net.mcreator.stupiddragonblockc.block.entity.GravitySimulatorBlockEntity;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StupidDbcMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> THE_REVIVINATOR = register("the_revivinator", StupidDbcModBlocks.THE_REVIVINATOR, TheRevivinatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRAVITY_SIMULATOR = register("gravity_simulator", StupidDbcModBlocks.GRAVITY_SIMULATOR, GravitySimulatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNIVERSAL_COMMUNICATOR = register("universal_communicator", StupidDbcModBlocks.UNIVERSAL_COMMUNICATOR, UniversalCommunicatorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
