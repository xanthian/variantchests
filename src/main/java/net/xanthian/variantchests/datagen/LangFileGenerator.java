package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;
import net.xanthian.variantchests.block.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        //Vanilla
        translationBuilder.add(Vanilla.ACACIA_CHEST, "Acacia Chest");
        translationBuilder.add(Vanilla.BAMBOO_CHEST, "Bamboo Chest");
        translationBuilder.add(Vanilla.BIRCH_CHEST, "Birch Chest");
        translationBuilder.add(Vanilla.CHERRY_CHEST, "Cherry Chest");
        translationBuilder.add(Vanilla.CRIMSON_CHEST, "Crimson Chest");
        translationBuilder.add(Vanilla.DARK_OAK_CHEST, "Dark Oak Chest");
        translationBuilder.add(Vanilla.JUNGLE_CHEST, "Jungle Chest");
        translationBuilder.add(Vanilla.MANGROVE_CHEST, "Mangrove Chest");
        translationBuilder.add(Vanilla.OAK_CHEST, "Oak Chest");
        translationBuilder.add(Blocks.CHEST, "Oak Chest");
        translationBuilder.add(Vanilla.SPRUCE_CHEST, "Spruce Chest");
        translationBuilder.add(Vanilla.WARPED_CHEST, "Warped Chest");

        translationBuilder.add("container.variantchests.acacia_chest", "Acacia Chest");
        translationBuilder.add("container.variantchests.bamboo_chest", "Bamboo Chest");
        translationBuilder.add("container.variantchests.birch_chest", "Birch Chest");
        translationBuilder.add("container.variantchests.cherry_chest", "Cherry Chest");
        translationBuilder.add("container.variantchests.crimson_chest", "Crimson Chest");
        translationBuilder.add("container.variantchests.dark_oak_chest", "Dark Oak Chest");
        translationBuilder.add("container.variantchests.jungle_chest", "Jungle Chest");
        translationBuilder.add("container.variantchests.mangrove_chest", "Mangrove Chest");
        translationBuilder.add("container.variantchests.oak_chest", "Oak Chest");
        translationBuilder.add("container.chest", "Oak Chest");
        translationBuilder.add("container.variantchests.spruce_chest", "Spruce Chest");
        translationBuilder.add("container.variantchests.warped_chest", "Warped Chest");

        translationBuilder.add("variantchests.itemgroup", "Variant Chests");
    }
}