package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import net.xanthian.variantchests.block.Vanilla;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerBuiltin(Vanilla.ACACIA_CHEST, Blocks.ACACIA_PLANKS).includeWithoutItem(Vanilla.ACACIA_CHEST);
        //blockStateModelGenerator.registerBuiltin(VariantChests.BAMBOO_CHEST,Blocks.BAMBOO_PLANKS).includeWithoutItem(Vanilla.BAMBOO_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.BIRCH_CHEST,Blocks.BIRCH_PLANKS).includeWithoutItem(Vanilla.BIRCH_CHEST);
        //blockStateModelGenerator.registerBuiltin(VariantChests.CHERRY_CHEST,Blocks.CHERRY_PLANKS).includeWithoutItem(Vanilla.CHERRY_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.CRIMSON_CHEST,Blocks.CRIMSON_PLANKS).includeWithoutItem(Vanilla.CRIMSON_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.DARK_OAK_CHEST,Blocks.DARK_OAK_PLANKS).includeWithoutItem(Vanilla.DARK_OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.JUNGLE_CHEST,Blocks.JUNGLE_PLANKS).includeWithoutItem(Vanilla.JUNGLE_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.MANGROVE_CHEST,Blocks.MANGROVE_PLANKS).includeWithoutItem(Vanilla.MANGROVE_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.OAK_CHEST,Blocks.OAK_PLANKS).includeWithoutItem(Vanilla.OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.SPRUCE_CHEST,Blocks.SPRUCE_PLANKS).includeWithoutItem(Vanilla.SPRUCE_CHEST);
        blockStateModelGenerator.registerBuiltin(Vanilla.WARPED_CHEST,Blocks.WARPED_PLANKS).includeWithoutItem(Vanilla.WARPED_CHEST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}