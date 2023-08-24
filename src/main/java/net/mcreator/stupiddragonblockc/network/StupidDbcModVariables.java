package net.mcreator.stupiddragonblockc.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.stupiddragonblockc.StupidDbcMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StupidDbcModVariables {
	public static double saiyanTpGain = 0;
	public static double halfSaiyanTpGain = 0;
	public static double humanTpGain = 0;
	public static double SSMultiplier = 0.0;
	public static double SSGrade2Multiplier = 0.0;
	public static double SSGrade3Multiplier = 0.0;
	public static double FPSSMultiplier = 0.0;
	public static double SS2Multiplier = 0.0;
	public static double SS3Multiplier = 0.0;
	public static double SSGodMultiplier = 0.0;
	public static double SSBlueMultiplier = 0.0;
	public static double BuffedMultiplier = 0.0;
	public static double OozaruMultiplier = 0.0;
	public static double KaiokenMultiplier = 0;
	public static double Kaiokenx2Multiplier = 0;
	public static double Kaiokenx3Multiplier = 0;
	public static double Kaiokenx4Multiplier = 0;
	public static double Kaiokenx5Multiplier = 0;
	public static double Kaiokenx10Multiplier = 0;
	public static double Kaiokenx20Multiplier = 0;
	public static double Kaiokenx50Multiplier = 0;
	public static double Kaiokenx100Multiplier = 0;
	public static double SSKiDrain = 0;
	public static double SSGrade2KD = 0;
	public static double SSGrade3KD = 0;
	public static double FPSSKD = 0;
	public static double SS2KD = 0;
	public static double SS3KD = 0;
	public static double SSGodKiDrain = 0;
	public static double SSBlueKD = 0;
	public static double BuffedKD = 0;
	public static double KaiokenHD = 0;
	public static double Kaiokenx2HD = 0;
	public static double Kaiokenx3HD = 0;
	public static double Kaiokenx4HD = 0;
	public static double Kaiokenx5HD = 0;
	public static double Kaiokenx10HD = 0;
	public static double Kaiokenx20HD = 0;
	public static double Kaiokenx50HD = 0;
	public static double Kaiokenx100HD = 0;
	public static double BaseTpCost = 0;
	public static double MaxStats = 0;
	public static double KiRegen = 0;
	public static double SSPrice = 0;
	public static double SSGrade2Price = 0;
	public static double SSGrade3Price = 0;
	public static double FPSSPrice = 0;
	public static double SS2Price = 0;
	public static double SS3Price = 0;
	public static double kaiokenprice = 0;
	public static double kaiokenx2price = 0;
	public static double kaiokenx3price = 0;
	public static double kaiokenx4price = 0;
	public static double kaiokenx5price = 0;
	public static double kaiokenx10price = 0;
	public static double kaiokenx20price = 0;
	public static double kaiokenx50price = 0;
	public static double kaiokenx100price = 0;
	public static double fusionTrueDefense = 0;
	public static double SSBlueEvolvedKiDrain = 0;
	public static double SSBlueEvolvedMultiplier = 0;
	public static double GoldenOozaruMultiplier = 0;
	public static double SS4Multiplier = 0;
	public static double SS4LBMultiplier = 0;
	public static double GoldenOozaruKiDrain = 0;
	public static double SS4KiDrain = 0;
	public static double SS4LBKiDrain = 0;
	public static double costOfSSGod = 0;
	public static double costOfSSBlue = 0;
	public static double costOfSSBE = 0;
	public static double costOfSS4 = 0;
	public static double costOfSS4LB = 0;
	public static double SSRoseMultiplier = 0;
	public static double SSRoseGrade2Multiplier = 0;
	public static double SSRoseKD = 0;
	public static double SSRoseG2KD = 0;
	public static double LegendaryMultiplierBonus = 0;
	public static double LegendaryChance = 0;
	public static double LegendaryRate = 0;
	public static boolean legendaryGiven = false;
	public static double ultimateMultiplier = 0;
	public static double ultimateKiDrain = 0;
	public static double ultimatePrice = 0;
	public static double beastMultiplier = 0;
	public static double beastKiDrain = 0;
	public static double beastPrice = 0;
	public static double flyPrice = 0;
	public static double ssblue2multiplier = 0;
	public static double ssblue2kd = 0;
	public static double ssblue2price = 0;
	public static double ssrose2multiplier = 0;
	public static double ssrose2kd = 0;
	public static double ssblue3multiplier = 0;
	public static double ssblue3kd = 0;
	public static double ssblue3price = 0;
	public static double ssrose3multiplier = 0;
	public static double ssrose3kd = 0;
	public static double tpgmultiplier = 0;
	public static double tpgkd = 0;
	public static double tpgprice = 0;
	public static double UltraInstintOmenMultiplier = 0;
	public static double UltraInstinctOmenKD = 0;
	public static double UltraInstinctOmenPrice = 0;
	public static double UltraInstinctOmenDodgeChance = 0;
	public static double UltraInstinctOmenCounterChance = 0;
	public static double UltraInstinctOmenCounterPercentage = 0;
	public static double UIOmenHeatCharge = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		StupidDbcMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		StupidDbcMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.race = original.race;
			clone.Defense = original.Defense;
			clone.Strength = original.Strength;
			clone.KiPool = original.KiPool;
			clone.Health = original.Health;
			clone.KiPower = original.KiPower;
			clone.Mind = original.Mind;
			clone.UsedMind = original.UsedMind;
			clone.Spirit = original.Spirit;
			clone.Constitution = original.Constitution;
			clone.TrueDefense = original.TrueDefense;
			clone.tp = original.tp;
			clone.tpCost = original.tpCost;
			clone.amountToBuy = original.amountToBuy;
			clone.Willpower = original.Willpower;
			clone.tpGainRacial = original.tpGainRacial;
			clone.SuperFormLevel = original.SuperFormLevel;
			clone.costOfSuperForm = original.costOfSuperForm;
			clone.multiplier = original.multiplier;
			clone.TransformationType = original.TransformationType;
			clone.trueStrength = original.trueStrength;
			clone.trueDefense = original.trueDefense;
			clone.KaiokenLvl = original.KaiokenLvl;
			clone.costOfKaioken = original.costOfKaioken;
			clone.GodKiAbsorbed = original.GodKiAbsorbed;
			clone.DemonicKiAbsorbed = original.DemonicKiAbsorbed;
			clone.Alignment = original.Alignment;
			clone.hasBeenGodBefore = original.hasBeenGodBefore;
			clone.SuperSaiyanTrained = original.SuperSaiyanTrained;
			clone.SSGrade2Trained = original.SSGrade2Trained;
			clone.SSGrade3Trained = original.SSGrade3Trained;
			clone.FPSSTrained = original.FPSSTrained;
			clone.SS2Trained = original.SS2Trained;
			clone.SS3Trained = original.SS3Trained;
			clone.SSGodTrained = original.SSGodTrained;
			clone.SSBlueTrained = original.SSBlueTrained;
			clone.HasBeenBlueBefore = original.HasBeenBlueBefore;
			clone.gotMonstersHunted = original.gotMonstersHunted;
			clone.gotKillMob = original.gotKillMob;
			clone.gotIronGolem = original.gotIronGolem;
			clone.gotBreedAnimal = original.gotBreedAnimal;
			clone.gotKillDragon = original.gotKillDragon;
			clone.gotKillWither = original.gotKillWither;
			clone.gotSummonedWither = original.gotSummonedWither;
			clone.gotTamedAnimal = original.gotTamedAnimal;
			clone.MaxKiPool = original.MaxKiPool;
			clone.MaxHealthPool = original.MaxHealthPool;
			clone.InBetweenRace = original.InBetweenRace;
			clone.BuffedTraning = original.BuffedTraning;
			clone.powerPercentage = original.powerPercentage;
			clone.IsUsingSSGrade2 = original.IsUsingSSGrade2;
			clone.IsUsingSS2 = original.IsUsingSS2;
			clone.IsUsingKaioken = original.IsUsingKaioken;
			clone.IsUsingSSGod = original.IsUsingSSGod;
			clone.IsUsingSSBlue = original.IsUsingSSBlue;
			clone.HasPickedUpKatchinBefore = original.HasPickedUpKatchinBefore;
			clone.gravity = original.gravity;
			clone.i = original.i;
			clone.strongerInStrength = original.strongerInStrength;
			clone.SSBlueEvolvedTraining = original.SSBlueEvolvedTraining;
			clone.GoldenOozaruTraining = original.GoldenOozaruTraining;
			clone.SS4Training = original.SS4Training;
			clone.SS4LBTraining = original.SS4LBTraining;
			clone.OozaruTraining = original.OozaruTraining;
			clone.GodFormLevel = original.GodFormLevel;
			clone.CosrOfGodForm = original.CosrOfGodForm;
			clone.SSRoseTraining = original.SSRoseTraining;
			clone.SSRoseG2Training = original.SSRoseG2Training;
			clone.ultimateTraining = original.ultimateTraining;
			clone.beastTraining = original.beastTraining;
			clone.OldKaiRitualLevel = original.OldKaiRitualLevel;
			clone.costOfUltimate = original.costOfUltimate;
			clone.costOfFly = original.costOfFly;
			clone.FlyLevel = original.FlyLevel;
			clone.canUnlockBeast = original.canUnlockBeast;
			clone.ssblue2training = original.ssblue2training;
			clone.ssblue3training = original.ssblue3training;
			clone.SSRose2Training = original.SSRose2Training;
			clone.SSRose3Training = original.SSRose3Training;
			clone.tpgTraining = original.tpgTraining;
			clone.UltraInstintLevel = original.UltraInstintLevel;
			clone.UltraInstinctOmenTraining = original.UltraInstinctOmenTraining;
			clone.costOfUltraInstinct = original.costOfUltraInstinct;
			clone.SaiyanName = original.SaiyanName;
			clone.EarthName = original.EarthName;
			clone.hasEarthName = original.hasEarthName;
			clone.kaiokenTraining = original.kaiokenTraining;
			clone.kaiokenx2Training = original.kaiokenx2Training;
			clone.kaiokenx3Training = original.kaiokenx3Training;
			clone.kaiokenx4Training = original.kaiokenx4Training;
			clone.kaiokenx5Training = original.kaiokenx5Training;
			clone.kaiokenx10Training = original.kaiokenx10Training;
			clone.kaiokenx20Training = original.kaiokenx20Training;
			clone.kaiokenx50Training = original.kaiokenx50Training;
			clone.kaiokenx100Training = original.kaiokenx100Training;
			clone.SSRoseGrade2Training = original.SSRoseGrade2Training;
			clone.hasTail = original.hasTail;
			if (!event.isWasDeath()) {
				clone.transformation = original.transformation;
				clone.technique = original.technique;
				clone.AvailableMind = original.AvailableMind;
				clone.transformationTimer = original.transformationTimer;
				clone.weight = original.weight;
				clone.holdingKeybind = original.holdingKeybind;
				clone.holdingKeybind2 = original.holdingKeybind2;
				clone.gravityIncrement = original.gravityIncrement;
				clone.gravityInBlock = original.gravityInBlock;
				clone.trueWeight = original.trueWeight;
				clone.KingKaiSpeaking = original.KingKaiSpeaking;
				clone.GokuSpeaking = original.GokuSpeaking;
				clone.PiccoloSpeaking = original.PiccoloSpeaking;
				clone.fusionStrength = original.fusionStrength;
				clone.fusionTrueStrength = original.fusionTrueStrength;
				clone.fusionDefense = original.fusionDefense;
				clone.fusionConstitution = original.fusionConstitution;
				clone.fusionWillpower = original.fusionWillpower;
				clone.fusionMind = original.fusionMind;
				clone.fusionSpirit = original.fusionSpirit;
				clone.IsUsingSS4 = original.IsUsingSS4;
				clone.DoUltimate = original.DoUltimate;
				clone.DoBeast = original.DoBeast;
				clone.transformationMultiplier = original.transformationMultiplier;
				clone.isFlying = original.isFlying;
				clone.isUsingTPG = original.isUsingTPG;
				clone.UIHeat = original.UIHeat;
				clone.isUsingUI = original.isUsingUI;
				clone.endermanNearby = original.endermanNearby;
				clone.BlazeNearby = original.BlazeNearby;
				clone.GhastNearby = original.GhastNearby;
				clone.WitherNearby = original.WitherNearby;
				clone.witherSkeletonsNearby = original.witherSkeletonsNearby;
				clone.piglinNearby = original.piglinNearby;
				clone.hoglinNearby = original.hoglinNearby;
				clone.zoglinNearby = original.zoglinNearby;
				clone.ZombifiedPiglinNearby = original.ZombifiedPiglinNearby;
				clone.EndermiteNearby = original.EndermiteNearby;
				clone.TailApplied = original.TailApplied;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "stupid_dbc_worldvars";
		public double ReviveX = 0;
		public double ReviveY = 0;
		public double ReviveZ = 0;
		public boolean structureGenerated = false;
		public double i2 = 0;
		public boolean kingKaiGenerated = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			ReviveX = nbt.getDouble("ReviveX");
			ReviveY = nbt.getDouble("ReviveY");
			ReviveZ = nbt.getDouble("ReviveZ");
			structureGenerated = nbt.getBoolean("structureGenerated");
			i2 = nbt.getDouble("i2");
			kingKaiGenerated = nbt.getBoolean("kingKaiGenerated");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("ReviveX", ReviveX);
			nbt.putDouble("ReviveY", ReviveY);
			nbt.putDouble("ReviveZ", ReviveZ);
			nbt.putBoolean("structureGenerated", structureGenerated);
			nbt.putDouble("i2", i2);
			nbt.putBoolean("kingKaiGenerated", kingKaiGenerated);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "stupid_dbc_mapvars";
		public boolean gotBreedAllAnimals = false;
		public double UIOmenHeatDrain = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			gotBreedAllAnimals = nbt.getBoolean("gotBreedAllAnimals");
			UIOmenHeatDrain = nbt.getDouble("UIOmenHeatDrain");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("gotBreedAllAnimals", gotBreedAllAnimals);
			nbt.putDouble("UIOmenHeatDrain", UIOmenHeatDrain);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("stupid_dbc", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String transformation = "\"Base\"";
		public String technique = "\"None\"";
		public double AvailableMind = 0;
		public String race = "\"\"";
		public double Defense = 15.0;
		public double Strength = 15.0;
		public double KiPool = 200.0;
		public double Health = 200.0;
		public double KiPower = 5.0;
		public double Mind = 10.0;
		public double UsedMind = 0;
		public double Spirit = 5.0;
		public double Constitution = 10.0;
		public double TrueDefense = 7.5;
		public double tp = 0.0;
		public double tpCost = 16.0;
		public double amountToBuy = 1.0;
		public double Willpower = 10.0;
		public double tpGainRacial = 0.0;
		public double SuperFormLevel = 0;
		public double costOfSuperForm = 5000.0;
		public double multiplier = 1.0;
		public double transformationTimer = 0;
		public String TransformationType = "\"\"";
		public double trueStrength = 0;
		public double trueDefense = 0;
		public double KaiokenLvl = 0;
		public double costOfKaioken = 500.0;
		public double GodKiAbsorbed = 0;
		public double DemonicKiAbsorbed = 0;
		public double Alignment = 0;
		public boolean hasBeenGodBefore = false;
		public double SuperSaiyanTrained = 0;
		public double SSGrade2Trained = 0;
		public double SSGrade3Trained = 0;
		public double FPSSTrained = 0;
		public double SS2Trained = 0;
		public double SS3Trained = 0;
		public double SSGodTrained = 0;
		public double SSBlueTrained = 0;
		public boolean HasBeenBlueBefore = false;
		public boolean gotMonstersHunted = false;
		public boolean gotKillMob = false;
		public boolean gotIronGolem = false;
		public boolean gotBreedAnimal = false;
		public boolean gotKillDragon = false;
		public boolean gotKillWither = false;
		public boolean gotSummonedWither = false;
		public boolean gotTamedAnimal = false;
		public double MaxKiPool = 0;
		public double MaxHealthPool = 0;
		public String InBetweenRace = "\"\"";
		public double BuffedTraning = 0;
		public double powerPercentage = 50.0;
		public boolean IsUsingSSGrade2 = false;
		public boolean IsUsingSS2 = false;
		public boolean IsUsingKaioken = false;
		public boolean IsUsingSSGod = false;
		public boolean IsUsingSSBlue = false;
		public boolean HasPickedUpKatchinBefore = false;
		public double weight = 0;
		public double gravity = 0;
		public double i = 0;
		public boolean holdingKeybind = false;
		public boolean holdingKeybind2 = false;
		public double gravityIncrement = 0;
		public double gravityInBlock = 0;
		public double trueWeight = 0;
		public String KingKaiSpeaking = "\"\"";
		public String GokuSpeaking = "\"\"";
		public String PiccoloSpeaking = "\"\"";
		public double fusionStrength = 0;
		public double fusionTrueStrength = 0;
		public double fusionDefense = 0;
		public double fusionConstitution = 0;
		public double fusionWillpower = 0;
		public double fusionMind = 0;
		public double fusionSpirit = 0;
		public boolean strongerInStrength = false;
		public double SSBlueEvolvedTraining = 0;
		public double GoldenOozaruTraining = 0;
		public double SS4Training = 0;
		public double SS4LBTraining = 0;
		public boolean IsUsingSS4 = false;
		public double OozaruTraining = 0;
		public double GodFormLevel = 0;
		public double CosrOfGodForm = 0;
		public double SSRoseTraining = 0;
		public double SSRoseG2Training = 0;
		public double ultimateTraining = 0;
		public double beastTraining = 0;
		public double OldKaiRitualLevel = 0;
		public double costOfUltimate = 0;
		public boolean DoUltimate = false;
		public boolean DoBeast = false;
		public double transformationMultiplier = 0;
		public double costOfFly = 0;
		public double FlyLevel = 0;
		public boolean isFlying = false;
		public boolean canUnlockBeast = false;
		public double ssblue2training = 0;
		public double ssblue3training = 0;
		public double SSRose2Training = 0;
		public double SSRose3Training = 0;
		public double tpgTraining = 0;
		public boolean isUsingTPG = false;
		public double UltraInstintLevel = 0;
		public double UltraInstinctOmenTraining = 0;
		public double costOfUltraInstinct = 0;
		public String SaiyanName = "\"\"";
		public String EarthName = "\"\"";
		public boolean hasEarthName = false;
		public double kaiokenTraining = 0;
		public double kaiokenx2Training = 0;
		public double kaiokenx3Training = 0;
		public double kaiokenx4Training = 0;
		public double kaiokenx5Training = 0;
		public double kaiokenx10Training = 0;
		public double kaiokenx20Training = 0;
		public double kaiokenx50Training = 0;
		public double kaiokenx100Training = 0;
		public double UIHeat = 0;
		public boolean isUsingUI = false;
		public double SSRoseGrade2Training = 0;
		public double endermanNearby = 0;
		public double BlazeNearby = 0;
		public double GhastNearby = 0;
		public double WitherNearby = 0;
		public double witherSkeletonsNearby = 0;
		public double piglinNearby = 0;
		public double hoglinNearby = 0;
		public double zoglinNearby = 0;
		public double ZombifiedPiglinNearby = 0;
		public double EndermiteNearby = 0;
		public boolean hasTail = false;
		public boolean TailApplied = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				StupidDbcMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("transformation", transformation);
			nbt.putString("technique", technique);
			nbt.putDouble("AvailableMind", AvailableMind);
			nbt.putString("race", race);
			nbt.putDouble("Defense", Defense);
			nbt.putDouble("Strength", Strength);
			nbt.putDouble("KiPool", KiPool);
			nbt.putDouble("Health", Health);
			nbt.putDouble("KiPower", KiPower);
			nbt.putDouble("Mind", Mind);
			nbt.putDouble("UsedMind", UsedMind);
			nbt.putDouble("Spirit", Spirit);
			nbt.putDouble("Constitution", Constitution);
			nbt.putDouble("TrueDefense", TrueDefense);
			nbt.putDouble("tp", tp);
			nbt.putDouble("tpCost", tpCost);
			nbt.putDouble("amountToBuy", amountToBuy);
			nbt.putDouble("Willpower", Willpower);
			nbt.putDouble("tpGainRacial", tpGainRacial);
			nbt.putDouble("SuperFormLevel", SuperFormLevel);
			nbt.putDouble("costOfSuperForm", costOfSuperForm);
			nbt.putDouble("multiplier", multiplier);
			nbt.putDouble("transformationTimer", transformationTimer);
			nbt.putString("TransformationType", TransformationType);
			nbt.putDouble("trueStrength", trueStrength);
			nbt.putDouble("trueDefense", trueDefense);
			nbt.putDouble("KaiokenLvl", KaiokenLvl);
			nbt.putDouble("costOfKaioken", costOfKaioken);
			nbt.putDouble("GodKiAbsorbed", GodKiAbsorbed);
			nbt.putDouble("DemonicKiAbsorbed", DemonicKiAbsorbed);
			nbt.putDouble("Alignment", Alignment);
			nbt.putBoolean("hasBeenGodBefore", hasBeenGodBefore);
			nbt.putDouble("SuperSaiyanTrained", SuperSaiyanTrained);
			nbt.putDouble("SSGrade2Trained", SSGrade2Trained);
			nbt.putDouble("SSGrade3Trained", SSGrade3Trained);
			nbt.putDouble("FPSSTrained", FPSSTrained);
			nbt.putDouble("SS2Trained", SS2Trained);
			nbt.putDouble("SS3Trained", SS3Trained);
			nbt.putDouble("SSGodTrained", SSGodTrained);
			nbt.putDouble("SSBlueTrained", SSBlueTrained);
			nbt.putBoolean("HasBeenBlueBefore", HasBeenBlueBefore);
			nbt.putBoolean("gotMonstersHunted", gotMonstersHunted);
			nbt.putBoolean("gotKillMob", gotKillMob);
			nbt.putBoolean("gotIronGolem", gotIronGolem);
			nbt.putBoolean("gotBreedAnimal", gotBreedAnimal);
			nbt.putBoolean("gotKillDragon", gotKillDragon);
			nbt.putBoolean("gotKillWither", gotKillWither);
			nbt.putBoolean("gotSummonedWither", gotSummonedWither);
			nbt.putBoolean("gotTamedAnimal", gotTamedAnimal);
			nbt.putDouble("MaxKiPool", MaxKiPool);
			nbt.putDouble("MaxHealthPool", MaxHealthPool);
			nbt.putString("InBetweenRace", InBetweenRace);
			nbt.putDouble("BuffedTraning", BuffedTraning);
			nbt.putDouble("powerPercentage", powerPercentage);
			nbt.putBoolean("IsUsingSSGrade2", IsUsingSSGrade2);
			nbt.putBoolean("IsUsingSS2", IsUsingSS2);
			nbt.putBoolean("IsUsingKaioken", IsUsingKaioken);
			nbt.putBoolean("IsUsingSSGod", IsUsingSSGod);
			nbt.putBoolean("IsUsingSSBlue", IsUsingSSBlue);
			nbt.putBoolean("HasPickedUpKatchinBefore", HasPickedUpKatchinBefore);
			nbt.putDouble("weight", weight);
			nbt.putDouble("gravity", gravity);
			nbt.putDouble("i", i);
			nbt.putBoolean("holdingKeybind", holdingKeybind);
			nbt.putBoolean("holdingKeybind2", holdingKeybind2);
			nbt.putDouble("gravityIncrement", gravityIncrement);
			nbt.putDouble("gravityInBlock", gravityInBlock);
			nbt.putDouble("trueWeight", trueWeight);
			nbt.putString("KingKaiSpeaking", KingKaiSpeaking);
			nbt.putString("GokuSpeaking", GokuSpeaking);
			nbt.putString("PiccoloSpeaking", PiccoloSpeaking);
			nbt.putDouble("fusionStrength", fusionStrength);
			nbt.putDouble("fusionTrueStrength", fusionTrueStrength);
			nbt.putDouble("fusionDefense", fusionDefense);
			nbt.putDouble("fusionConstitution", fusionConstitution);
			nbt.putDouble("fusionWillpower", fusionWillpower);
			nbt.putDouble("fusionMind", fusionMind);
			nbt.putDouble("fusionSpirit", fusionSpirit);
			nbt.putBoolean("strongerInStrength", strongerInStrength);
			nbt.putDouble("SSBlueEvolvedTraining", SSBlueEvolvedTraining);
			nbt.putDouble("GoldenOozaruTraining", GoldenOozaruTraining);
			nbt.putDouble("SS4Training", SS4Training);
			nbt.putDouble("SS4LBTraining", SS4LBTraining);
			nbt.putBoolean("IsUsingSS4", IsUsingSS4);
			nbt.putDouble("OozaruTraining", OozaruTraining);
			nbt.putDouble("GodFormLevel", GodFormLevel);
			nbt.putDouble("CosrOfGodForm", CosrOfGodForm);
			nbt.putDouble("SSRoseTraining", SSRoseTraining);
			nbt.putDouble("SSRoseG2Training", SSRoseG2Training);
			nbt.putDouble("ultimateTraining", ultimateTraining);
			nbt.putDouble("beastTraining", beastTraining);
			nbt.putDouble("OldKaiRitualLevel", OldKaiRitualLevel);
			nbt.putDouble("costOfUltimate", costOfUltimate);
			nbt.putBoolean("DoUltimate", DoUltimate);
			nbt.putBoolean("DoBeast", DoBeast);
			nbt.putDouble("transformationMultiplier", transformationMultiplier);
			nbt.putDouble("costOfFly", costOfFly);
			nbt.putDouble("FlyLevel", FlyLevel);
			nbt.putBoolean("isFlying", isFlying);
			nbt.putBoolean("canUnlockBeast", canUnlockBeast);
			nbt.putDouble("ssblue2training", ssblue2training);
			nbt.putDouble("ssblue3training", ssblue3training);
			nbt.putDouble("SSRose2Training", SSRose2Training);
			nbt.putDouble("SSRose3Training", SSRose3Training);
			nbt.putDouble("tpgTraining", tpgTraining);
			nbt.putBoolean("isUsingTPG", isUsingTPG);
			nbt.putDouble("UltraInstintLevel", UltraInstintLevel);
			nbt.putDouble("UltraInstinctOmenTraining", UltraInstinctOmenTraining);
			nbt.putDouble("costOfUltraInstinct", costOfUltraInstinct);
			nbt.putString("SaiyanName", SaiyanName);
			nbt.putString("EarthName", EarthName);
			nbt.putBoolean("hasEarthName", hasEarthName);
			nbt.putDouble("kaiokenTraining", kaiokenTraining);
			nbt.putDouble("kaiokenx2Training", kaiokenx2Training);
			nbt.putDouble("kaiokenx3Training", kaiokenx3Training);
			nbt.putDouble("kaiokenx4Training", kaiokenx4Training);
			nbt.putDouble("kaiokenx5Training", kaiokenx5Training);
			nbt.putDouble("kaiokenx10Training", kaiokenx10Training);
			nbt.putDouble("kaiokenx20Training", kaiokenx20Training);
			nbt.putDouble("kaiokenx50Training", kaiokenx50Training);
			nbt.putDouble("kaiokenx100Training", kaiokenx100Training);
			nbt.putDouble("UIHeat", UIHeat);
			nbt.putBoolean("isUsingUI", isUsingUI);
			nbt.putDouble("SSRoseGrade2Training", SSRoseGrade2Training);
			nbt.putDouble("endermanNearby", endermanNearby);
			nbt.putDouble("BlazeNearby", BlazeNearby);
			nbt.putDouble("GhastNearby", GhastNearby);
			nbt.putDouble("WitherNearby", WitherNearby);
			nbt.putDouble("witherSkeletonsNearby", witherSkeletonsNearby);
			nbt.putDouble("piglinNearby", piglinNearby);
			nbt.putDouble("hoglinNearby", hoglinNearby);
			nbt.putDouble("zoglinNearby", zoglinNearby);
			nbt.putDouble("ZombifiedPiglinNearby", ZombifiedPiglinNearby);
			nbt.putDouble("EndermiteNearby", EndermiteNearby);
			nbt.putBoolean("hasTail", hasTail);
			nbt.putBoolean("TailApplied", TailApplied);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			transformation = nbt.getString("transformation");
			technique = nbt.getString("technique");
			AvailableMind = nbt.getDouble("AvailableMind");
			race = nbt.getString("race");
			Defense = nbt.getDouble("Defense");
			Strength = nbt.getDouble("Strength");
			KiPool = nbt.getDouble("KiPool");
			Health = nbt.getDouble("Health");
			KiPower = nbt.getDouble("KiPower");
			Mind = nbt.getDouble("Mind");
			UsedMind = nbt.getDouble("UsedMind");
			Spirit = nbt.getDouble("Spirit");
			Constitution = nbt.getDouble("Constitution");
			TrueDefense = nbt.getDouble("TrueDefense");
			tp = nbt.getDouble("tp");
			tpCost = nbt.getDouble("tpCost");
			amountToBuy = nbt.getDouble("amountToBuy");
			Willpower = nbt.getDouble("Willpower");
			tpGainRacial = nbt.getDouble("tpGainRacial");
			SuperFormLevel = nbt.getDouble("SuperFormLevel");
			costOfSuperForm = nbt.getDouble("costOfSuperForm");
			multiplier = nbt.getDouble("multiplier");
			transformationTimer = nbt.getDouble("transformationTimer");
			TransformationType = nbt.getString("TransformationType");
			trueStrength = nbt.getDouble("trueStrength");
			trueDefense = nbt.getDouble("trueDefense");
			KaiokenLvl = nbt.getDouble("KaiokenLvl");
			costOfKaioken = nbt.getDouble("costOfKaioken");
			GodKiAbsorbed = nbt.getDouble("GodKiAbsorbed");
			DemonicKiAbsorbed = nbt.getDouble("DemonicKiAbsorbed");
			Alignment = nbt.getDouble("Alignment");
			hasBeenGodBefore = nbt.getBoolean("hasBeenGodBefore");
			SuperSaiyanTrained = nbt.getDouble("SuperSaiyanTrained");
			SSGrade2Trained = nbt.getDouble("SSGrade2Trained");
			SSGrade3Trained = nbt.getDouble("SSGrade3Trained");
			FPSSTrained = nbt.getDouble("FPSSTrained");
			SS2Trained = nbt.getDouble("SS2Trained");
			SS3Trained = nbt.getDouble("SS3Trained");
			SSGodTrained = nbt.getDouble("SSGodTrained");
			SSBlueTrained = nbt.getDouble("SSBlueTrained");
			HasBeenBlueBefore = nbt.getBoolean("HasBeenBlueBefore");
			gotMonstersHunted = nbt.getBoolean("gotMonstersHunted");
			gotKillMob = nbt.getBoolean("gotKillMob");
			gotIronGolem = nbt.getBoolean("gotIronGolem");
			gotBreedAnimal = nbt.getBoolean("gotBreedAnimal");
			gotKillDragon = nbt.getBoolean("gotKillDragon");
			gotKillWither = nbt.getBoolean("gotKillWither");
			gotSummonedWither = nbt.getBoolean("gotSummonedWither");
			gotTamedAnimal = nbt.getBoolean("gotTamedAnimal");
			MaxKiPool = nbt.getDouble("MaxKiPool");
			MaxHealthPool = nbt.getDouble("MaxHealthPool");
			InBetweenRace = nbt.getString("InBetweenRace");
			BuffedTraning = nbt.getDouble("BuffedTraning");
			powerPercentage = nbt.getDouble("powerPercentage");
			IsUsingSSGrade2 = nbt.getBoolean("IsUsingSSGrade2");
			IsUsingSS2 = nbt.getBoolean("IsUsingSS2");
			IsUsingKaioken = nbt.getBoolean("IsUsingKaioken");
			IsUsingSSGod = nbt.getBoolean("IsUsingSSGod");
			IsUsingSSBlue = nbt.getBoolean("IsUsingSSBlue");
			HasPickedUpKatchinBefore = nbt.getBoolean("HasPickedUpKatchinBefore");
			weight = nbt.getDouble("weight");
			gravity = nbt.getDouble("gravity");
			i = nbt.getDouble("i");
			holdingKeybind = nbt.getBoolean("holdingKeybind");
			holdingKeybind2 = nbt.getBoolean("holdingKeybind2");
			gravityIncrement = nbt.getDouble("gravityIncrement");
			gravityInBlock = nbt.getDouble("gravityInBlock");
			trueWeight = nbt.getDouble("trueWeight");
			KingKaiSpeaking = nbt.getString("KingKaiSpeaking");
			GokuSpeaking = nbt.getString("GokuSpeaking");
			PiccoloSpeaking = nbt.getString("PiccoloSpeaking");
			fusionStrength = nbt.getDouble("fusionStrength");
			fusionTrueStrength = nbt.getDouble("fusionTrueStrength");
			fusionDefense = nbt.getDouble("fusionDefense");
			fusionConstitution = nbt.getDouble("fusionConstitution");
			fusionWillpower = nbt.getDouble("fusionWillpower");
			fusionMind = nbt.getDouble("fusionMind");
			fusionSpirit = nbt.getDouble("fusionSpirit");
			strongerInStrength = nbt.getBoolean("strongerInStrength");
			SSBlueEvolvedTraining = nbt.getDouble("SSBlueEvolvedTraining");
			GoldenOozaruTraining = nbt.getDouble("GoldenOozaruTraining");
			SS4Training = nbt.getDouble("SS4Training");
			SS4LBTraining = nbt.getDouble("SS4LBTraining");
			IsUsingSS4 = nbt.getBoolean("IsUsingSS4");
			OozaruTraining = nbt.getDouble("OozaruTraining");
			GodFormLevel = nbt.getDouble("GodFormLevel");
			CosrOfGodForm = nbt.getDouble("CosrOfGodForm");
			SSRoseTraining = nbt.getDouble("SSRoseTraining");
			SSRoseG2Training = nbt.getDouble("SSRoseG2Training");
			ultimateTraining = nbt.getDouble("ultimateTraining");
			beastTraining = nbt.getDouble("beastTraining");
			OldKaiRitualLevel = nbt.getDouble("OldKaiRitualLevel");
			costOfUltimate = nbt.getDouble("costOfUltimate");
			DoUltimate = nbt.getBoolean("DoUltimate");
			DoBeast = nbt.getBoolean("DoBeast");
			transformationMultiplier = nbt.getDouble("transformationMultiplier");
			costOfFly = nbt.getDouble("costOfFly");
			FlyLevel = nbt.getDouble("FlyLevel");
			isFlying = nbt.getBoolean("isFlying");
			canUnlockBeast = nbt.getBoolean("canUnlockBeast");
			ssblue2training = nbt.getDouble("ssblue2training");
			ssblue3training = nbt.getDouble("ssblue3training");
			SSRose2Training = nbt.getDouble("SSRose2Training");
			SSRose3Training = nbt.getDouble("SSRose3Training");
			tpgTraining = nbt.getDouble("tpgTraining");
			isUsingTPG = nbt.getBoolean("isUsingTPG");
			UltraInstintLevel = nbt.getDouble("UltraInstintLevel");
			UltraInstinctOmenTraining = nbt.getDouble("UltraInstinctOmenTraining");
			costOfUltraInstinct = nbt.getDouble("costOfUltraInstinct");
			SaiyanName = nbt.getString("SaiyanName");
			EarthName = nbt.getString("EarthName");
			hasEarthName = nbt.getBoolean("hasEarthName");
			kaiokenTraining = nbt.getDouble("kaiokenTraining");
			kaiokenx2Training = nbt.getDouble("kaiokenx2Training");
			kaiokenx3Training = nbt.getDouble("kaiokenx3Training");
			kaiokenx4Training = nbt.getDouble("kaiokenx4Training");
			kaiokenx5Training = nbt.getDouble("kaiokenx5Training");
			kaiokenx10Training = nbt.getDouble("kaiokenx10Training");
			kaiokenx20Training = nbt.getDouble("kaiokenx20Training");
			kaiokenx50Training = nbt.getDouble("kaiokenx50Training");
			kaiokenx100Training = nbt.getDouble("kaiokenx100Training");
			UIHeat = nbt.getDouble("UIHeat");
			isUsingUI = nbt.getBoolean("isUsingUI");
			SSRoseGrade2Training = nbt.getDouble("SSRoseGrade2Training");
			endermanNearby = nbt.getDouble("endermanNearby");
			BlazeNearby = nbt.getDouble("BlazeNearby");
			GhastNearby = nbt.getDouble("GhastNearby");
			WitherNearby = nbt.getDouble("WitherNearby");
			witherSkeletonsNearby = nbt.getDouble("witherSkeletonsNearby");
			piglinNearby = nbt.getDouble("piglinNearby");
			hoglinNearby = nbt.getDouble("hoglinNearby");
			zoglinNearby = nbt.getDouble("zoglinNearby");
			ZombifiedPiglinNearby = nbt.getDouble("ZombifiedPiglinNearby");
			EndermiteNearby = nbt.getDouble("EndermiteNearby");
			hasTail = nbt.getBoolean("hasTail");
			TailApplied = nbt.getBoolean("TailApplied");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.transformation = message.data.transformation;
					variables.technique = message.data.technique;
					variables.AvailableMind = message.data.AvailableMind;
					variables.race = message.data.race;
					variables.Defense = message.data.Defense;
					variables.Strength = message.data.Strength;
					variables.KiPool = message.data.KiPool;
					variables.Health = message.data.Health;
					variables.KiPower = message.data.KiPower;
					variables.Mind = message.data.Mind;
					variables.UsedMind = message.data.UsedMind;
					variables.Spirit = message.data.Spirit;
					variables.Constitution = message.data.Constitution;
					variables.TrueDefense = message.data.TrueDefense;
					variables.tp = message.data.tp;
					variables.tpCost = message.data.tpCost;
					variables.amountToBuy = message.data.amountToBuy;
					variables.Willpower = message.data.Willpower;
					variables.tpGainRacial = message.data.tpGainRacial;
					variables.SuperFormLevel = message.data.SuperFormLevel;
					variables.costOfSuperForm = message.data.costOfSuperForm;
					variables.multiplier = message.data.multiplier;
					variables.transformationTimer = message.data.transformationTimer;
					variables.TransformationType = message.data.TransformationType;
					variables.trueStrength = message.data.trueStrength;
					variables.trueDefense = message.data.trueDefense;
					variables.KaiokenLvl = message.data.KaiokenLvl;
					variables.costOfKaioken = message.data.costOfKaioken;
					variables.GodKiAbsorbed = message.data.GodKiAbsorbed;
					variables.DemonicKiAbsorbed = message.data.DemonicKiAbsorbed;
					variables.Alignment = message.data.Alignment;
					variables.hasBeenGodBefore = message.data.hasBeenGodBefore;
					variables.SuperSaiyanTrained = message.data.SuperSaiyanTrained;
					variables.SSGrade2Trained = message.data.SSGrade2Trained;
					variables.SSGrade3Trained = message.data.SSGrade3Trained;
					variables.FPSSTrained = message.data.FPSSTrained;
					variables.SS2Trained = message.data.SS2Trained;
					variables.SS3Trained = message.data.SS3Trained;
					variables.SSGodTrained = message.data.SSGodTrained;
					variables.SSBlueTrained = message.data.SSBlueTrained;
					variables.HasBeenBlueBefore = message.data.HasBeenBlueBefore;
					variables.gotMonstersHunted = message.data.gotMonstersHunted;
					variables.gotKillMob = message.data.gotKillMob;
					variables.gotIronGolem = message.data.gotIronGolem;
					variables.gotBreedAnimal = message.data.gotBreedAnimal;
					variables.gotKillDragon = message.data.gotKillDragon;
					variables.gotKillWither = message.data.gotKillWither;
					variables.gotSummonedWither = message.data.gotSummonedWither;
					variables.gotTamedAnimal = message.data.gotTamedAnimal;
					variables.MaxKiPool = message.data.MaxKiPool;
					variables.MaxHealthPool = message.data.MaxHealthPool;
					variables.InBetweenRace = message.data.InBetweenRace;
					variables.BuffedTraning = message.data.BuffedTraning;
					variables.powerPercentage = message.data.powerPercentage;
					variables.IsUsingSSGrade2 = message.data.IsUsingSSGrade2;
					variables.IsUsingSS2 = message.data.IsUsingSS2;
					variables.IsUsingKaioken = message.data.IsUsingKaioken;
					variables.IsUsingSSGod = message.data.IsUsingSSGod;
					variables.IsUsingSSBlue = message.data.IsUsingSSBlue;
					variables.HasPickedUpKatchinBefore = message.data.HasPickedUpKatchinBefore;
					variables.weight = message.data.weight;
					variables.gravity = message.data.gravity;
					variables.i = message.data.i;
					variables.holdingKeybind = message.data.holdingKeybind;
					variables.holdingKeybind2 = message.data.holdingKeybind2;
					variables.gravityIncrement = message.data.gravityIncrement;
					variables.gravityInBlock = message.data.gravityInBlock;
					variables.trueWeight = message.data.trueWeight;
					variables.KingKaiSpeaking = message.data.KingKaiSpeaking;
					variables.GokuSpeaking = message.data.GokuSpeaking;
					variables.PiccoloSpeaking = message.data.PiccoloSpeaking;
					variables.fusionStrength = message.data.fusionStrength;
					variables.fusionTrueStrength = message.data.fusionTrueStrength;
					variables.fusionDefense = message.data.fusionDefense;
					variables.fusionConstitution = message.data.fusionConstitution;
					variables.fusionWillpower = message.data.fusionWillpower;
					variables.fusionMind = message.data.fusionMind;
					variables.fusionSpirit = message.data.fusionSpirit;
					variables.strongerInStrength = message.data.strongerInStrength;
					variables.SSBlueEvolvedTraining = message.data.SSBlueEvolvedTraining;
					variables.GoldenOozaruTraining = message.data.GoldenOozaruTraining;
					variables.SS4Training = message.data.SS4Training;
					variables.SS4LBTraining = message.data.SS4LBTraining;
					variables.IsUsingSS4 = message.data.IsUsingSS4;
					variables.OozaruTraining = message.data.OozaruTraining;
					variables.GodFormLevel = message.data.GodFormLevel;
					variables.CosrOfGodForm = message.data.CosrOfGodForm;
					variables.SSRoseTraining = message.data.SSRoseTraining;
					variables.SSRoseG2Training = message.data.SSRoseG2Training;
					variables.ultimateTraining = message.data.ultimateTraining;
					variables.beastTraining = message.data.beastTraining;
					variables.OldKaiRitualLevel = message.data.OldKaiRitualLevel;
					variables.costOfUltimate = message.data.costOfUltimate;
					variables.DoUltimate = message.data.DoUltimate;
					variables.DoBeast = message.data.DoBeast;
					variables.transformationMultiplier = message.data.transformationMultiplier;
					variables.costOfFly = message.data.costOfFly;
					variables.FlyLevel = message.data.FlyLevel;
					variables.isFlying = message.data.isFlying;
					variables.canUnlockBeast = message.data.canUnlockBeast;
					variables.ssblue2training = message.data.ssblue2training;
					variables.ssblue3training = message.data.ssblue3training;
					variables.SSRose2Training = message.data.SSRose2Training;
					variables.SSRose3Training = message.data.SSRose3Training;
					variables.tpgTraining = message.data.tpgTraining;
					variables.isUsingTPG = message.data.isUsingTPG;
					variables.UltraInstintLevel = message.data.UltraInstintLevel;
					variables.UltraInstinctOmenTraining = message.data.UltraInstinctOmenTraining;
					variables.costOfUltraInstinct = message.data.costOfUltraInstinct;
					variables.SaiyanName = message.data.SaiyanName;
					variables.EarthName = message.data.EarthName;
					variables.hasEarthName = message.data.hasEarthName;
					variables.kaiokenTraining = message.data.kaiokenTraining;
					variables.kaiokenx2Training = message.data.kaiokenx2Training;
					variables.kaiokenx3Training = message.data.kaiokenx3Training;
					variables.kaiokenx4Training = message.data.kaiokenx4Training;
					variables.kaiokenx5Training = message.data.kaiokenx5Training;
					variables.kaiokenx10Training = message.data.kaiokenx10Training;
					variables.kaiokenx20Training = message.data.kaiokenx20Training;
					variables.kaiokenx50Training = message.data.kaiokenx50Training;
					variables.kaiokenx100Training = message.data.kaiokenx100Training;
					variables.UIHeat = message.data.UIHeat;
					variables.isUsingUI = message.data.isUsingUI;
					variables.SSRoseGrade2Training = message.data.SSRoseGrade2Training;
					variables.endermanNearby = message.data.endermanNearby;
					variables.BlazeNearby = message.data.BlazeNearby;
					variables.GhastNearby = message.data.GhastNearby;
					variables.WitherNearby = message.data.WitherNearby;
					variables.witherSkeletonsNearby = message.data.witherSkeletonsNearby;
					variables.piglinNearby = message.data.piglinNearby;
					variables.hoglinNearby = message.data.hoglinNearby;
					variables.zoglinNearby = message.data.zoglinNearby;
					variables.ZombifiedPiglinNearby = message.data.ZombifiedPiglinNearby;
					variables.EndermiteNearby = message.data.EndermiteNearby;
					variables.hasTail = message.data.hasTail;
					variables.TailApplied = message.data.TailApplied;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
