package net.xanthian.variantchests.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.VariantChestBlock;
import net.xanthian.variantchests.block.VariantChests;

import java.util.Map;

public class RegionsUnexplored {

    public static Map<Identifier, Block> RU_CHESTS = Maps.newHashMap();

    public static Block RU_ALPHA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_ALPHA);
    public static Block RU_BAOBAB_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BAOBAB);
    public static Block RU_BLACK_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BLACK_PAINTED);
    public static Block RU_BLACKWOOD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BLACKWOOD);
    public static Block RU_BLUE_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BLUE_PAINTED);
    public static Block RU_BROWN_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BROWN_PAINTED);
    public static Block RU_CYAN_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_CYAN_PAINTED);
    public static Block RU_CYPRESS_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_CYPRESS);
    public static Block RU_DEAD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_DEAD);
    public static Block RU_EUCALYPTUS_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_EUCALYPTUS);
    public static Block RU_GRAY_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_GRAY_PAINTED);
    public static Block RU_GREEN_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_GREEN_PAINTED);
    public static Block RU_JOSHUA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_JOSHUA);
    public static Block RU_LARCH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_LARCH);
    public static Block RU_LIGHT_BLUE_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_LIGHT_BLUE_PAINTED);
    public static Block RU_LIGHT_GRAY_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_LIGHT_GRAY_PAINTED);
    public static Block RU_LIME_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_LIME_PAINTED);
    public static Block RU_MAGENTA_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_MAGENTA_PAINTED);
    public static Block RU_MAPLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_MAPLE);
    public static Block RU_MAUVE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_MAUVE);
    public static Block RU_ORANGE_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_ORANGE_PAINTED);
    public static Block RU_PALM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_PALM);
    public static Block RU_PINE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_PINE);
    public static Block RU_PINK_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_PINK_PAINTED);
    public static Block RU_PURPLE_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_PURPLE_PAINTED);
    public static Block RU_REDWOOD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_REDWOOD);
    public static Block RU_RED_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_RED_PAINTED);
    public static Block RU_WHITE_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_WHITE_PAINTED);
    public static Block RU_WILLOW_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_WILLOW);
    public static Block RU_YELLOW_PAINTED_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_YELLOW_PAINTED);
    public static Block RU_CHERRY_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_CHERRY);
    public static Block RU_SCULKWOOD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_SCULKWOOD);
    public static Block RU_BLUE_BIOSHROOM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BLUE_BIOSHROOM);
    public static Block RU_BRIMWOOD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_BRIMWOOD);
    public static Block RU_COBALT_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_COBALT);
    public static Block RU_GREEN_BIOSHROOM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_GREEN_BIOSHROOM);
    public static Block RU_KAPOK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_KAPOK);
    public static Block RU_MAGNOLIA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_MAGNOLIA);
    public static Block RU_PINK_BIOSHROOM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_PINK_BIOSHROOM);
    public static Block RU_SOCOTRA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_SOCOTRA);
    public static Block RU_YELLOW_BIOSHROOM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.RU_YELLOW_BIOSHROOM);

    public static void registerChests() {
        registerChests("ru_alpha_chest", RU_ALPHA_CHEST);
        registerChests("ru_baobab_chest", RU_BAOBAB_CHEST);
        registerChests("ru_black_painted_chest", RU_BLACK_PAINTED_CHEST);
        registerChests("ru_blackwood_chest", RU_BLACKWOOD_CHEST);
        registerChests("ru_blue_painted_chest", RU_BLUE_PAINTED_CHEST);
        registerChests("ru_brown_painted_chest", RU_BROWN_PAINTED_CHEST);
        registerChests("ru_cyan_painted_chest", RU_CYAN_PAINTED_CHEST);
        registerChests("ru_cypress_chest", RU_CYPRESS_CHEST);
        registerChests("ru_dead_chest", RU_DEAD_CHEST);
        registerChests("ru_eucalyptus_chest", RU_EUCALYPTUS_CHEST);
        registerChests("ru_green_painted_chest", RU_GREEN_PAINTED_CHEST);
        registerChests("ru_gray_painted_chest", RU_GRAY_PAINTED_CHEST);
        registerChests("ru_joshua_chest", RU_JOSHUA_CHEST);
        registerChests("ru_larch_chest", RU_LARCH_CHEST);
        registerChests("ru_light_blue_painted_chest", RU_LIGHT_BLUE_PAINTED_CHEST);
        registerChests("ru_light_gray_painted_chest", RU_LIGHT_GRAY_PAINTED_CHEST);
        registerChests("ru_lime_painted_chest", RU_LIME_PAINTED_CHEST);
        registerChests("ru_magenta_painted_chest", RU_MAGENTA_PAINTED_CHEST);
        registerChests("ru_maple_chest", RU_MAPLE_CHEST);
        registerChests("ru_mauve_chest", RU_MAUVE_CHEST);
        registerChests("ru_orange_painted_chest", RU_ORANGE_PAINTED_CHEST);
        registerChests("ru_palm_chest", RU_PALM_CHEST);
        registerChests("ru_pine_chest", RU_PINE_CHEST);
        registerChests("ru_pink_painted_chest", RU_PINK_PAINTED_CHEST);
        registerChests("ru_purple_painted_chest", RU_PURPLE_PAINTED_CHEST);
        registerChests("ru_red_painted_chest", RU_RED_PAINTED_CHEST);
        registerChests("ru_redwood_chest", RU_REDWOOD_CHEST);
        registerChests("ru_white_painted_chest", RU_WHITE_PAINTED_CHEST);
        registerChests("ru_willow_chest", RU_WILLOW_CHEST);
        registerChests("ru_yellow_painted_chest", RU_YELLOW_PAINTED_CHEST);

        registerChests("ru_cherry_chest", RU_CHERRY_CHEST);
        registerChests("ru_sculkwood_chest", RU_SCULKWOOD_CHEST);

        registerChests("ru_blue_bioshroom_chest", RU_BLUE_BIOSHROOM_CHEST);
        registerChests("ru_brimwood_chest", RU_BRIMWOOD_CHEST);
        registerChests("ru_cobalt_chest", RU_COBALT_CHEST);
        registerChests("ru_green_bioshroom_chest", RU_GREEN_BIOSHROOM_CHEST);
        registerChests("ru_kapok_chest", RU_KAPOK_CHEST);
        registerChests("ru_magnolia_chest", RU_MAGNOLIA_CHEST);
        registerChests("ru_pink_bioshroom_chest", RU_PINK_BIOSHROOM_CHEST);
        registerChests("ru_socotra_chest", RU_SOCOTRA_CHEST);
        registerChests("ru_yellow_bioshroom_chest", RU_YELLOW_BIOSHROOM_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        RU_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }

}