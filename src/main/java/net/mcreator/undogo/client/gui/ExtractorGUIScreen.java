
package net.mcreator.undogo.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.undogo.world.inventory.ExtractorGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ExtractorGUIScreen extends AbstractContainerScreen<ExtractorGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ExtractorGUIScreen(ExtractorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("undogo:textures/extractor_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/stickynote_1.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 16, 0, 0, 20, 16, 20, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/stickynote_2.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 16, 0, 0, 20, 16, 20, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/stickynote1.png"));
		this.blit(ms, this.leftPos + -110, this.topPos + 7, 0, 0, 80, 80, 80, 80);

		RenderSystem.setShaderTexture(0, new ResourceLocation("undogo:textures/stickynote1.png"));
		this.blit(ms, this.leftPos + -74, this.topPos + 7, 0, 0, 80, 80, 80, 80);

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
		this.font.draw(poseStack, "Extractor", 6, 7, -12829636);
		this.font.draw(poseStack, "golden portal", -110, 16, -12829636);
		this.font.draw(poseStack, "+ xenium = xen", -110, 25, -12829636);
		this.font.draw(poseStack, "sealantern portal", -110, 43, -12829636);
		this.font.draw(poseStack, "+PLACEHOLDER = PLACEHOLDER", -110, 52, -12829636);
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
	}
}
