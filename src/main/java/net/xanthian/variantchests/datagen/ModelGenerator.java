package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.VariantChests;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerBuiltin(VariantChests.ACACIA.getId().withPrefixedPath("block/"),Blocks.ACACIA_PLANKS).includeWithoutItem(Vanilla.ACACIA_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BAMBOO.getId().withPrefixedPath("block/"),Blocks.BAMBOO_PLANKS).includeWithoutItem(Vanilla.BAMBOO_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BIRCH.getId().withPrefixedPath("block/"),Blocks.BIRCH_PLANKS).includeWithoutItem(Vanilla.BIRCH_CHEST);
        //blockStateModelGenerator.registerBuiltin(VariantChests.CHERRY.getId().withPrefixedPath("block/"),Blocks.CHERRY_PLANKS).includeWithoutItem(Vanilla.CHERRY_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.CRIMSON.getId().withPrefixedPath("block/"),Blocks.CRIMSON_PLANKS).includeWithoutItem(Vanilla.CRIMSON_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.DARK_OAK.getId().withPrefixedPath("block/"),Blocks.DARK_OAK_PLANKS).includeWithoutItem(Vanilla.DARK_OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.JUNGLE.getId().withPrefixedPath("block/"),Blocks.JUNGLE_PLANKS).includeWithoutItem(Vanilla.JUNGLE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.MANGROVE.getId().withPrefixedPath("block/"),Blocks.MANGROVE_PLANKS).includeWithoutItem(Vanilla.MANGROVE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.OAK.getId().withPrefixedPath("block/"),Blocks.OAK_PLANKS).includeWithoutItem(Vanilla.OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.SPRUCE.getId().withPrefixedPath("block/"),Blocks.SPRUCE_PLANKS).includeWithoutItem(Vanilla.SPRUCE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.WARPED.getId().withPrefixedPath("block/"),Blocks.WARPED_PLANKS).includeWithoutItem(Vanilla.WARPED_CHEST);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}