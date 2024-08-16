package net.mcreator.stevemaycry.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stevemaycry.entity.SummonSwords2Entity;

public class SummonSwords2OnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SummonSwords2Entity _datEntSetI)
			_datEntSetI.getEntityData().set(SummonSwords2Entity.DATA_life, (int) ((entity instanceof SummonSwords2Entity _datEntI ? _datEntI.getEntityData().get(SummonSwords2Entity.DATA_life) : 0) + 1));
		if ((entity instanceof SummonSwords2Entity _datEntI ? _datEntI.getEntityData().get(SummonSwords2Entity.DATA_life) : 0) == 14) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		entity.setDeltaMovement(new Vec3((1 * entity.getLookAngle().x), 0, (1 * entity.getLookAngle().z)));
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/particle dust 0.56 0.11 0.12 1 ~ ~0.2 ~ 1 1 1 1 5 force");
			}
		}
	}
}
