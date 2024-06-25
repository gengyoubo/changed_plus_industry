
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.changedplusindustry.block.LatexprocessorBlock;
import net.mcreator.changedplusindustry.block.LatexgeneratorBlock;
import net.mcreator.changedplusindustry.IndustryMod;

public class IndustryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IndustryMod.MODID);
	public static final RegistryObject<Block> LATEXPROCESSOR = REGISTRY.register("latexprocessor", () -> new LatexprocessorBlock());
	public static final RegistryObject<Block> LATEXGENERATOR = REGISTRY.register("latexgenerator", () -> new LatexgeneratorBlock());
}
