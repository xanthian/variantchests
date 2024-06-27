package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class LangFileGenerator extends FabricLanguageProvider {

    public LangFileGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();

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
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        registerTranslations(translationBuilder, Vanilla.VANILLA_CHESTS);
        registerContainerTranslations(translationBuilder, Vanilla.VANILLA_CHESTS);


        //translationBuilder.add(AdAstra.AA_GLACIAN_CHEST, "Glacian Chest");
        //translationBuilder.add(BeachParty.LDBP_PALM_CHEST, "Palm Chest");
        //translationBuilder.add(BetterArcheology.BA_ROTTEN_CHEST, "Rotten Chest");
        //registerTranslations(translationBuilder, BiomeMakeover.BM_CHESTS);
        //registerTranslations(translationBuilder, Cinderscapes.CS_CHESTS);
        //translationBuilder.add(DeeperAndDarker.DAD_ECHO_CHEST, "Echo Chest");
        //translationBuilder.add(Desolation.DS_CHARRED_CHEST, "Charred Chest");
        //registerTranslations(translationBuilder, Ecologics.ECO_CHESTS);
        //translationBuilder.add(MineCells.MC_PUTRID_CHEST, "Putrid Chest");
        //registerTranslations(translationBuilder, NaturesSpirit.NS_CHESTS);
        //registerTranslations(translationBuilder, Promenade.PROM_CHESTS);
        //translationBuilder.add(SnifferPlus.SP_STONE_PINE_CHEST, "Stone Pine Chest");
        //translationBuilder.add(TechReborn.TR_RUBBER_CHEST, "Rubber Chest");
        //translationBuilder.add(Vinery.LDV_CHERRY_CHEST, "Cherry Chest");
        //registerTranslations(translationBuilder, RegionsUnexplored.RU_CHESTS);

        translationBuilder.add("container.variantchests.aa_glacian_chest", "Glacian Chest");
        translationBuilder.add("container.variantchests.ldbp_palm_chest", "Palm Chest");
        translationBuilder.add("container.variantchests.ba_rotten_chest", "Rotten Chest");
        //registerContainerTranslations(translationBuilder, BiomeMakeover.BM_CHESTS);
        //registerContainerTranslations(translationBuilder, Cinderscapes.CS_CHESTS);
        translationBuilder.add("container.variantchests.dad_echo_chest", "Echo Chest");
        translationBuilder.add("container.variantchests.ds_charred_chest", "Charred Chest");
        //registerContainerTranslations(translationBuilder, Ecologics.ECO_CHESTS);
        translationBuilder.add("container.variantchests.mc_putrid_chest", "Putrid Chest");
        //registerContainerTranslations(translationBuilder, NaturesSpirit.NS_CHESTS);
        //registerContainerTranslations(translationBuilder, Promenade.PROM_CHESTS);
        translationBuilder.add("container.variantchests.sp_stone_pine_chest", "Stone Pine Chest");
        translationBuilder.add("container.variantchests.tr_rubber_chest", "Rubber Chest");
        translationBuilder.add("container.variantchests.ldv_cherry_chest", "Cherry Chest");
        //registerContainerTranslations(translationBuilder, RegionsUnexplored.RU_CHESTS);
    }
}