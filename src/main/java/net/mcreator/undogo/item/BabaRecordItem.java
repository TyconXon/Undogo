
package net.mcreator.undogo.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.undogo.procedures.BabaRecordRightClickedOnBlockProcedure;
import net.mcreator.undogo.procedures.BabaRecordRightClickedInAirProcedure;
import net.mcreator.undogo.init.UndogoModSounds;

public class BabaRecordItem extends RecordItem {
	public BabaRecordItem() {
		super(0, UndogoModSounds.REGISTRY.get(new ResourceLocation("undogo:baba")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("baba_record");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BabaRecordRightClickedInAirProcedure.execute(world);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		BabaRecordRightClickedOnBlockProcedure.execute(

		);
		return retval;
	}
}
