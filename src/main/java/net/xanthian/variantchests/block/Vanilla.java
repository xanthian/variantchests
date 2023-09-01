package net.xanthian.variantchests.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantchests.Initialise;

public class Vanilla {

    public static final Block ACACIA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ACACIA);
    //public static final Block BAMBOO_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BAMBOO);
    public static final Block BIRCH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BIRCH);
    //public static final Block CHERRY_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.CHERRY);
    public static final Block CRIMSON_CHEST = new VariantChestBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.CRIMSON);
    public static final Block DARK_OAK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.DARK_OAK);
    public static final Block JUNGLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.JUNGLE);
    public static final Block MANGROVE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.MANGROVE);
    public static final Block OAK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.OAK);
    public static final Block SPRUCE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.SPRUCE);
    public static final Block WARPED_CHEST = new VariantChestBlock(FabricBlockSettings.of(Material.WOOD).mapColor(MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.WARPED);

    public static void registerVanillaChests() {
        registerChestBlock(VariantChests.ACACIA.getId(), ACACIA_CHEST);
        //registerChestBlock(VariantChests.BAMBOO.getId(), BAMBOO_CHEST);
        registerChestBlock(VariantChests.BIRCH.getId(), BIRCH_CHEST);
        //registerChestBlock(VariantChests.CHERRY.getId(), CHERRY_CHEST);
        registerChestBlock(VariantChests.CRIMSON.getId(), CRIMSON_CHEST);
        registerChestBlock(VariantChests.DARK_OAK.getId(), DARK_OAK_CHEST);
        registerChestBlock(VariantChests.JUNGLE.getId(), JUNGLE_CHEST);
        registerChestBlock(VariantChests.MANGROVE.getId(), MANGROVE_CHEST);
        registerChestBlock(VariantChests.OAK.getId(), OAK_CHEST);
        registerChestBlock(VariantChests.SPRUCE.getId(), SPRUCE_CHEST);
        registerChestBlock(VariantChests.WARPED.getId(), WARPED_CHEST);
    }

    private static void registerChestBlock(Identifier Id, Block block) {
        Identifier identifier = new Identifier(Id.toString());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANTCHESTS)));
    }
}