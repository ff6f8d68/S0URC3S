package net.mcreator.nexusmc.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.nexusmc.world.inventory.StoreunusedMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class StoreunusedScreen extends AbstractContainerScreen<StoreunusedMenu> {
	private final static HashMap<String, Object> guistate = StoreunusedMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private final static HashMap<String, String> textstate = new HashMap<>();
	public static EditBox serverip;
	public static Checkbox ctcs;
	Button button_connect_to_custom_server;
	Button button_host_this_world_as_server;

	public StoreunusedScreen(StoreunusedMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		serverip.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("nexus:textures/screens/dirt_background_be1.png"), this.leftPos + -145, this.topPos + -55, 0, 0, 960, 540, 960, 540);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (serverip.isFocused())
			return serverip.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.storeunused.label_connect"), 60, 25, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.nexus.storeunused.label_server_ip_of_your_world"), 12, 156, -1, false);
	}

	@Override
	public void init() {
		super.init();
		serverip = new EditBox(this.font, this.leftPos + 19, this.topPos + 44, 118, 18, Component.translatable("gui.nexus.storeunused.serverip")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.storeunused.serverip").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos, boolean flag) {
				super.moveCursorTo(pos, flag);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.nexus.storeunused.serverip").getString());
				else
					setSuggestion(null);
			}
		};
		serverip.setMaxLength(32767);
		serverip.setSuggestion(Component.translatable("gui.nexus.storeunused.serverip").getString());
		guistate.put("text:serverip", serverip);
		this.addWidget(this.serverip);
		button_connect_to_custom_server = Button.builder(Component.translatable("gui.nexus.storeunused.button_connect_to_custom_server"), e -> {
		}).bounds(this.leftPos + 3, this.topPos + 99, 150, 20).build();
		guistate.put("button:button_connect_to_custom_server", button_connect_to_custom_server);
		this.addRenderableWidget(button_connect_to_custom_server);
		button_host_this_world_as_server = Button.builder(Component.translatable("gui.nexus.storeunused.button_host_this_world_as_server"), e -> {
		}).bounds(this.leftPos + 1, this.topPos + 132, 155, 20).build();
		guistate.put("button:button_host_this_world_as_server", button_host_this_world_as_server);
		this.addRenderableWidget(button_host_this_world_as_server);
		ctcs = Checkbox.builder(Component.translatable("gui.nexus.storeunused.ctcs"), this.font).pos(this.leftPos + -5, this.topPos + 68)

				.build();
		guistate.put("checkbox:ctcs", ctcs);
		this.addRenderableWidget(ctcs);
	}
}
