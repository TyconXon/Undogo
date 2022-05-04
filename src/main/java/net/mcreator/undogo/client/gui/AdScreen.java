
package net.mcreator.undogo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.undogo.world.inventory.AdMenu;
import net.mcreator.undogo.network.AdButtonMessage;
import net.mcreator.undogo.UndogoMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AdScreen extends AbstractContainerScreen<AdMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AdScreen(AdMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 255;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("undogo:textures/ad.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/1.png"));
		this.blit(ms, this.leftPos + -122, this.topPos + 16, 0, 0, 328, 246, 328, 246);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/flashupdate1.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 67, 0, 0, 280, 176, 280, 176);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/spamton_face_shop.png"));
		this.blit(ms, this.leftPos + 160, this.topPos + 102, 0, 0, 100, 114, 100, 114);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "VIRUS DETECTED!!!", -19, 2, -65536);
		this.font.draw(poseStack, "YOUR COMPUTER HAS A VIRUS", 103, -18, -65536);
		this.font.draw(poseStack, "WARNING", 261, 28, -14592);
		this.font.draw(poseStack, "!!!", -54, 75, -50176);
		this.font.draw(poseStack, "CLICK HERE", 46, 157, -65536);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 270, this.topPos + 53, 30, 20, new TextComponent("X"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(0, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 99, 72, 20, new TextComponent("SCAN NOW!"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(1, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 128, this.topPos + 65, 51, 20, new TextComponent("CLAIM"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(2, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 54, this.topPos + 26, 354, 20,
				new TextComponent("CONGRATZ CONGRATZ CONGRATZ CONGRATZ CONGRATZ CONGRATZ CONGRATZ "), e -> {
					if (true) {
						UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(3, x, y, z));
						AdButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}));
		this.addRenderableWidget(new Button(this.leftPos + -56, this.topPos + 12, 61, 20, new TextComponent("WARNING"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(4, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(
				new Button(this.leftPos + 170, this.topPos + -7, 186, 20, new TextComponent("IS YOUR COMPUTER SAFE? CALL 555"), e -> {
					if (true) {
						UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(5, x, y, z));
						AdButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}));
		this.addRenderableWidget(new Button(this.leftPos + 34, this.topPos + 152, 77, 20, new TextComponent("CLICK GERE"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(6, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(
				new Button(this.leftPos + -66, this.topPos + 45, 227, 20, new TextComponent("NOWS YOUR CHANCE TO BE A BIG SHOT TODAY"), e -> {
					if (true) {
						UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(7, x, y, z));
						AdButtonMessage.handleButtonAction(entity, 7, x, y, z);
					}
				}));
		this.addRenderableWidget(new Button(this.leftPos + -52, this.topPos + 73, 113, 20, new TextComponent("DEALS DEALS DEALS"), e -> {
			if (true) {
				UndogoMod.PACKET_HANDLER.sendToServer(new AdButtonMessage(8, x, y, z));
				AdButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
	}
}
