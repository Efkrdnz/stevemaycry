package net.mcreator.stevemaycry.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stevemaycry.entity.SummonSwords1Entity;

public class SummonSwords1OnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SummonSwords1Entity _datEntSetI)
			_datEntSetI.getEntityData().set(SummonSwords1Entity.DATA_life, (int) ((entity instanceof SummonSwords1Entity _datEntI ? _datEntI.getEntityData().get(SummonSwords1Entity.DATA_life) : 0) + 1));
		if ((entity instanceof SummonSwords1Entity _datEntI ? _datEntI.getEntityData().get(SummonSwords1Entity.DATA_life) : 0) == 27) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "/particle dust 0.83 0.17 0.19 1 ~ ~1.5 ~ 1 1.5 1 1 3 force");
			}
		}
	}
}
