
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stevemaycry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.stevemaycry.entity.SummonSwords2Entity;
import net.mcreator.stevemaycry.entity.SummonSwords1Entity;
import net.mcreator.stevemaycry.StevemaycryMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StevemaycryModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StevemaycryMod.MODID);
	public static final RegistryObject<EntityType<SummonSwords1Entity>> SUMMON_SWORDS_1 = register("summon_swords_1", EntityType.Builder.<SummonSwords1Entity>of(SummonSwords1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SummonSwords1Entity::new).fireImmune().sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<SummonSwords2Entity>> SUMMON_SWORDS_2 = register("summon_swords_2", EntityType.Builder.<SummonSwords2Entity>of(SummonSwords2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SummonSwords2Entity::new).fireImmune().sized(0.1f, 0.1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SummonSwords1Entity.init();
			SummonSwords2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SUMMON_SWORDS_1.get(), SummonSwords1Entity.createAttributes().build());
		event.put(SUMMON_SWORDS_2.get(), SummonSwords2Entity.createAttributes().build());
	}
}
