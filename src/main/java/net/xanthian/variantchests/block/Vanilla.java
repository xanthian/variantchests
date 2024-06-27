package net.xanthian.variantchests.block;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.Initialise;

import java.util.Map;

public class Vanilla {

    public static final Block ACACIA_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.ACACIA);
    public static final Block BAMBOO_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.BAMBOO);
    public static final Block BIRCH_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.BIRCH);
    public static final Block CHERRY_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.CHERRY);
    public static final Block CRIMSON_CHEST = new VariantChestBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.CRIMSON);
    public static final Block DARK_OAK_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.DARK_OAK);
    public static final Block JUNGLE_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.JUNGLE);
    public static final Block MANGROVE_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.MANGROVE);
    public static final Block OAK_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.OAK);
    public static final Block SPRUCE_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.SPRUCE);
    public static final Block WARPED_CHEST = new VariantChestBlock(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.WARPED);
    public static Map<Identifier, Block> VANILLA_CHESTS = Maps.newHashMap();

    public static void registerVanillaChests() {
        registerChests("acacia_chest", ACACIA_CHEST);
        registerChests("bamboo_chest", BAMBOO_CHEST);
        registerChests("birch_chest", BIRCH_CHEST);
        registerChests("cherry_chest", CHERRY_CHEST);
        registerChests("crimson_chest", CRIMSON_CHEST);
        registerChests("dark_oak_chest", DARK_OAK_CHEST);
        registerChests("jungle_chest", JUNGLE_CHEST);
        registerChests("mangrove_chest", MANGROVE_CHEST);
        registerChests("oak_chest", OAK_CHEST);
        registerChests("spruce_chest", SPRUCE_CHEST);
        registerChests("warped_chest", WARPED_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        VANILLA_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
    }
}