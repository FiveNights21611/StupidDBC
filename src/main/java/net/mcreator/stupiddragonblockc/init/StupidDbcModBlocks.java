
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stupiddragonblockc.block.UniversalCommunicatorBlock;
import net.mcreator.stupiddragonblockc.block.TheRevivinatorBlock;
import net.mcreator.stupiddragonblockc.block.KatchinOreBlock;
import net.mcreator.stupiddragonblockc.block.GravitySimulatorBlock;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StupidDbcMod.MODID);
	public static final RegistryObject<Block> THE_REVIVINATOR = REGISTRY.register("the_revivinator", () -> new TheRevivinatorBlock());
	public static final RegistryObject<Block> KATCHIN_ORE = REGISTRY.register("katchin_ore", () -> new KatchinOreBlock());
	public static final RegistryObject<Block> GRAVITY_SIMULATOR = REGISTRY.register("gravity_simulator", () -> new GravitySimulatorBlock());
	public static final RegistryObject<Block> UNIVERSAL_COMMUNICATOR = REGISTRY.register("universal_communicator", () -> new UniversalCommunicatorBlock());
}
