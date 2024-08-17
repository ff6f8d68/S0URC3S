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

import net.mcreator.nexusmc.world.inventory.WDGUIMenu;
import net.mcreator.nexusmc.network.WDGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WDGUIScreen extends AbstractContainerScreen<WDGUIMenu> {
	private final static HashMap<String, Object> guistate = WDGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox xvar;
	public static EditBox yvar;
	public static EditBox zvar;
	Button button_warp;

	public WDGUIScreen(WDGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("nexus:textures/screens/wdgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		xvar.render(guiGraphics, mouseX, mouseY, partialTicks);
		yvar.render(guiGraphics, mouseX, mouseY, partialTicks);
		zvar.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (xvar.isFocused())
			return xvar.keyPressed(key, b, c);
		if (yvar.isFocused())
			return yvar.keyPressed(key, b, c);
		if (zvar.isFocused())
			return zvar.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		xvar = new EditBox(this.font, this.leftPos + 25, this.topPos + 26, 118, 18, Component.translatable("gui.nexus.wdgui.xvar")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.xvar").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.xvar").getString());
				else
					setSuggestion(null);
			}
		};
		xvar.setMaxLength(32767);
		xvar.setSuggestion(Component.translatable("gui.nexus.wdgui.xvar").getString());
		guistate.put("text:xvar", xvar);
		this.addWidget(this.xvar);
		yvar = new EditBox(this.font, this.leftPos + 25, this.topPos + 62, 118, 18, Component.translatable("gui.nexus.wdgui.yvar")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.yvar").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.yvar").getString());
				else
					setSuggestion(null);
			}
		};
		yvar.setMaxLength(32767);
		yvar.setSuggestion(Component.translatable("gui.nexus.wdgui.yvar").getString());
		guistate.put("text:yvar", yvar);
		this.addWidget(this.yvar);
		zvar = new EditBox(this.font, this.leftPos + 25, this.topPos + 98, 118, 18, Component.translatable("gui.nexus.wdgui.zvar")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.zvar").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.wdgui.zvar").getString());
				else
					setSuggestion(null);
			}
		};
		zvar.setMaxLength(32767);
		zvar.setSuggestion(Component.translatable("gui.nexus.wdgui.zvar").getString());
		guistate.put("text:zvar", zvar);
		this.addWidget(this.zvar);
		button_warp = Button.builder(Component.translatable("gui.nexus.wdgui.button_warp"), e -> {
			if (true) {
				textstate.put("textin:xvar", xvar.getValue());
				textstate.put("textin:yvar", yvar.getValue());
				textstate.put("textin:zvar", zvar.getValue());
				PacketDistributor.SERVER.noArg().send(new WDGUIButtonMessage(0, x, y, z, textstate));
				WDGUIButtonMessage.handleButtonAction(entity, 0, x, y, z, textstate);
			}
		}).bounds(this.leftPos + 60, this.topPos + 133, 46, 20).build();
		guistate.put("button:button_warp", button_warp);
		this.addRenderableWidget(button_warp);
	}
}
