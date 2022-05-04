
package net.mcreator.undogo.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MetalScrapItem extends Item {
	public MetalScrapItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("metal_scrap");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
