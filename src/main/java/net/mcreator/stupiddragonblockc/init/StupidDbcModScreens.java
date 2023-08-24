
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stupiddragonblockc.client.gui.WhisMasterMenuScreen;
import net.mcreator.stupiddragonblockc.client.gui.TransformationTrainingPage2Screen;
import net.mcreator.stupiddragonblockc.client.gui.TrainingMenuScreen;
import net.mcreator.stupiddragonblockc.client.gui.TechniqueTrainingMenuScreen;
import net.mcreator.stupiddragonblockc.client.gui.TRDoScreen;
import net.mcreator.stupiddragonblockc.client.gui.StatMenuScreen;
import net.mcreator.stupiddragonblockc.client.gui.SkillsScreen;
import net.mcreator.stupiddragonblockc.client.gui.PicolloCommunicatorScreen;
import net.mcreator.stupiddragonblockc.client.gui.MakeCharacterScreen;
import net.mcreator.stupiddragonblockc.client.gui.KingKaiMenuScreen;
import net.mcreator.stupiddragonblockc.client.gui.GokuCommunicatorScreen;
import net.mcreator.stupiddragonblockc.client.gui.CommunicatorHubScreen;
import net.mcreator.stupiddragonblockc.client.gui.CharacterInfoScreenScreen;
import net.mcreator.stupiddragonblockc.client.gui.ChangeTransformationTypeScreen;
import net.mcreator.stupiddragonblockc.client.gui.ChangeTTPage2Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StupidDbcModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StupidDbcModMenus.STAT_MENU.get(), StatMenuScreen::new);
			MenuScreens.register(StupidDbcModMenus.MAKE_CHARACTER.get(), MakeCharacterScreen::new);
			MenuScreens.register(StupidDbcModMenus.SKILLS.get(), SkillsScreen::new);
			MenuScreens.register(StupidDbcModMenus.CHANGE_TRANSFORMATION_TYPE.get(), ChangeTransformationTypeScreen::new);
			MenuScreens.register(StupidDbcModMenus.KING_KAI_MENU.get(), KingKaiMenuScreen::new);
			MenuScreens.register(StupidDbcModMenus.TR_DO.get(), TRDoScreen::new);
			MenuScreens.register(StupidDbcModMenus.TRAINING_MENU.get(), TrainingMenuScreen::new);
			MenuScreens.register(StupidDbcModMenus.PICOLLO_COMMUNICATOR.get(), PicolloCommunicatorScreen::new);
			MenuScreens.register(StupidDbcModMenus.GOKU_COMMUNICATOR.get(), GokuCommunicatorScreen::new);
			MenuScreens.register(StupidDbcModMenus.COMMUNICATOR_HUB.get(), CommunicatorHubScreen::new);
			MenuScreens.register(StupidDbcModMenus.CHANGE_TT_PAGE_2.get(), ChangeTTPage2Screen::new);
			MenuScreens.register(StupidDbcModMenus.TRANSFORMATION_TRAINING_PAGE_2.get(), TransformationTrainingPage2Screen::new);
			MenuScreens.register(StupidDbcModMenus.CHARACTER_INFO_SCREEN.get(), CharacterInfoScreenScreen::new);
			MenuScreens.register(StupidDbcModMenus.TECHNIQUE_TRAINING_MENU.get(), TechniqueTrainingMenuScreen::new);
			MenuScreens.register(StupidDbcModMenus.WHIS_MASTER_MENU.get(), WhisMasterMenuScreen::new);
		});
	}
}
