package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UIDodgeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double i = 0;
		if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).technique).equals("\"Ultra Instinct Omen\"")) {
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= 25) {
				i = 0;
				if (entity instanceof Player _player) {
					_player.getAbilities().invulnerable = true;
					_player.onUpdateAbilities();
				}
				if (i > 3) {
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = false;
						_player.onUpdateAbilities();
					}
				}
			}
			if (Mth.nextInt(RandomSource.create(), 1, 100) <= 10) {
				if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
						&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
						&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")
						&& !(((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
								&& ((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
								&& ((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\""))) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("custom").bypassArmor(), (float) ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).trueStrength / 0.6));
				} else if (((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
						&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
						&& ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")
						&& ((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Saiyan\"")
						&& ((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Half-Saiyan\"")
						&& ((sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).race).equals("\"Human\"")) {
					{
						double _setval = (sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).Health
								- ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).trueStrength / 0.6)
										/ (sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).trueDefense;
						sourceentity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Health = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		}
		i = i + 1;
	}
}
