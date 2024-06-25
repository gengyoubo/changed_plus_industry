
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class IndustryModTabs {
	public static CreativeModeTab TAB_INDUSTRY;

	public static void load() {
		TAB_INDUSTRY = new CreativeModeTab("tabindustry") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(IndustryModBlocks.LATEXGENERATOR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
