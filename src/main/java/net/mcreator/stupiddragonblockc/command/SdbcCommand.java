
package net.mcreator.stupiddragonblockc.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.mcreator.stupiddragonblockc.procedures.TaketpProcedure;
import net.mcreator.stupiddragonblockc.procedures.TakeAlignmentCommandProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetTrainingProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetTechniqueXPProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetGodKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetDemonicKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetAlignmentCommandProcedure;
import net.mcreator.stupiddragonblockc.procedures.GivetpProcedure;
import net.mcreator.stupiddragonblockc.procedures.CommandHealKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.CommandHealHealthProcedure;
import net.mcreator.stupiddragonblockc.procedures.CommandHealAllProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddTechniqueXPProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddTPProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddGodKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddDemonicKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddAlignmentCommandProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SdbcCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("sdbc").requires(s -> s.hasPermission(4)).then(Commands.literal("heal").then(Commands.literal("hp").then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CommandHealHealthProcedure.execute(arguments, entity);
			return 0;
		}))).then(Commands.literal("ki").then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CommandHealKiProcedure.execute(arguments, entity);
			return 0;
		}))).then(Commands.literal("all").then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CommandHealAllProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("tp").then(Commands.literal("give").then(Commands.argument("amount", DoubleArgumentType.doubleArg(1)).then(Commands.argument("Player", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			GivetpProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("take").then(Commands.argument("amount", DoubleArgumentType.doubleArg(1)).then(Commands.argument("Player", EntityArgument.player()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			TaketpProcedure.execute(arguments, entity);
			return 0;
		}))))).then(Commands.literal("alignment").then(Commands.literal("set").then(Commands.argument("alignment", DoubleArgumentType.doubleArg(-100, 100)).then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			SetAlignmentCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("add").then(Commands.argument("alignment", DoubleArgumentType.doubleArg(0, 200)).then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			AddAlignmentCommandProcedure.execute(arguments, entity);
			return 0;
		})))).then(Commands.literal("take").then(Commands.argument("alignment", DoubleArgumentType.doubleArg(0, 200)).then(Commands.argument("player", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			TakeAlignmentCommandProcedure.execute(arguments, entity);
			return 0;
		}))))).then(Commands.literal("training").then(Commands.literal("add").then(Commands.literal("transformation")
				.then(Commands.argument("transformation", StringArgumentType.word()).then(Commands.argument("xp", DoubleArgumentType.doubleArg(1, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					AddTPProcedure.execute(arguments, entity);
					return 0;
				}))))).then(Commands.literal("technique")
						.then(Commands.argument("technique", StringArgumentType.word()).then(Commands.argument("xp", DoubleArgumentType.doubleArg(1, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							AddTechniqueXPProcedure.execute(arguments, entity);
							return 0;
						}))))))
				.then(Commands.literal("set").then(Commands.literal("transformation")
						.then(Commands.argument("transformation", StringArgumentType.word()).then(Commands.argument("xp", DoubleArgumentType.doubleArg(1, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							SetTrainingProcedure.execute(arguments, entity);
							return 0;
						}))))).then(Commands.literal("technique")
								.then(Commands.argument("technique", StringArgumentType.word()).then(Commands.argument("xp", DoubleArgumentType.doubleArg(1, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
									ServerLevel world = arguments.getSource().getLevel();
									double x = arguments.getSource().getPosition().x();
									double y = arguments.getSource().getPosition().y();
									double z = arguments.getSource().getPosition().z();
									Entity entity = arguments.getSource().getEntity();
									if (entity == null)
										entity = FakePlayerFactory.getMinecraft(world);
									Direction direction = entity.getDirection();

									SetTechniqueXPProcedure.execute(arguments);
									return 0;
								})))))))
				.then(Commands.literal("kiAbsorbed")
						.then(Commands.literal("set").then(Commands.literal("Demonic").then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							SetDemonicKiProcedure.execute(arguments);
							return 0;
						})))).then(Commands.literal("God").then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							SetGodKiProcedure.execute(arguments);
							return 0;
						})))))
						.then(Commands.literal("add").then(Commands.literal("Demonic").then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							AddDemonicKiProcedure.execute(arguments);
							return 0;
						})))).then(Commands.literal("God").then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							AddGodKiProcedure.execute(arguments);
							return 0;
						})))))));
	}
}
