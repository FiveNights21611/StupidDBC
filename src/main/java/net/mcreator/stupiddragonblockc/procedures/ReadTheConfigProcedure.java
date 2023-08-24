package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;
import net.mcreator.stupiddragonblockc.configuration.TheConfigConfiguration;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReadTheConfigProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		StupidDbcMod.LOGGER.info("Reading Config and Changing Variables:");
		StupidDbcMod.LOGGER.info(("Saiyan TP Gain Before Read: " + new java.text.DecimalFormat("##.##").format(StupidDbcModVariables.saiyanTpGain)));
		StupidDbcModVariables.saiyanTpGain = (double) TheConfigConfiguration.SAIYANTPGAIN.get();
		StupidDbcMod.LOGGER.info(("Saiyan TP Gain Now: " + new java.text.DecimalFormat("##.##").format(StupidDbcModVariables.saiyanTpGain)));
		StupidDbcModVariables.halfSaiyanTpGain = (double) TheConfigConfiguration.HALFSAIYANTPGAIN.get();
		StupidDbcMod.LOGGER.info("etc.");
		StupidDbcModVariables.humanTpGain = (double) TheConfigConfiguration.HUMANTPGAIN.get();
		StupidDbcMod.LOGGER.info("etc.");
		StupidDbcModVariables.SSMultiplier = (double) TheConfigConfiguration.SSMULTIPLIER.get();
		StupidDbcMod.LOGGER.info("You get the jist of it.");
		StupidDbcModVariables.SSGrade2Multiplier = (double) TheConfigConfiguration.SSGRADE2MULTIPLIER.get();
		StupidDbcModVariables.SSGrade3Multiplier = (double) TheConfigConfiguration.SSGRADE3MULTIPLIER.get();
		StupidDbcModVariables.FPSSMultiplier = (double) TheConfigConfiguration.FPSSMULTIPLIER.get();
		StupidDbcModVariables.SS2Multiplier = (double) TheConfigConfiguration.SS2MULTIPLIER.get();
		StupidDbcModVariables.SS3Multiplier = (double) TheConfigConfiguration.SS3MULTIPLIER.get();
		StupidDbcModVariables.SSGodMultiplier = (double) TheConfigConfiguration.SSGODMULTIPLIER.get();
		StupidDbcModVariables.SSBlueMultiplier = (double) TheConfigConfiguration.SSBLUEMULTIPLIER.get();
		StupidDbcModVariables.BuffedMultiplier = (double) TheConfigConfiguration.BUFFEDMULTIPLIER.get();
		StupidDbcModVariables.BuffedMultiplier = (double) TheConfigConfiguration.BUFFEDMULTIPLIER.get();
		StupidDbcModVariables.OozaruMultiplier = (double) TheConfigConfiguration.OOZARUMULTIPLIER.get();
		StupidDbcModVariables.KaiokenMultiplier = (double) TheConfigConfiguration.KAIOKENMULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx2Multiplier = (double) TheConfigConfiguration.KAIOKEN2MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx3Multiplier = (double) TheConfigConfiguration.KAIOKEN3MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx4Multiplier = (double) TheConfigConfiguration.KAIOKEN4MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx5Multiplier = (double) TheConfigConfiguration.KAIOKEN5MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx10Multiplier = (double) TheConfigConfiguration.KAIOKEN10MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx20Multiplier = (double) TheConfigConfiguration.KAIOKEN20MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx50Multiplier = (double) TheConfigConfiguration.KAIOKEN50MULTIPLIER.get();
		StupidDbcModVariables.Kaiokenx100Multiplier = (double) TheConfigConfiguration.KAIOKEN100MULTIPLIER.get();
		StupidDbcModVariables.SSKiDrain = (double) TheConfigConfiguration.SSKIDRAIN.get();
		StupidDbcModVariables.SSGrade2KD = (double) TheConfigConfiguration.SSG2KIDRAIN.get();
		StupidDbcModVariables.SSGrade3KD = (double) TheConfigConfiguration.SSG3KIDRAIN.get();
		StupidDbcModVariables.FPSSKD = (double) TheConfigConfiguration.FPSSKIDRAIN.get();
		StupidDbcModVariables.SS2KD = (double) TheConfigConfiguration.SS2KIDRAIN.get();
		StupidDbcModVariables.SS3KD = (double) TheConfigConfiguration.SS3KIDRAIN.get();
		StupidDbcModVariables.SSGodKiDrain = (double) TheConfigConfiguration.SSGODKIDRAIN.get();
		StupidDbcModVariables.SSBlueKD = (double) TheConfigConfiguration.SSBLUEKIDRAIN.get();
		StupidDbcModVariables.BuffedKD = (double) TheConfigConfiguration.BUFFEDKIDRAIN.get();
		StupidDbcModVariables.KaiokenHD = (double) TheConfigConfiguration.KAIOKENHD.get();
		StupidDbcModVariables.Kaiokenx2HD = (double) TheConfigConfiguration.KAIOKEN2HD.get();
		StupidDbcModVariables.Kaiokenx3HD = (double) TheConfigConfiguration.KAIOKEN3HD.get();
		StupidDbcModVariables.Kaiokenx4HD = (double) TheConfigConfiguration.KAIOKEN4HD.get();
		StupidDbcModVariables.Kaiokenx5HD = (double) TheConfigConfiguration.KAIOKEN5HD.get();
		StupidDbcModVariables.Kaiokenx10HD = (double) TheConfigConfiguration.KAIOKEN10HD.get();
		StupidDbcModVariables.Kaiokenx20HD = (double) TheConfigConfiguration.KAIOKEN20HD.get();
		StupidDbcModVariables.Kaiokenx50HD = (double) TheConfigConfiguration.KAIOKEN50HD.get();
		StupidDbcModVariables.Kaiokenx100HD = (double) TheConfigConfiguration.KAIOKEN100HD.get();
		StupidDbcModVariables.BaseTpCost = (double) TheConfigConfiguration.TPCOST.get();
		StupidDbcModVariables.MaxStats = (double) TheConfigConfiguration.MAXSTATS.get();
		StupidDbcModVariables.KiRegen = (double) TheConfigConfiguration.KIREGEN.get();
		StupidDbcModVariables.SSPrice = (double) TheConfigConfiguration.SSG1PRICE.get();
		StupidDbcModVariables.SSGrade2Price = (double) TheConfigConfiguration.SSG2PRICE.get();
		StupidDbcModVariables.SSGrade3Price = (double) TheConfigConfiguration.SSG3PRICE.get();
		StupidDbcModVariables.FPSSPrice = (double) TheConfigConfiguration.FPSSPRICE.get();
		StupidDbcModVariables.SS2Price = (double) TheConfigConfiguration.SS2PRICE.get();
		StupidDbcModVariables.SS3Price = (double) TheConfigConfiguration.SS3PRICE.get();
		StupidDbcModVariables.kaiokenprice = (double) TheConfigConfiguration.KAIOKENPRICE.get();
		StupidDbcModVariables.kaiokenx2price = (double) TheConfigConfiguration.KAIOKEN2PRICE.get();
		StupidDbcModVariables.kaiokenx3price = (double) TheConfigConfiguration.KAIOKEN3PRICE.get();
		StupidDbcModVariables.kaiokenx4price = (double) TheConfigConfiguration.KAIOKEN4PRICE.get();
		StupidDbcModVariables.kaiokenx5price = (double) TheConfigConfiguration.KAIOKEN5PRICE.get();
		StupidDbcModVariables.kaiokenx10price = (double) TheConfigConfiguration.KAIOKEN10PRICE.get();
		StupidDbcModVariables.kaiokenx20price = (double) TheConfigConfiguration.KAIOKEN20PRICE.get();
		StupidDbcModVariables.kaiokenx50price = (double) TheConfigConfiguration.KAIOKEN50PRICE.get();
		StupidDbcModVariables.kaiokenx100price = (double) TheConfigConfiguration.KAIOKEN100PRICE.get();
		StupidDbcModVariables.SSBlueEvolvedMultiplier = (double) TheConfigConfiguration.SSBLUESHMULTIPLIER.get();
		StupidDbcModVariables.SSBlueEvolvedKiDrain = (double) TheConfigConfiguration.SSBLUESHKIDRAIN.get();
		StupidDbcModVariables.GoldenOozaruMultiplier = (double) TheConfigConfiguration.GOLDENOOZARUMULTIPLIER.get();
		StupidDbcModVariables.SS4Multiplier = (double) TheConfigConfiguration.SS4MULTIPLIER.get();
		StupidDbcModVariables.SS4LBMultiplier = (double) TheConfigConfiguration.SS4LBMULTIPLIER.get();
		StupidDbcModVariables.GoldenOozaruKiDrain = (double) TheConfigConfiguration.GOLDENOOZARUKIDRAIN.get();
		StupidDbcModVariables.SS4KiDrain = (double) TheConfigConfiguration.SS4KIDRAIN.get();
		StupidDbcModVariables.SS4LBKiDrain = (double) TheConfigConfiguration.SS4LBKIDRAIN.get();
		StupidDbcModVariables.SSRoseMultiplier = (double) TheConfigConfiguration.SSROSEMULTIPLIER.get();
		StupidDbcModVariables.SSRoseGrade2Multiplier = (double) TheConfigConfiguration.SSROSEG2MULTIPLIER.get();
		StupidDbcModVariables.SSRoseKD = (double) TheConfigConfiguration.SSROSEKD.get();
		StupidDbcModVariables.SSRoseG2KD = (double) TheConfigConfiguration.SSROSEG2KD.get();
		StupidDbcModVariables.LegendaryMultiplierBonus = (double) TheConfigConfiguration.LEGENDARYMULTIPLIERBONUS.get();
		StupidDbcModVariables.LegendaryChance = (double) TheConfigConfiguration.CHANCEFORLEGENDARY.get();
		StupidDbcModVariables.LegendaryRate = (double) TheConfigConfiguration.FREQUENCYOFLEGENDARY.get();
		StupidDbcModVariables.ultimateMultiplier = (double) TheConfigConfiguration.ULTIMATEMULTIPLIER.get();
		StupidDbcModVariables.ultimateKiDrain = (double) TheConfigConfiguration.ULTIMATEKD.get();
		StupidDbcModVariables.ultimatePrice = (double) TheConfigConfiguration.ULTIMATEPRICE.get();
		StupidDbcModVariables.beastMultiplier = (double) TheConfigConfiguration.BEASTMULTIPLIER.get();
		StupidDbcModVariables.beastKiDrain = (double) TheConfigConfiguration.BEASTKD.get();
		StupidDbcModVariables.beastPrice = (double) TheConfigConfiguration.BEASTPRICE.get();
		StupidDbcModVariables.flyPrice = (double) TheConfigConfiguration.FLYCOST.get();
		StupidDbcModVariables.ssblue2multiplier = (double) TheConfigConfiguration.SSBLUE2MULTIPLIER.get();
		StupidDbcModVariables.ssblue2kd = (double) TheConfigConfiguration.SSBLUE2KD.get();
		StupidDbcModVariables.ssblue2price = (double) TheConfigConfiguration.SSBLUE2PRICE.get();
		StupidDbcModVariables.ssrose2multiplier = (double) TheConfigConfiguration.SSROSE2MULTIPLIER.get();
		StupidDbcModVariables.ssrose2kd = (double) TheConfigConfiguration.SSROSE2KD.get();
		StupidDbcModVariables.ssblue3multiplier = (double) TheConfigConfiguration.SSBLUE3MULTIPLIER.get();
		StupidDbcModVariables.ssblue3kd = (double) TheConfigConfiguration.SSBLUE3KD.get();
		StupidDbcModVariables.ssblue3price = (double) TheConfigConfiguration.SSBLUE3PRICE.get();
		StupidDbcModVariables.ssrose3multiplier = (double) TheConfigConfiguration.SSROSE3MULTIPLIER.get();
		StupidDbcModVariables.ssrose3kd = (double) TheConfigConfiguration.SSROSE3KD.get();
		StupidDbcModVariables.tpgmultiplier = (double) TheConfigConfiguration.TPGMULTIPLIER.get();
		StupidDbcModVariables.tpgkd = (double) TheConfigConfiguration.TPGKD.get();
		StupidDbcModVariables.tpgprice = (double) TheConfigConfiguration.TPGPRICE.get();
		StupidDbcModVariables.costOfSSGod = (double) TheConfigConfiguration.SSGODPRICE.get();
		StupidDbcModVariables.costOfSSBlue = (double) TheConfigConfiguration.SSBLUEPRICE.get();
		StupidDbcModVariables.costOfSSBE = (double) TheConfigConfiguration.SSBEPRICE.get();
		StupidDbcModVariables.UltraInstintOmenMultiplier = (double) TheConfigConfiguration.UIOMENMULTIPLIER.get();
		StupidDbcModVariables.UltraInstinctOmenKD = (double) TheConfigConfiguration.UIOMENKD.get();
		StupidDbcModVariables.UltraInstinctOmenPrice = (double) TheConfigConfiguration.UIOMENPRICE.get();
		StupidDbcModVariables.UltraInstinctOmenDodgeChance = (double) TheConfigConfiguration.UIOMENDODGE.get();
		StupidDbcModVariables.UltraInstinctOmenCounterChance = (double) TheConfigConfiguration.UIOMENCOUNTER.get();
		StupidDbcModVariables.UltraInstinctOmenCounterPercentage = (double) TheConfigConfiguration.UIOMENCOUNTERPERCENTAGE.get();
		StupidDbcMod.LOGGER.info("Finally done... so many variables... but now that we've done that, you can play and go beyond!");
	}
}
