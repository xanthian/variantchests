package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.TextureMap;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.VariantChests;
import net.xanthian.variantchests.block.compatability.*;
import net.xanthian.variantchests.util.ModModel;
import net.xanthian.variantchests.util.ModTextureKey;

import java.util.Map;
import java.util.function.Function;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    public static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("chest/");
    }

    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap, String modId, Function<String, String> modelPathGenerator) {
        for (Block chest : blockMap.values()) {
            String blockName = chest.getTranslationKey();
            int firstUnderscoreIndex = blockName.indexOf('_');
            if (firstUnderscoreIndex != -1) {
                String plankName = blockName.substring(firstUnderscoreIndex + 1, blockName.lastIndexOf("_chest"));
                String modelPath = modId + ":block/" + modelPathGenerator.apply(plankName);
                blockStateModelGenerator.registerBuiltinWithParticle(chest, new Identifier(modelPath));
            } else {
                System.out.println("Invalid block name format: " + blockName);
            }
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerBuiltin(VariantChests.ACACIA.getId().withPrefixedPath("block/"), Blocks.ACACIA_PLANKS).includeWithoutItem(Vanilla.ACACIA_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BAMBOO.getId().withPrefixedPath("block/"), Blocks.BAMBOO_PLANKS).includeWithoutItem(Vanilla.BAMBOO_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BIRCH.getId().withPrefixedPath("block/"), Blocks.BIRCH_PLANKS).includeWithoutItem(Vanilla.BIRCH_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.CHERRY.getId().withPrefixedPath("block/"), Blocks.CHERRY_PLANKS).includeWithoutItem(Vanilla.CHERRY_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.CRIMSON.getId().withPrefixedPath("block/"), Blocks.CRIMSON_PLANKS).includeWithoutItem(Vanilla.CRIMSON_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.DARK_OAK.getId().withPrefixedPath("block/"), Blocks.DARK_OAK_PLANKS).includeWithoutItem(Vanilla.DARK_OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.JUNGLE.getId().withPrefixedPath("block/"), Blocks.JUNGLE_PLANKS).includeWithoutItem(Vanilla.JUNGLE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.MANGROVE.getId().withPrefixedPath("block/"), Blocks.MANGROVE_PLANKS).includeWithoutItem(Vanilla.MANGROVE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.SPRUCE.getId().withPrefixedPath("block/"), Blocks.SPRUCE_PLANKS).includeWithoutItem(Vanilla.SPRUCE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.WARPED.getId().withPrefixedPath("block/"), Blocks.WARPED_PLANKS).includeWithoutItem(Vanilla.WARPED_CHEST);

        registerModel(blockStateModelGenerator, AdAstra.AA_CHESTS, "ad_astra", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BeachParty.LDBP_CHESTS, "beachparty", plankName -> plankName + "_planks0");
        registerModel(blockStateModelGenerator, BetterArcheology.BA_CHESTS, "betterarcheology", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_CHESTS, "biomemakeover", plankName -> plankName + "_planks");
        //registerModel(blockStateModelGenerator, Blockus.BLS_CHESTS, "blockus", plankName -> plankName + "_planks");
        //registerModel(blockStateModelGenerator, Botania.BOT_CHESTS, "botania", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Cinderscapes.CS_CHESTS, "cinderscapes", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_CHESTS, "deeperdarker", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Desolation.DS_CHESTS, "desolation", plankName -> plankName + "_planks");
        //registerModel(blockStateModelGenerator, EldritchEnd.EE_CHESTS, "eldritch_end", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Ecologics.ECO_CHESTS, "ecologics", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, MineCells.MC_CHESTS, "minecells", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_CHESTS, "natures_spirit", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Promenade.PROM_CHESTS, "promenade", plankName -> plankName + "/planks");
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_CHESTS, "regions_unexplored", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, SnifferPlus.SP_CHESTS, "snifferplus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, TechReborn.TR_CHESTS, "techreborn", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Vinery.LDV_CHESTS, "vinery", plankName -> plankName + "_planks");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        chestItem(itemModelGenerator, Vanilla.ACACIA_CHEST);
        chestItem(itemModelGenerator, Vanilla.BAMBOO_CHEST);
        chestItem(itemModelGenerator, Vanilla.BIRCH_CHEST);
        chestItem(itemModelGenerator, Vanilla.CHERRY_CHEST);
        chestItem(itemModelGenerator, Vanilla.CRIMSON_CHEST);
        chestItem(itemModelGenerator, Vanilla.DARK_OAK_CHEST);
        chestItem(itemModelGenerator, Vanilla.JUNGLE_CHEST);
        chestItem(itemModelGenerator, Vanilla.MANGROVE_CHEST);
        chestItem(itemModelGenerator, Vanilla.SPRUCE_CHEST);
        chestItem(itemModelGenerator, Vanilla.WARPED_CHEST);

        chestItem(itemModelGenerator, AdAstra.AA_GLACIAN_CHEST);
        chestItem(itemModelGenerator, BeachParty.LDBP_PALM_CHEST);
        chestItem(itemModelGenerator, BetterArcheology.BA_ROTTEN_CHEST);
        for (Block block : BiomeMakeover.BM_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        for (Block block : Cinderscapes.CS_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        chestItem(itemModelGenerator, DeeperAndDarker.DAD_ECHO_CHEST);
        chestItem(itemModelGenerator, Desolation.DS_CHARRED_CHEST);
        for (Block block : Ecologics.ECO_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        chestItem(itemModelGenerator, MineCells.MC_PUTRID_CHEST);
        for (Block block : NaturesSpirit.NS_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        for (Block block : Promenade.PROM_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        for (Block block : RegionsUnexplored.RU_CHESTS.values()) {
            chestItem(itemModelGenerator, block);
        }
        chestItem(itemModelGenerator, SnifferPlus.SP_STONE_PINE_CHEST);
        chestItem(itemModelGenerator, TechReborn.TR_RUBBER_CHEST);
        chestItem(itemModelGenerator, Vinery.LDV_CHERRY_CHEST);

    }

    public final void chestItem(ItemModelGenerator itemModelGenerator, Block block) {
        TextureMap textureMap = new TextureMap().put(ModTextureKey.CHEST, getId(block));
        ModModel.CHEST.upload(ModelIds.getItemModelId(block.asItem()), textureMap, itemModelGenerator.writer);
    }
}