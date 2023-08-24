
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stupiddragonblockc.item.UniversalSatelliteItem;
import net.mcreator.stupiddragonblockc.item.TurtleShellWeightItem;
import net.mcreator.stupiddragonblockc.item.TShirtWeightItem;
import net.mcreator.stupiddragonblockc.item.RawKatchinItem;
import net.mcreator.stupiddragonblockc.item.MiniScreenItem;
import net.mcreator.stupiddragonblockc.item.KeyboardItem;
import net.mcreator.stupiddragonblockc.item.IconItem;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StupidDbcMod.MODID);
	public static final RegistryObject<Item> THE_REVIVINATOR = block(StupidDbcModBlocks.THE_REVIVINATOR, StupidDbcModTabs.TAB_STUPID_DBC);
	public static final RegistryObject<Item> KATCHIN_ORE = block(StupidDbcModBlocks.KATCHIN_ORE, StupidDbcModTabs.TAB_STUPID_DBC);
	public static final RegistryObject<Item> RAW_KATCHIN = REGISTRY.register("raw_katchin", () -> new RawKatchinItem());
	public static final RegistryObject<Item> TURTLE_SHELL_WEIGHT = REGISTRY.register("turtle_shell_weight", () -> new TurtleShellWeightItem());
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());
	public static final RegistryObject<Item> T_SHIRT_WEIGHT = REGISTRY.register("t_shirt_weight", () -> new TShirtWeightItem());
	public static final RegistryObject<Item> GRAVITY_SIMULATOR = block(StupidDbcModBlocks.GRAVITY_SIMULATOR, StupidDbcModTabs.TAB_STUPID_DBC);
	public static final RegistryObject<Item> UNIVERSAL_COMMUNICATOR = block(StupidDbcModBlocks.UNIVERSAL_COMMUNICATOR, StupidDbcModTabs.TAB_STUPID_DBC);
	public static final RegistryObject<Item> KEYBOARD = REGISTRY.register("keyboard", () -> new KeyboardItem());
	public static final RegistryObject<Item> UNIVERSAL_SATELLITE = REGISTRY.register("universal_satellite", () -> new UniversalSatelliteItem());
	public static final RegistryObject<Item> MINI_SCREEN = REGISTRY.register("mini_screen", () -> new MiniScreenItem());
	public static final RegistryObject<Item> VEGETA_SS_1_SPAWN_EGG = REGISTRY.register("vegeta_ss_1_spawn_egg", () -> new ForgeSpawnEggItem(StupidDbcModEntities.VEGETA_SS_1, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
