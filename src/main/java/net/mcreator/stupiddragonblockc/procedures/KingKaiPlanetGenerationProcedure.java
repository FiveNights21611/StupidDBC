package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KingKaiPlanetGenerationProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("stupid_dbc:otherworld")));
			if (world != null) {
				if (StupidDbcModVariables.WorldVariables.get(world).kingKaiGenerated == false) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("stupid_dbc", "king_kai_planet"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(Mth.nextInt(RandomSource.create(), 3000, 3250), Mth.nextInt(RandomSource.create(), 128, 100), Mth.nextInt(RandomSource.create(), -125, 125)),
									new BlockPos(Mth.nextInt(RandomSource.create(), 3000, 3250), Mth.nextInt(RandomSource.create(), 128, 100), Mth.nextInt(RandomSource.create(), -125, 125)),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					StupidDbcModVariables.WorldVariables.get(world).kingKaiGenerated = true;
					StupidDbcModVariables.WorldVariables.get(world).syncData(world);
				}
			}
			world = _worldorig;
		}
	}
}
