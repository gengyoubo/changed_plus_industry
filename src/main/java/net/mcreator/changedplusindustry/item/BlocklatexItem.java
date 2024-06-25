
package net.mcreator.changedplusindustry.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.changedplusindustry.init.IndustryModTabs;

public class BlocklatexItem extends Item {
	public BlocklatexItem() {
		super(new Item.Properties().tab(IndustryModTabs.TAB_INDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
