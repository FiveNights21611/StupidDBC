package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;
import net.mcreator.stupiddragonblockc.init.StupidDbcModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChargingUpTRUEProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind == true
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind2 == false) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(StupidDbcModMobEffects.CHARGING_UP.get()) ? _livEnt.getEffect(StupidDbcModMobEffects.CHARGING_UP.get()).getAmplifier() : 0) <= 0) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(StupidDbcModMobEffects.CHARGING_UP.get(), 20, 0));
			}
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind == true
				&& (entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind2 == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(StupidDbcModMobEffects.CHARGING_DOWN.get(), 20, 0));
		} else if ((entity.getCapability(StupidDbcModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StupidDbcModVariables.PlayerVariables())).holdingKeybind == false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(StupidDbcModMobEffects.CHARGING_UP.get());
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(StupidDbcModMobEffects.CHARGING_DOWN.get());
		}
	}
}
