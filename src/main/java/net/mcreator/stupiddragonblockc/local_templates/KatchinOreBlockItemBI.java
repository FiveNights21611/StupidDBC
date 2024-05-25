package net.mcreator.stupiddragonblockc.local_templates;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class KatchinOreBlockItemBI {
	public static Item.Properties modifyProperties(Item.Properties properties) {
		return properties.rarity(Rarity.UNCOMMON);
	}
}
