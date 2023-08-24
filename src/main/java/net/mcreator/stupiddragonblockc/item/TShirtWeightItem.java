
package net.mcreator.stupiddragonblockc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.stupiddragonblockc.init.StupidDbcModTabs;

public class TShirtWeightItem extends Item {
	public TShirtWeightItem() {
		super(new Item.Properties().tab(StupidDbcModTabs.TAB_STUPID_DBC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
