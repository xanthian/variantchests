package net.xanthian.variantchests.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;

public class ModFuelRegistry {

    public static void registerFuel() {

        registerFuelBlocks();
    }

    private static void registerFuelBlocks() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_CHEST, 300);
        registry.add(Vanilla.BAMBOO_CHEST, 300);
        registry.add(Vanilla.BIRCH_CHEST, 300);
        registry.add(Vanilla.CHERRY_CHEST, 300);
        registry.add(Vanilla.DARK_OAK_CHEST, 300);
        registry.add(Vanilla.JUNGLE_CHEST, 300);
        registry.add(Vanilla.MANGROVE_CHEST, 300);
        registry.add(Vanilla.SPRUCE_CHEST, 300);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            registry.add(AdAstra.AA_GLACIAN_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            for (Block block : BiomeMakeover.BM_CHESTS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            registry.add(Cinderscapes.CS_SCORCHED_CHEST, 300);
            registry.add(Cinderscapes.CS_UMBRAL_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("desolation")) {
            registry.add(Desolation.DS_CHARRED_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            for (Block block : Ecologics.ECO_CHESTS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_CHESTS.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_CHEST, 300);
            registry.add(Promenade.PROM_PALM_CHEST, 300);
            registry.add(Promenade.PROM_SAKURA_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_CHEST, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_CHEST, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_CHEST, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_CHEST, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_CHEST, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_CHEST, 300);
            registry.add(RegionsUnexplored.RU_LARCH_CHEST, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_CHEST, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_CHEST, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_PALM_CHEST, 300);
            registry.add(RegionsUnexplored.RU_PINE_CHEST, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_CHEST, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_CHEST, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_CHEST, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_CHEST, 300);

            registry.add(RegionsUnexplored.RU_CHERRY_CHEST, 300);
            registry.add(RegionsUnexplored.RU_SCULKWOOD_CHEST, 300);

            registry.add(RegionsUnexplored.RU_BLUE_BIOSHROOM_CHEST, 300);
            registry.add(RegionsUnexplored.RU_GREEN_BIOSHROOM_CHEST, 300);
            registry.add(RegionsUnexplored.RU_KAPOK_CHEST, 300);
            registry.add(RegionsUnexplored.RU_MAGNOLIA_CHEST, 300);
            registry.add(RegionsUnexplored.RU_PINK_BIOSHROOM_CHEST, 300);
            registry.add(RegionsUnexplored.RU_SOCOTRA_CHEST, 300);

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_CHEST, 300);
        }
    }
}