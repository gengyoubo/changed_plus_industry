
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.changedplusindustry.item.EnergymeterItem;
import net.mcreator.changedplusindustry.item.BlocklatexItem;
import net.mcreator.changedplusindustry.IndustryMod;

public class IndustryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IndustryMod.MODID);
	public static final RegistryObject<Item> LATEXPROCESSOR = block(IndustryModBlocks.LATEXPROCESSOR, IndustryModTabs.TAB_INDUSTRY);
	public static final RegistryObject<Item> LATEXGENERATOR = block(IndustryModBlocks.LATEXGENERATOR, IndustryModTabs.TAB_INDUSTRY);
	public static final RegistryObject<Item> ENERGYMETER = REGISTRY.register("energymeter", () -> new EnergymeterItem());
	public static final RegistryObject<Item> BLOCKLATEX = REGISTRY.register("blocklatex", () -> new BlocklatexItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
