package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.data.server.BlockLootTableGenerator;

import net.xanthian.variantchests.block.Vanilla;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }
    @Override
    protected void generateBlockLootTables() {

        addDrop(Vanilla.ACACIA_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        //addDrop(Vanilla.BAMBOO_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.BIRCH_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        //addDrop(Vanilla.CHERRY_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.CRIMSON_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.DARK_OAK_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.JUNGLE_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.MANGROVE_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.OAK_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.SPRUCE_CHEST, BlockLootTableGenerator::nameableContainerDrops);
        addDrop(Vanilla.WARPED_CHEST, BlockLootTableGenerator::nameableContainerDrops);
    }
}