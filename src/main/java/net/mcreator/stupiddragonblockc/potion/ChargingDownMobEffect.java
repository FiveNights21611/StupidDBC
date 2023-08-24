
package net.mcreator.stupiddragonblockc.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stupiddragonblockc.procedures.ChargeDownProcedure;

public class ChargingDownMobEffect extends MobEffect {
	public ChargingDownMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.stupid_dbc.charging_down";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ChargeDownProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
