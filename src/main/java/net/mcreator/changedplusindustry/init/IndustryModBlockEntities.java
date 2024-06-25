
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.changedplusindustry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.changedplusindustry.block.entity.LatexprocessorBlockEntity;
import net.mcreator.changedplusindustry.block.entity.LatexgeneratorBlockEntity;
import net.mcreator.changedplusindustry.IndustryMod;

public class IndustryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, IndustryMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LATEXPROCESSOR = register("latexprocessor", IndustryModBlocks.LATEXPROCESSOR, LatexprocessorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LATEXGENERATOR = register("latexgenerator", IndustryModBlocks.LATEXGENERATOR, LatexgeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
