package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    public static String generateContainerDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    private static void registerContainerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block.getTranslationKey().replace("block", "container"), generateBlockDisplayName(block));
        }
    }


    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        registerTranslations(translationBuilder, Vanilla.VANILLA_CHESTS);
        translationBuilder.add(Blocks.CHEST, "Oak Chest");
        translationBuilder.add("container.variantchests.acacia_chest", "Acacia Chest");
        translationBuilder.add("container.variantchests.bamboo_chest", "Bamboo Chest");
        translationBuilder.add("container.variantchests.birch_chest", "Birch Chest");
        translationBuilder.add("container.variantchests.cherry_chest", "Cherry Chest");
        translationBuilder.add("container.variantchests.crimson_chest", "Crimson Chest");
        translationBuilder.add("container.variantchests.dark_oak_chest", "Dark Oak Chest");
        translationBuilder.add("container.variantchests.jungle_chest", "Jungle Chest");
        translationBuilder.add("container.variantchests.mangrove_chest", "Mangrove Chest");
        translationBuilder.add("container.chest", "Oak Chest");
        translationBuilder.add("container.variantchests.spruce_chest", "Spruce Chest");
        translationBuilder.add("container.variantchests.warped_chest", "Warped Chest");

        translationBuilder.add(AdAstra.AA_GLACIAN_CHEST, "Glacian Chest");
        translationBuilder.add(BeachParty.LDBP_PALM_CHEST, "Palm Chest");
        translationBuilder.add(BetterArcheology.BA_ROTTEN_CHEST, "Rotten Chest");
        registerTranslations(translationBuilder, Cinderscapes.CS_CHESTS);
        translationBuilder.add(DeeperAndDarker.DAD_ECHO_CHEST, "Echo Chest");
        translationBuilder.add(Desolation.DS_CHARRED_CHEST, "Charred Chest");
        translationBuilder.add(MineCells.MC_PUTRID_CHEST, "Putrid Chest");
        translationBuilder.add(SnifferPlus.SP_STONE_PINE_CHEST, "Stone Pine Chest");
        translationBuilder.add(TechReborn.TR_RUBBER_CHEST, "Rubber Chest");
        translationBuilder.add(Vinery.LDV_CHERRY_CHEST, "Cherry Chest");
        registerTranslations(translationBuilder, RegionsUnexplored.RU_CHESTS);

        translationBuilder.add("container.variantchests.aa_glacian_chest", "Glacian Chest");
        translationBuilder.add("container.variantchests.ldbp_palm_chest", "Palm Chest");
        translationBuilder.add("container.variantchests.ba_rotten_chest", "Rotten Chest");
        registerContainerTranslations(translationBuilder, Cinderscapes.CS_CHESTS);
        translationBuilder.add("container.variantchests.dad_echo_chest", "Echo Chest");
        translationBuilder.add("container.variantchests.ds_charred_chest", "Charred Chest");
        translationBuilder.add("container.variantchests.mc_putrid_chest", "Putrid Chest");
        translationBuilder.add("container.variantchests.sp_stone_pine_chest", "Stone Pine Chest");
        translationBuilder.add("container.variantchests.tr_rubber_chest", "Rubber Chest");
        translationBuilder.add("container.variantchests.ldv_cherry_chest", "Cherry Chest");
        registerContainerTranslations(translationBuilder, RegionsUnexplored.RU_CHESTS);
    }
}