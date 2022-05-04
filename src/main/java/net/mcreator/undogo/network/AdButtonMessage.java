
package net.mcreator.undogo.network;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.undogo.world.inventory.AdMenu;
import net.mcreator.undogo.procedures.CloseProcedure;
import net.mcreator.undogo.UndogoMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdButtonMessage {
	private final int buttonID, x, y, z;

	public AdButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public AdButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(AdButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(AdButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = AdMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 1) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 2) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 3) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 4) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 5) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 6) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 7) {

			CloseProcedure.execute(entity);
		}
		if (buttonID == 8) {

			CloseProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		UndogoMod.addNetworkMessage(AdButtonMessage.class, AdButtonMessage::buffer, AdButtonMessage::new, AdButtonMessage::handler);
	}
}
