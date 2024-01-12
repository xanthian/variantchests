package net.xanthian.variantchests.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.VariantChests;
import net.xanthian.variantchests.block.compatability.*;

public class EntityInitialise {

    public static BlockEntityType<VariantChestBlockEntity> ACACIA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BAMBOO_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BIRCH_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> SPRUCE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CHERRY_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CRIMSON_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> DARK_OAK_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> JUNGLE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> MANGROVE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> WARPED_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> AA_GLACIAN_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> LDBP_PALM_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BA_ROTTEN_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CS_SCORCHED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CS_UMBRAL_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> DAD_ECHO_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> DS_CHARRED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> MC_PUTRID_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> NS_ASPEN_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_CEDAR_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_COCONUT_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_CYPRESS_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_FIR_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_GHAF_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_JOSHUA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_LARCH_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_MAPLE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_OLIVE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_PALO_VERDE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_REDWOOD_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_SUGI_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_WILLOW_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> NS_WISTERIA_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> RU_ALPHA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BAOBAB_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BLACK_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BLACKWOOD_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BLUE_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BROWN_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_CYAN_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_CYPRESS_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_DEAD_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_EUCALYPTUS_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_GRAY_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_GREEN_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_JOSHUA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_LARCH_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_LIGHT_BLUE_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_LIGHT_GRAY_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_LIME_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_MAGENTA_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_MAPLE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_MAUVE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_ORANGE_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_PALM_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_PINE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_PINK_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_PURPLE_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_REDWOOD_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_RED_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_WHITE_PAINTED_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_WILLOW_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_YELLOW_PAINTED_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> RU_CHERRY_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_SCULKWOOD_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> RU_BLUE_BIOSHROOM_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_BRIMWOOD_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_COBALT_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_GREEN_BIOSHROOM_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_KAPOK_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_MAGNOLIA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_PINK_BIOSHROOM_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_SOCOTRA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> RU_YELLOW_BIOSHROOM_CHEST;

    public static BlockEntityType<VariantChestBlockEntity> SP_STONE_PINE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> TR_RUBBER_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> LDV_CHERRY_CHEST;

    public static void registerBlockEntities() {
        ACACIA_CHEST = register(VariantChests.ACACIA, Vanilla.ACACIA_CHEST);
        BAMBOO_CHEST = register(VariantChests.BAMBOO, Vanilla.BAMBOO_CHEST);
        BIRCH_CHEST = register(VariantChests.BIRCH, Vanilla.BIRCH_CHEST);
        CHERRY_CHEST = register(VariantChests.CHERRY, Vanilla.CHERRY_CHEST);
        CRIMSON_CHEST = register(VariantChests.CRIMSON, Vanilla.CRIMSON_CHEST);
        DARK_OAK_CHEST = register(VariantChests.DARK_OAK, Vanilla.DARK_OAK_CHEST);
        JUNGLE_CHEST = register(VariantChests.JUNGLE, Vanilla.JUNGLE_CHEST);
        MANGROVE_CHEST = register(VariantChests.MANGROVE, Vanilla.MANGROVE_CHEST);
        SPRUCE_CHEST = register(VariantChests.SPRUCE, Vanilla.SPRUCE_CHEST);
        WARPED_CHEST = register(VariantChests.WARPED, Vanilla.WARPED_CHEST);
    }

    public static void registerAABlockEntities() {
        AA_GLACIAN_CHEST = register(VariantChests.AA_GLACIAN, AdAstra.AA_GLACIAN_CHEST);
    }

    public static void registerLDBPBlockEntities() {
        LDBP_PALM_CHEST = register(VariantChests.LDBP_PALM, BeachParty.LDBP_PALM_CHEST);
    }

    public static void registerBABlockEntities() {
        BA_ROTTEN_CHEST = register(VariantChests.BA_ROTTEN, BetterArcheology.BA_ROTTEN_CHEST);
    }

    public static void registerCSBlockEntities() {
        CS_SCORCHED_CHEST = register(VariantChests.CS_SCORCHED, Cinderscapes.CS_SCORCHED_CHEST);
        CS_UMBRAL_CHEST = register(VariantChests.CS_UMBRAL, Cinderscapes.CS_UMBRAL_CHEST);
    }

    public static void registerDADBlockEntities() {
        DAD_ECHO_CHEST = register(VariantChests.DAD_ECHO, DeeperAndDarker.DAD_ECHO_CHEST);
    }

    public static void registerDSBlockEntities() {
        DS_CHARRED_CHEST = register(VariantChests.DS_CHARRED, Desolation.DS_CHARRED_CHEST);
    }

    public static void registerMCBlockEntities() {
        MC_PUTRID_CHEST = register(VariantChests.MC_PUTRID, MineCells.MC_PUTRID_CHEST);
    }

    public static void registerNSBlockEntities() {
        NS_ASPEN_CHEST = register(VariantChests.NS_ASPEN, NaturesSpirit.NS_ASPEN_CHEST);
        NS_CEDAR_CHEST = register(VariantChests.NS_CEDAR, NaturesSpirit.NS_CEDAR_CHEST);
        NS_COCONUT_CHEST = register(VariantChests.NS_COCONUT, NaturesSpirit.NS_COCONUT_CHEST);
        NS_CYPRESS_CHEST = register(VariantChests.NS_CYPRESS, NaturesSpirit.NS_CYPRESS_CHEST);
        NS_FIR_CHEST = register(VariantChests.NS_FIR, NaturesSpirit.NS_FIR_CHEST);
        NS_GHAF_CHEST = register(VariantChests.NS_GHAF, NaturesSpirit.NS_GHAF_CHEST);
        NS_JOSHUA_CHEST = register(VariantChests.NS_JOSHUA, NaturesSpirit.NS_JOSHUA_CHEST);
        NS_LARCH_CHEST = register(VariantChests.NS_LARCH, NaturesSpirit.NS_LARCH_CHEST);
        NS_MAPLE_CHEST = register(VariantChests.NS_MAPLE, NaturesSpirit.NS_MAPLE_CHEST);
        NS_OLIVE_CHEST = register(VariantChests.NS_OLIVE, NaturesSpirit.NS_OLIVE_CHEST);
        NS_PALO_VERDE_CHEST = register(VariantChests.NS_PALO_VERDE, NaturesSpirit.NS_PALO_VERDE_CHEST);
        NS_REDWOOD_CHEST = register(VariantChests.NS_REDWOOD, NaturesSpirit.NS_REDWOOD_CHEST);
        NS_SUGI_CHEST = register(VariantChests.NS_SUGI, NaturesSpirit.NS_SUGI_CHEST);
        NS_WILLOW_CHEST = register(VariantChests.NS_WILLOW, NaturesSpirit.NS_WILLOW_CHEST);
        NS_WISTERIA_CHEST = register(VariantChests.NS_WISTERIA, NaturesSpirit.NS_WISTERIA_CHEST);
    }

    public static void registerRUBlockEntities() {
        RU_ALPHA_CHEST = register(VariantChests.RU_ALPHA, RegionsUnexplored.RU_ALPHA_CHEST);
        RU_BAOBAB_CHEST = register(VariantChests.RU_BAOBAB, RegionsUnexplored.RU_BAOBAB_CHEST);
        RU_BLACK_PAINTED_CHEST = register(VariantChests.RU_BLACK_PAINTED, RegionsUnexplored.RU_BLACK_PAINTED_CHEST);
        RU_BLACKWOOD_CHEST = register(VariantChests.RU_BLACKWOOD, RegionsUnexplored.RU_BLACKWOOD_CHEST);
        RU_BLUE_PAINTED_CHEST = register(VariantChests.RU_BLUE_PAINTED, RegionsUnexplored.RU_BLUE_PAINTED_CHEST);
        RU_BROWN_PAINTED_CHEST = register(VariantChests.RU_BROWN_PAINTED, RegionsUnexplored.RU_BROWN_PAINTED_CHEST);
        RU_CYAN_PAINTED_CHEST = register(VariantChests.RU_CYAN_PAINTED, RegionsUnexplored.RU_CYAN_PAINTED_CHEST);
        RU_CYPRESS_CHEST = register(VariantChests.RU_CYPRESS, RegionsUnexplored.RU_CYPRESS_CHEST);
        RU_DEAD_CHEST = register(VariantChests.RU_DEAD, RegionsUnexplored.RU_DEAD_CHEST);
        RU_EUCALYPTUS_CHEST = register(VariantChests.RU_EUCALYPTUS, RegionsUnexplored.RU_EUCALYPTUS_CHEST);
        RU_GRAY_PAINTED_CHEST = register(VariantChests.RU_GRAY_PAINTED, RegionsUnexplored.RU_GRAY_PAINTED_CHEST);
        RU_GREEN_PAINTED_CHEST = register(VariantChests.RU_GREEN_PAINTED, RegionsUnexplored.RU_GREEN_PAINTED_CHEST);
        RU_JOSHUA_CHEST = register(VariantChests.RU_JOSHUA, RegionsUnexplored.RU_JOSHUA_CHEST);
        RU_LARCH_CHEST = register(VariantChests.RU_LARCH, RegionsUnexplored.RU_LARCH_CHEST);
        RU_LIGHT_BLUE_PAINTED_CHEST = register(VariantChests.RU_LIGHT_BLUE_PAINTED, RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_CHEST);
        RU_LIGHT_GRAY_PAINTED_CHEST = register(VariantChests.RU_LIGHT_GRAY_PAINTED, RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_CHEST);
        RU_LIME_PAINTED_CHEST = register(VariantChests.RU_LIME_PAINTED, RegionsUnexplored.RU_LIME_PAINTED_CHEST);
        RU_MAGENTA_PAINTED_CHEST = register(VariantChests.RU_MAGENTA_PAINTED, RegionsUnexplored.RU_MAGENTA_PAINTED_CHEST);
        RU_MAPLE_CHEST = register(VariantChests.RU_MAPLE, RegionsUnexplored.RU_MAPLE_CHEST);
        RU_MAUVE_CHEST = register(VariantChests.RU_MAUVE, RegionsUnexplored.RU_MAUVE_CHEST);
        RU_ORANGE_PAINTED_CHEST = register(VariantChests.RU_ORANGE_PAINTED, RegionsUnexplored.RU_ORANGE_PAINTED_CHEST);
        RU_PALM_CHEST = register(VariantChests.RU_PALM, RegionsUnexplored.RU_PALM_CHEST);
        RU_PINE_CHEST = register(VariantChests.RU_PINE, RegionsUnexplored.RU_PINE_CHEST);
        RU_PINK_PAINTED_CHEST = register(VariantChests.RU_PINK_PAINTED, RegionsUnexplored.RU_PINK_PAINTED_CHEST);
        RU_PURPLE_PAINTED_CHEST = register(VariantChests.RU_PURPLE_PAINTED, RegionsUnexplored.RU_PURPLE_PAINTED_CHEST);
        RU_REDWOOD_CHEST = register(VariantChests.RU_REDWOOD, RegionsUnexplored.RU_REDWOOD_CHEST);
        RU_RED_PAINTED_CHEST = register(VariantChests.RU_RED_PAINTED, RegionsUnexplored.RU_RED_PAINTED_CHEST);
        RU_WHITE_PAINTED_CHEST = register(VariantChests.RU_WHITE_PAINTED, RegionsUnexplored.RU_WHITE_PAINTED_CHEST);
        RU_WILLOW_CHEST = register(VariantChests.RU_WILLOW, RegionsUnexplored.RU_WILLOW_CHEST);
        RU_YELLOW_PAINTED_CHEST = register(VariantChests.RU_YELLOW_PAINTED, RegionsUnexplored.RU_YELLOW_PAINTED_CHEST);

        RU_CHERRY_CHEST = register(VariantChests.RU_CHERRY, RegionsUnexplored.RU_CHERRY_CHEST);
        RU_SCULKWOOD_CHEST = register(VariantChests.RU_SCULKWOOD, RegionsUnexplored.RU_SCULKWOOD_CHEST);

        RU_BLUE_BIOSHROOM_CHEST = register(VariantChests.RU_BLUE_BIOSHROOM, RegionsUnexplored.RU_BLUE_BIOSHROOM_CHEST);
        RU_BRIMWOOD_CHEST = register(VariantChests.RU_BRIMWOOD, RegionsUnexplored.RU_BRIMWOOD_CHEST);
        RU_COBALT_CHEST = register(VariantChests.RU_COBALT, RegionsUnexplored.RU_COBALT_CHEST);
        RU_GREEN_BIOSHROOM_CHEST = register(VariantChests.RU_GREEN_BIOSHROOM, RegionsUnexplored.RU_GREEN_BIOSHROOM_CHEST);
        RU_KAPOK_CHEST = register(VariantChests.RU_KAPOK, RegionsUnexplored.RU_KAPOK_CHEST);
        RU_MAGNOLIA_CHEST = register(VariantChests.RU_MAGNOLIA, RegionsUnexplored.RU_MAGNOLIA_CHEST);
        RU_PINK_BIOSHROOM_CHEST = register(VariantChests.RU_PINK_BIOSHROOM, RegionsUnexplored.RU_PINK_BIOSHROOM_CHEST);
        RU_SOCOTRA_CHEST = register(VariantChests.RU_SOCOTRA, RegionsUnexplored.RU_SOCOTRA_CHEST);
        RU_YELLOW_BIOSHROOM_CHEST = register(VariantChests.RU_YELLOW_BIOSHROOM, RegionsUnexplored.RU_YELLOW_BIOSHROOM_CHEST);
    }

    public static void registerSPBlockEntities() {
        SP_STONE_PINE_CHEST = register(VariantChests.SP_STONE_PINE, SnifferPlus.SP_STONE_PINE_CHEST);
    }

    public static void registerTRBlockEntities() {
        TR_RUBBER_CHEST = register(VariantChests.TR_RUBBER, TechReborn.TR_RUBBER_CHEST);
    }

    public static void registerLDVBlockEntities() {
        LDV_CHERRY_CHEST = register(VariantChests.LDV_CHERRY, Vinery.LDV_CHERRY_CHEST);
    }

    private static BlockEntityType<VariantChestBlockEntity> register(VariantChests type, Block... block) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, type.getId(),
                FabricBlockEntityTypeBuilder.create((pos, state) -> new VariantChestBlockEntity(type, pos, state),
                        block).build(null));
    }
}