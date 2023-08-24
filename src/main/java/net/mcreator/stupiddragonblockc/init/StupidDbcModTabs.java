
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class StupidDbcModTabs {
	public static CreativeModeTab TAB_STUPID_DBC;

	public static void load() {
		TAB_STUPID_DBC = new CreativeModeTab("tabstupid_dbc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(StupidDbcModItems.ICON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
