
package net.mcreator.stupiddragonblockc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.stupiddragonblockc.init.StupidDbcModTabs;

public class TurtleShellWeightItem extends Item {
	public TurtleShellWeightItem() {
		super(new Item.Properties().tab(StupidDbcModTabs.TAB_STUPID_DBC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
