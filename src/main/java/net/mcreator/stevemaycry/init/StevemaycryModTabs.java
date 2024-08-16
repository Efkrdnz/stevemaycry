
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stevemaycry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stevemaycry.StevemaycryMod;

public class StevemaycryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StevemaycryMod.MODID);
	public static final RegistryObject<CreativeModeTab> DMC_CREATIVE_TAB = REGISTRY.register("dmc_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stevemaycry.dmc_creative_tab")).icon(() -> new ItemStack(StevemaycryModItems.DMC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StevemaycryModItems.DEVIL_SWORD_DANTE.get());
			})

					.build());
}
