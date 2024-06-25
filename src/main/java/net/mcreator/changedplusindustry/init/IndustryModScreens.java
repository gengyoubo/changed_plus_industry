
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.changedplusindustry.client.gui.LatexprocessorGUIScreen;
import net.mcreator.changedplusindustry.client.gui.LatexgeneratorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IndustryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(IndustryModMenus.LATEXPROCESSOR_GUI, LatexprocessorGUIScreen::new);
			MenuScreens.register(IndustryModMenus.LATEXGENERATOR_GUI, LatexgeneratorGUIScreen::new);
		});
	}
}
