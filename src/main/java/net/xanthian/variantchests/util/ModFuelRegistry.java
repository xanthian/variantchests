package net.xanthian.variantchests.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.xanthian.variantchests.block.Vanilla;

public class ModFuelRegistry {

    public static void registerFuel() {

        registerFuelBlocks();
    }

    private static void registerFuelBlocks() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_CHEST, 300);
        //registry.add(Vanilla.BAMBOO_CHEST, 300);
        registry.add(Vanilla.BIRCH_CHEST, 300);
        //registry.add(Vanilla.CHERRY_CHEST, 300);
        registry.add(Vanilla.DARK_OAK_CHEST, 300);
        registry.add(Vanilla.JUNGLE_CHEST, 300);
        //registry.add(Vanilla.MANGROVE_CHEST, 300);
        registry.add(Vanilla.OAK_CHEST, 300);
        registry.add(Vanilla.SPRUCE_CHEST, 300);
    }
}