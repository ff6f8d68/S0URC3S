
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nexusmc.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.nexusmc.world.inventory.WDGUIMenu;
import net.mcreator.nexusmc.world.inventory.TGUIMenu;
import net.mcreator.nexusmc.world.inventory.StoreunusedMenu;
import net.mcreator.nexusmc.world.inventory.RSHMenu;
import net.mcreator.nexusmc.world.inventory.MguiMenu;
import net.mcreator.nexusmc.world.inventory.IFGUIMenu;
import net.mcreator.nexusmc.world.inventory.CguiMenu;
import net.mcreator.nexusmc.world.inventory.CTSGUIMenu;
import net.mcreator.nexusmc.world.inventory.AlguiMenu;
import net.mcreator.nexusmc.world.inventory.AcguiMenu;
import net.mcreator.nexusmc.NexusMod;

public class NexusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, NexusMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CTSGUIMenu>> CTSGUI = REGISTRY.register("ctsgui", () -> IMenuTypeExtension.create(CTSGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RSHMenu>> RSH = REGISTRY.register("rsh", () -> IMenuTypeExtension.create(RSHMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<IFGUIMenu>> IFGUI = REGISTRY.register("ifgui", () -> IMenuTypeExtension.create(IFGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<StoreunusedMenu>> STOREUNUSED = REGISTRY.register("storeunused", () -> IMenuTypeExtension.create(StoreunusedMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<WDGUIMenu>> WDGUI = REGISTRY.register("wdgui", () -> IMenuTypeExtension.create(WDGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<TGUIMenu>> TGUI = REGISTRY.register("tgui", () -> IMenuTypeExtension.create(TGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AlguiMenu>> ALGUI = REGISTRY.register("algui", () -> IMenuTypeExtension.create(AlguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<AcguiMenu>> ACGUI = REGISTRY.register("acgui", () -> IMenuTypeExtension.create(AcguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CguiMenu>> CGUI = REGISTRY.register("cgui", () -> IMenuTypeExtension.create(CguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<MguiMenu>> MGUI = REGISTRY.register("mgui", () -> IMenuTypeExtension.create(MguiMenu::new));
}
