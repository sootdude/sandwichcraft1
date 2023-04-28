
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BreadcraftModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.BASIL_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.BASIL.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.TOMATO.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.TOMATO_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.CAPER_LEAVES.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.CAPER_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.HOT_PEPPER.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.HOT_PEPPER_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.WILD_GREENS.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.WILD_GREENS_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.ONION.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.ONION_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.MUSTARD_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.ROSEMARY.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.ROSEMARY_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.RYE.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.RYE_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.THYME.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.THYME_SEEDS.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.GARLIC.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(BreadcraftModItems.PEANUT.get(), 0.65f);
	}
}
