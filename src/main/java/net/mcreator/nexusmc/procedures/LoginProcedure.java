package net.mcreator.nexusmc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.nexusmc.world.inventory.TGUIMenu;
import net.mcreator.nexusmc.network.NexusModVariables;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

public class LoginProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:un") ? ((EditBox) guistate.get("text:un")).getValue() : "").equals("fullserverZil")) {
			if ((guistate.containsKey("text:pw") ? ((EditBox) guistate.get("text:pw")).getValue() : "").equals("Kaan12*/")) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					_ent.openMenu(new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("TGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				{
					NexusModVariables.PlayerVariables _vars = entity.getData(NexusModVariables.PLAYER_VARIABLES);
					_vars.curse_r = "fullserverZil";
					_vars.syncPlayerVariables(entity);
				}
			} else {
				NexusModVariables.cct = "acces denied";
			}
		} else if ((guistate.containsKey("text:un") ? ((EditBox) guistate.get("text:un")).getValue() : "").equals("atom20003113")) {
			if ((guistate.containsKey("text:pw") ? ((EditBox) guistate.get("text:pw")).getValue() : "").equals("0000")) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					_ent.openMenu(new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("TGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				{
					NexusModVariables.PlayerVariables _vars = entity.getData(NexusModVariables.PLAYER_VARIABLES);
					_vars.curse_r = "atom20003113";
					_vars.syncPlayerVariables(entity);
				}
			} else {
				NexusModVariables.cct = "acces denied";
			}
		} else if ((guistate.containsKey("text:un") ? ((EditBox) guistate.get("text:un")).getValue() : "").equals("Glitch_422")) {
			if ((guistate.containsKey("text:pw") ? ((EditBox) guistate.get("text:pw")).getValue() : "").equals("The_nothing_606")) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					_ent.openMenu(new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("TGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new TGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
				{
					NexusModVariables.PlayerVariables _vars = entity.getData(NexusModVariables.PLAYER_VARIABLES);
					_vars.curse_r = "Glitch_422";
					_vars.syncPlayerVariables(entity);
				}
			} else {
				NexusModVariables.cct = "acces denied";
			}
		} else {
			NexusModVariables.cct = "acces denied";
		}
	}
}
