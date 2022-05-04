
package net.mcreator.undogo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.undogo.init.UndogoModFluids;

public class SpaceFluidItem extends BucketItem {
	public SpaceFluidItem() {
		super(() -> UndogoModFluids.SPACE_FLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("space_fluid_bucket");
	}
}
