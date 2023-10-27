package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantchests.block.*;
import net.xanthian.variantchests.block.compatability.*;

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
        // Compatability
        translationBuilder.add(AdAstra.AA_GLACIAN_CHEST, "Glacian Chest");
        translationBuilder.add(BeachParty.LDBP_PALM_CHEST, "Palm Chest");
        translationBuilder.add(BetterArcheology.BA_ROTTEN_CHEST, "Rotten Chest");
        translationBuilder.add(DeeperAndDarker.DAD_ECHO_CHEST, "Echo Chest");
        translationBuilder.add(MineCells.MC_PUTRID_CHEST, "Putrid Chest");
        translationBuilder.add(SnifferPlus.SP_STONE_PINE_CHEST, "Stone Pine Chest");
        translationBuilder.add(TechReborn.TR_RUBBER_CHEST, "Rubber Chest");
        translationBuilder.add(Vinery.LDV_CHERRY_CHEST, "Cherry Chest");

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
        // Compatability
        translationBuilder.add("container.variantchests.aa_glacian_chest", "Glacian Chest");
        translationBuilder.add("container.variantchests.ldbp_palm_chest", "Palm Chest");
        translationBuilder.add("container.variantchests.ba_rotten_chest", "Rotten Chest");
        translationBuilder.add("container.variantchests.dad_echo_chest", "Echo Chest");
        translationBuilder.add("container.variantchests.mc_putrid_chest", "Putrid Chest");
        translationBuilder.add("container.variantchests.sp_stone_pine_chest", "Stone Pine Chest");
        translationBuilder.add("container.variantchests.tr_rubber_chest", "Rubber Chest");
        translationBuilder.add("container.variantchests.ldv_cherry_chest", "Cherry Chest");
        
        translationBuilder.add("variantchests.itemgroup", "Variant Chests");
    }
}