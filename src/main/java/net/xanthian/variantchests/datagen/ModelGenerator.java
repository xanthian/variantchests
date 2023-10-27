package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.VariantChests;
import net.xanthian.variantchests.block.compatability.*;
import net.xanthian.variantchests.util.ModModel;
import net.xanthian.variantchests.util.ModTextureKey;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
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
        blockStateModelGenerator.registerBuiltin(VariantChests.OAK.getId().withPrefixedPath("block/"), Blocks.OAK_PLANKS).includeWithoutItem(Vanilla.OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.SPRUCE.getId().withPrefixedPath("block/"), Blocks.SPRUCE_PLANKS).includeWithoutItem(Vanilla.SPRUCE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.WARPED.getId().withPrefixedPath("block/"), Blocks.WARPED_PLANKS).includeWithoutItem(Vanilla.WARPED_CHEST);

        // Compatability
        blockStateModelGenerator.registerBuiltinWithParticle(AdAstra.AA_GLACIAN_CHEST, new Identifier("ad_astra:block/glacian_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(BeachParty.LDBP_PALM_CHEST, new Identifier("beachparty:block/palm_planks0"));
        blockStateModelGenerator.registerBuiltinWithParticle(BetterArcheology.BA_ROTTEN_CHEST, new Identifier("betterarcheology:block/rotten_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(DeeperAndDarker.DAD_ECHO_CHEST, new Identifier("deeperdarker:block/echo_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(MineCells.MC_PUTRID_CHEST, new Identifier("minecells:block/putrid_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(SnifferPlus.SP_STONE_PINE_CHEST, new Identifier("snifferplus:block/stone_pine_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(TechReborn.TR_RUBBER_CHEST, new Identifier("techreborn:block/rubber_planks"));
        blockStateModelGenerator.registerBuiltinWithParticle(Vinery.LDV_CHERRY_CHEST, new Identifier("vinery:block/cherry_planks"));
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
        chestItem(itemModelGenerator, Vanilla.OAK_CHEST);
        chestItem(itemModelGenerator, Vanilla.SPRUCE_CHEST);
        chestItem(itemModelGenerator, Vanilla.WARPED_CHEST);

        chestItem(itemModelGenerator, AdAstra.AA_GLACIAN_CHEST);
        chestItem(itemModelGenerator, BeachParty.LDBP_PALM_CHEST);
        chestItem(itemModelGenerator, BetterArcheology.BA_ROTTEN_CHEST);
        chestItem(itemModelGenerator, DeeperAndDarker.DAD_ECHO_CHEST);
        chestItem(itemModelGenerator, MineCells.MC_PUTRID_CHEST);
        chestItem(itemModelGenerator, SnifferPlus.SP_STONE_PINE_CHEST);
        chestItem(itemModelGenerator, TechReborn.TR_RUBBER_CHEST);
        chestItem(itemModelGenerator, Vinery.LDV_CHERRY_CHEST);

    }

    public final void chestItem(ItemModelGenerator itemModelGenerator, Block block) {
        TextureMap textureMap = new TextureMap().put(ModTextureKey.CHEST, getId(block));
        ModModel.CHEST.upload(ModelIds.getItemModelId(block.asItem()), textureMap, itemModelGenerator.writer);
    }

    public static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("chest/");
    }
}