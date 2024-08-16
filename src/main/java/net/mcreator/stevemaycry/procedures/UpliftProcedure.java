package net.mcreator.stevemaycry.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stevemaycry.entity.SummonSwords1Entity;
import net.mcreator.stevemaycry.StevemaycryMod;

import java.util.List;
import java.util.Comparator;

public class UpliftProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double x = 0;
		double z = 0;
		double yaw = 0;
		x = entity.getX() + 3 * entity.getLookAngle().x;
		z = entity.getZ() + 3 * entity.getLookAngle().z;
		yaw = entity.getYRot();
		entity.getPersistentData().putDouble("UpliftX1", (entity.getX() + 4 * entity.getLookAngle().x));
		entity.getPersistentData().putDouble("DX", (0.5 * entity.getLookAngle().x));
		entity.getPersistentData().putDouble("UpliftZ1", (entity.getZ() + 4 * entity.getLookAngle().z));
		entity.getPersistentData().putDouble("DZ", (0.5 * entity.getLookAngle().z));
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("summon stevemaycry:summon_swords_1 " + x + " ~ " + z + " {Rotation:[" + yaw + "f,0f]}"));
			}
		}
		StevemaycryMod.queueServerWork((int) 8.4, () -> {
			{
				final Vec3 _center = new Vec3((entity.getPersistentData().getDouble("UpliftX1")), y, (entity.getPersistentData().getDouble("UpliftZ1")));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator instanceof ExperienceOrb) && !(entityiterator instanceof SummonSwords1Entity) && !(entityiterator instanceof ItemEntity)) {
						entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), entity), 10);
						entityiterator.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("DX")), 1, (entity.getPersistentData().getDouble("DZ"))));
					}
				}
			}
		});
	}
}
