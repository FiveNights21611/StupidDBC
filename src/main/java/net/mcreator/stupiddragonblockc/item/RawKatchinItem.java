
package net.mcreator.stupiddragonblockc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stupiddragonblockc.procedures.HoldKatchinShardDoProcedure;
import net.mcreator.stupiddragonblockc.init.StupidDbcModTabs;

import java.util.List;

public class RawKatchinItem extends Item {
	public RawKatchinItem() {
		super(new Item.Properties().tab(StupidDbcModTabs.TAB_STUPID_DBC).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The Densest Metal Known to Angel-Kind..."));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HoldKatchinShardDoProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
