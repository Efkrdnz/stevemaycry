
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stevemaycry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.stevemaycry.item.DevilSwordDanteItem;
import net.mcreator.stevemaycry.item.DMCItem;
import net.mcreator.stevemaycry.StevemaycryMod;

public class StevemaycryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StevemaycryMod.MODID);
	public static final RegistryObject<Item> DEVIL_SWORD_DANTE = REGISTRY.register("devil_sword_dante", () -> new DevilSwordDanteItem());
	public static final RegistryObject<Item> DMC = REGISTRY.register("dmc", () -> new DMCItem());
}
