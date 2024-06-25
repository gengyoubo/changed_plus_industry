
package net.mcreator.changedplusindustry.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.changedplusindustry.procedures.Check_enegyProcedure;
import net.mcreator.changedplusindustry.init.IndustryModTabs;

public class EnergymeterItem extends Item {
	public EnergymeterItem() {
		super(new Item.Properties().tab(IndustryModTabs.TAB_INDUSTRY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Check_enegyProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
