package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.xanthian.variantchests.block.Vanilla;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Vanilla.ACACIA_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BAMBOO_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BIRCH_CHEST, this::nameableContainerDrops);
        //addDrop(Vanilla.CHERRY_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.CRIMSON_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.DARK_OAK_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.JUNGLE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.MANGROVE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.OAK_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.SPRUCE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.WARPED_CHEST, this::nameableContainerDrops);

    }
}