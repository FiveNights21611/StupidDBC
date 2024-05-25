package net.mcreator.stupiddragonblockc.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.stupiddragonblockc.network.StupidDbcModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReviveStructureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("stupid_dbc:otherworld")));
			if (world != null) {
				if (StupidDbcModVariables.WorldVariables.get(world).structureGenerated == false && (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
						&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stupid_dbc:go_die"))).isDone()) == true) {
					StupidDbcModVariables.WorldVariables.get(world).structureGenerated = true;
					StupidDbcModVariables.WorldVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("stupid_dbc", "gorevive"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 1, 0), new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) + 1, 0),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
			world = _worldorig;
		}
	}
}
