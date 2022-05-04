
package net.mcreator.undogo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.undogo.init.UndogoModFluids;

public class ToxicWaterItem extends BucketItem {
	public ToxicWaterItem() {
		super(() -> UndogoModFluids.TOXIC_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("toxic_water_bucket");
	}
}
