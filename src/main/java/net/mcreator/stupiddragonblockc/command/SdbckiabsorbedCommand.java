
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

import net.mcreator.stupiddragonblockc.procedures.SetGodKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.SetDemonicKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddGodKiProcedure;
import net.mcreator.stupiddragonblockc.procedures.AddDemonicKiProcedure;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class SdbckiabsorbedCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("sdbckiabsorbed").requires(s -> s.hasPermission(4)).then(Commands.argument("set", StringArgumentType.word())
				.then(Commands.argument("god", StringArgumentType.word()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
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
				})))).then(Commands.argument("demonic", StringArgumentType.word()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(0, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
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
				}))))).then(Commands.argument("add", StringArgumentType.word())
						.then(Commands.argument("god", StringArgumentType.word()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
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
						}))))
						.then(Commands.argument("demonic", StringArgumentType.word()).then(Commands.argument("amount", DoubleArgumentType.doubleArg(-100000, 100000)).then(Commands.argument("player", EntityArgument.player()).executes(arguments -> {
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
						}))))));
	}
}
