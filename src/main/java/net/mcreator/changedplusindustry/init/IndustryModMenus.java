
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.changedplusindustry.world.inventory.LatexprocessorGUIMenu;
import net.mcreator.changedplusindustry.world.inventory.LatexgeneratorGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IndustryModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<LatexprocessorGUIMenu> LATEXPROCESSOR_GUI = register("latexprocessor_gui", (id, inv, extraData) -> new LatexprocessorGUIMenu(id, inv, extraData));
	public static final MenuType<LatexgeneratorGUIMenu> LATEXGENERATOR_GUI = register("latexgenerator_gui", (id, inv, extraData) -> new LatexgeneratorGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
