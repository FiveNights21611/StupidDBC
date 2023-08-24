package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.stupiddragonblockc.configuration.TheConfigConfiguration;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

@Mod.EventBusSubscriber(modid = StupidDbcMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class StupidDbcModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TheConfigConfiguration.SPEC, "sdbcCommon.toml");
		});
	}
}
