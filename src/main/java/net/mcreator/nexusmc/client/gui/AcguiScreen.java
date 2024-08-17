package net.mcreator.nexusmc.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.nexusmc.world.inventory.AcguiMenu;
import net.mcreator.nexusmc.procedures.ErrorProcedure;
import net.mcreator.nexusmc.network.AcguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AcguiScreen extends AbstractContainerScreen<AcguiMenu> {
	private final static HashMap<String, Object> guistate = AcguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox ac;
	Button button_login;

	public AcguiScreen(AcguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("nexus:textures/screens/acgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		ac.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("nexus:textures/screens/rgt.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (ac.isFocused())
			return ac.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.acgui.label_admin_login"), 59, 6, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.acgui.label_username"), 62, 56, -16711936, false);
		guiGraphics.drawString(this.font,

				ErrorProcedure.execute(), 5, 150, -65536, false);
	}

	@Override
	public void init() {
		super.init();
		ac = new EditBox(this.font, this.leftPos + 29, this.topPos + 70, 118, 18, Component.translatable("gui.nexus.acgui.ac"));
		ac.setMaxLength(32767);
		guistate.put("text:ac", ac);
		this.addWidget(this.ac);
		button_login = Button.builder(Component.translatable("gui.nexus.acgui.button_login"), e -> {
			if (true) {
				textstate.put("textin:ac", ac.getValue());
				PacketDistributor.SERVER.noArg().send(new AcguiButtonMessage(0, x, y, z, textstate));
				AcguiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 62, this.topPos + 106, 51, 20).build();
		guistate.put("button:button_login", button_login);
		this.addRenderableWidget(button_login);
	}
}
