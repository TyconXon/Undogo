
package net.mcreator.undogo.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.undogo.init.UndogoModSounds;

public class BigShotItem extends RecordItem {
	public BigShotItem() {
		super(0, UndogoModSounds.REGISTRY.get(new ResourceLocation("undogo:bigshot")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("big_shot");
	}
}
