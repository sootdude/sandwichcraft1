package net.mcreator.breadcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.breadcraft.configuration.SootsandwichcraftConfigConfiguration;
import net.mcreator.breadcraft.BreadcraftMod;

@Mod.EventBusSubscriber(modid = BreadcraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BreadcraftModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SootsandwichcraftConfigConfiguration.SPEC, "sootsandwichcraft.toml");
		});
	}
}
