
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.breadcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.breadcraft.BreadcraftMod;

public class BreadcraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BreadcraftMod.MODID);
	public static final RegistryObject<SoundEvent> MUTED = REGISTRY.register("muted", () -> new SoundEvent(new ResourceLocation("breadcraft", "muted")));
}
