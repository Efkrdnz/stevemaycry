package net.mcreator.stevemaycry.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class DevilSwordDanteRightclickedProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isSprinting()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 20);
			DiveProcedure.execute(world, y, entity);
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 25);
			UpliftProcedure.execute(world, y, entity);
		}
	}
}
