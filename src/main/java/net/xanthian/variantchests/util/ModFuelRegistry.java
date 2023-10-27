package net.xanthian.variantchests.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.fabricmc.loader.api.FabricLoader;

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
        registry.add(Vanilla.OAK_CHEST, 300);
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
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_CHEST, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_CHEST, 300);
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