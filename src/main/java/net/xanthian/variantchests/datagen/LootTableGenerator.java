package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

import net.minecraft.loot.LootTable;

import net.xanthian.variantchests.block.Vanilla;

import java.util.List;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Vanilla.ACACIA_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BAMBOO_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BIRCH_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.CHERRY_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.CRIMSON_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.DARK_OAK_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.JUNGLE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.MANGROVE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.OAK_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.SPRUCE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.WARPED_CHEST, this::nameableContainerDrops);

    }
    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }
}