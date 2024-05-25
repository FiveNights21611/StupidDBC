
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

import net.mcreator.stupiddragonblockc.local_templates.UniversalCommunicatorBlockItemBI;
import net.mcreator.stupiddragonblockc.local_templates.TheRevivinatorBlockItemBI;
import net.mcreator.stupiddragonblockc.local_templates.KatchinOreBlockItemBI;
import net.mcreator.stupiddragonblockc.local_templates.GravitySimulatorBlockItemBI;
import net.mcreator.stupiddragonblockc.local_templates.DragonBlockBlockItemBI;
import net.mcreator.stupiddragonblockc.item.UniversalSatelliteItem;
import net.mcreator.stupiddragonblockc.item.RawKatchinItem;
import net.mcreator.stupiddragonblockc.item.MiniScreenItem;
import net.mcreator.stupiddragonblockc.item.KeyboardItem;
import net.mcreator.stupiddragonblockc.item.IconItem;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StupidDbcMod.MODID);
	public static final RegistryObject<Item> THE_REVIVINATOR = block(StupidDbcModBlocks.THE_REVIVINATOR, StupidDbcModTabs.TAB_STUPID_DBC, TheRevivinatorBlockItemBI.modifyProperties(new Item.Properties()));
	public static final RegistryObject<Item> KATCHIN_ORE = block(StupidDbcModBlocks.KATCHIN_ORE, StupidDbcModTabs.TAB_STUPID_DBC, KatchinOreBlockItemBI.modifyProperties(new Item.Properties()));
	public static final RegistryObject<Item> RAW_KATCHIN = REGISTRY.register("raw_katchin", () -> new RawKatchinItem());
	public static final RegistryObject<Item> ICON = REGISTRY.register("icon", () -> new IconItem());
	public static final RegistryObject<Item> GRAVITY_SIMULATOR = block(StupidDbcModBlocks.GRAVITY_SIMULATOR, StupidDbcModTabs.TAB_STUPID_DBC, GravitySimulatorBlockItemBI.modifyProperties(new Item.Properties()));
	public static final RegistryObject<Item> UNIVERSAL_COMMUNICATOR = block(StupidDbcModBlocks.UNIVERSAL_COMMUNICATOR, StupidDbcModTabs.TAB_STUPID_DBC, UniversalCommunicatorBlockItemBI.modifyProperties(new Item.Properties()));
	public static final RegistryObject<Item> KEYBOARD = REGISTRY.register("keyboard", () -> new KeyboardItem());
	public static final RegistryObject<Item> UNIVERSAL_SATELLITE = REGISTRY.register("universal_satellite", () -> new UniversalSatelliteItem());
	public static final RegistryObject<Item> MINI_SCREEN = REGISTRY.register("mini_screen", () -> new MiniScreenItem());
	public static final RegistryObject<Item> VEGETA_SS_1_SPAWN_EGG = REGISTRY.register("vegeta_ss_1_spawn_egg", () -> new ForgeSpawnEggItem(StupidDbcModEntities.VEGETA_SS_1, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DRAGON_BLOCK = block(StupidDbcModBlocks.DRAGON_BLOCK, StupidDbcModTabs.TAB_STUPID_DBC, DragonBlockBlockItemBI.modifyProperties(new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab, Item.Properties property) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), property.tab(tab)));
	}

}
