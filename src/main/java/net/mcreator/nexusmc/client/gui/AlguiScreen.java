package net.mcreator.nexusmc.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.nexusmc.world.inventory.AlguiMenu;
import net.mcreator.nexusmc.procedures.ErrorProcedure;
import net.mcreator.nexusmc.network.AlguiButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AlguiScreen extends AbstractContainerScreen<AlguiMenu> {
	private final static HashMap<String, Object> guistate = AlguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox un;
	public static EditBox pw;
	Button button_login;
	Button button_login_via_acces_code;

	public AlguiScreen(AlguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("nexus:textures/screens/algui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		un.render(guiGraphics, mouseX, mouseY, partialTicks);
		pw.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (un.isFocused())
			return un.keyPressed(key, b, c);
		if (pw.isFocused())
			return pw.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.algui.label_admin_login"), 59, 6, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.algui.label_username"), 65, 27, -16711936, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.algui.label_password"), 65, 68, -16711936, false);
		guiGraphics.drawString(this.font,

				ErrorProcedure.execute(), 5, 150, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.algui.label_dont_know_your_login_details"), 14, 127, -16711936, false);
	}

	@Override
	public void init() {
		super.init();
		un = new EditBox(this.font, this.leftPos + 31, this.topPos + 41, 118, 18, Component.translatable("gui.nexus.algui.un"));
		un.setMaxLength(32767);
		guistate.put("text:un", un);
		this.addWidget(this.un);
		pw = new EditBox(this.font, this.leftPos + 31, this.topPos + 83, 118, 18, Component.translatable("gui.nexus.algui.pw"));
		pw.setMaxLength(32767);
		guistate.put("text:pw", pw);
		this.addWidget(this.pw);
		button_login = Button.builder(Component.translatable("gui.nexus.algui.button_login"), e -> {
			if (true) {
				textstate.put("textin:un", un.getValue());
				textstate.put("textin:pw", pw.getValue());
				PacketDistributor.SERVER.noArg().send(new AlguiButtonMessage(0, x, y, z, textstate));
				AlguiButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 62, this.topPos + 106, 51, 20).build();
		guistate.put("button:button_login", button_login);
		this.addRenderableWidget(button_login);
		button_login_via_acces_code = new PlainTextButton(this.leftPos + 28, this.topPos + 138, 129, 20, Component.translatable("gui.nexus.algui.button_login_via_acces_code"), e -> {
			if (true) {
				textstate.put("textin:un", un.getValue());
				textstate.put("textin:pw", pw.getValue());
				PacketDistributor.SERVER.noArg().send(new AlguiButtonMessage(1, x, y, z, textstate));
				AlguiButtonMessage.handleButtonAction(entity, 1, x, y, z, textstate);
			}
		}, this.font);
		guistate.put("button:button_login_via_acces_code", button_login_via_acces_code);
		this.addRenderableWidget(button_login_via_acces_code);
	}
}
