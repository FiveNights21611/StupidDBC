
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stupiddragonblockc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stupiddragonblockc.world.inventory.WhisMasterMenuMenu;
import net.mcreator.stupiddragonblockc.world.inventory.TransformationTrainingPage2Menu;
import net.mcreator.stupiddragonblockc.world.inventory.TrainingMenuMenu;
import net.mcreator.stupiddragonblockc.world.inventory.TechniqueTrainingMenuMenu;
import net.mcreator.stupiddragonblockc.world.inventory.TRDoMenu;
import net.mcreator.stupiddragonblockc.world.inventory.StatMenuMenu;
import net.mcreator.stupiddragonblockc.world.inventory.SkillsMenu;
import net.mcreator.stupiddragonblockc.world.inventory.PicolloCommunicatorMenu;
import net.mcreator.stupiddragonblockc.world.inventory.MakeCharacterMenu;
import net.mcreator.stupiddragonblockc.world.inventory.KingKaiMenuMenu;
import net.mcreator.stupiddragonblockc.world.inventory.GokuCommunicatorMenu;
import net.mcreator.stupiddragonblockc.world.inventory.CommunicatorHubMenu;
import net.mcreator.stupiddragonblockc.world.inventory.CharacterInfoScreenMenu;
import net.mcreator.stupiddragonblockc.world.inventory.ChangeTransformationTypeMenu;
import net.mcreator.stupiddragonblockc.world.inventory.ChangeTTPage2Menu;
import net.mcreator.stupiddragonblockc.StupidDbcMod;

public class StupidDbcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StupidDbcMod.MODID);
	public static final RegistryObject<MenuType<StatMenuMenu>> STAT_MENU = REGISTRY.register("stat_menu", () -> IForgeMenuType.create(StatMenuMenu::new));
	public static final RegistryObject<MenuType<MakeCharacterMenu>> MAKE_CHARACTER = REGISTRY.register("make_character", () -> IForgeMenuType.create(MakeCharacterMenu::new));
	public static final RegistryObject<MenuType<SkillsMenu>> SKILLS = REGISTRY.register("skills", () -> IForgeMenuType.create(SkillsMenu::new));
	public static final RegistryObject<MenuType<ChangeTransformationTypeMenu>> CHANGE_TRANSFORMATION_TYPE = REGISTRY.register("change_transformation_type", () -> IForgeMenuType.create(ChangeTransformationTypeMenu::new));
	public static final RegistryObject<MenuType<KingKaiMenuMenu>> KING_KAI_MENU = REGISTRY.register("king_kai_menu", () -> IForgeMenuType.create(KingKaiMenuMenu::new));
	public static final RegistryObject<MenuType<TRDoMenu>> TR_DO = REGISTRY.register("tr_do", () -> IForgeMenuType.create(TRDoMenu::new));
	public static final RegistryObject<MenuType<TrainingMenuMenu>> TRAINING_MENU = REGISTRY.register("training_menu", () -> IForgeMenuType.create(TrainingMenuMenu::new));
	public static final RegistryObject<MenuType<PicolloCommunicatorMenu>> PICOLLO_COMMUNICATOR = REGISTRY.register("picollo_communicator", () -> IForgeMenuType.create(PicolloCommunicatorMenu::new));
	public static final RegistryObject<MenuType<GokuCommunicatorMenu>> GOKU_COMMUNICATOR = REGISTRY.register("goku_communicator", () -> IForgeMenuType.create(GokuCommunicatorMenu::new));
	public static final RegistryObject<MenuType<CommunicatorHubMenu>> COMMUNICATOR_HUB = REGISTRY.register("communicator_hub", () -> IForgeMenuType.create(CommunicatorHubMenu::new));
	public static final RegistryObject<MenuType<ChangeTTPage2Menu>> CHANGE_TT_PAGE_2 = REGISTRY.register("change_tt_page_2", () -> IForgeMenuType.create(ChangeTTPage2Menu::new));
	public static final RegistryObject<MenuType<TransformationTrainingPage2Menu>> TRANSFORMATION_TRAINING_PAGE_2 = REGISTRY.register("transformation_training_page_2", () -> IForgeMenuType.create(TransformationTrainingPage2Menu::new));
	public static final RegistryObject<MenuType<CharacterInfoScreenMenu>> CHARACTER_INFO_SCREEN = REGISTRY.register("character_info_screen", () -> IForgeMenuType.create(CharacterInfoScreenMenu::new));
	public static final RegistryObject<MenuType<TechniqueTrainingMenuMenu>> TECHNIQUE_TRAINING_MENU = REGISTRY.register("technique_training_menu", () -> IForgeMenuType.create(TechniqueTrainingMenuMenu::new));
	public static final RegistryObject<MenuType<WhisMasterMenuMenu>> WHIS_MASTER_MENU = REGISTRY.register("whis_master_menu", () -> IForgeMenuType.create(WhisMasterMenuMenu::new));
}
