package net.xanthian.variantchests.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.entity.VariantChestBlockEntity;

import java.util.Locale;

public enum VariantChests {

    ACACIA,
    BAMBOO,
    BIRCH,
    CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    MANGROVE,
    SPRUCE,
    WARPED,

    AA_GLACIAN,
    LDBP_PALM,
    BA_ROTTEN,

    BM_ANCIENT_OAK,
    BM_BLIGHTED_BALSA,
    BM_SWAMP_CYPRESS,
    BM_WILLOW,

    CS_SCORCHED,
    CS_UMBRAL,
    DS_CHARRED,
    DAD_ECHO,

    ECO_AZALEA,
    ECO_COCONUT,
    ECO_FLOWERING_AZALEA,
    ECO_WALNUT,

    MC_PUTRID,

    NS_ASPEN,
    NS_CEDAR,
    NS_COCONUT,
    NS_CYPRESS,
    NS_FIR,
    NS_GHAF,
    NS_JOSHUA,
    NS_LARCH,
    NS_MAPLE,
    NS_OLIVE,
    NS_PALO_VERDE,
    NS_REDWOOD,
    NS_SUGI,
    NS_WILLOW,
    NS_WISTERIA,

    PROM_DARK_AMARANTH,
    PROM_MAPLE,
    PROM_PALM,
    PROM_SAKURA,

    RU_ALPHA,
    RU_BAOBAB,
    RU_BLACK_PAINTED,
    RU_BLACKWOOD,
    RU_BLUE_PAINTED,
    RU_BROWN_PAINTED,
    RU_CYAN_PAINTED,
    RU_CYPRESS,
    RU_DEAD,
    RU_EUCALYPTUS,
    RU_GRAY_PAINTED,
    RU_GREEN_PAINTED,
    RU_JOSHUA,
    RU_LARCH,
    RU_LIGHT_BLUE_PAINTED,
    RU_LIGHT_GRAY_PAINTED,
    RU_LIME_PAINTED,
    RU_MAGENTA_PAINTED,
    RU_MAPLE,
    RU_MAUVE,
    RU_ORANGE_PAINTED,
    RU_PALM,
    RU_PINE,
    RU_PINK_PAINTED,
    RU_PURPLE_PAINTED,
    RU_REDWOOD,
    RU_RED_PAINTED,
    RU_WHITE_PAINTED,
    RU_WILLOW,
    RU_YELLOW_PAINTED,

    RU_CHERRY,
    RU_SCULKWOOD,

    RU_BLUE_BIOSHROOM,
    RU_BRIMWOOD,
    RU_COBALT,
    RU_GREEN_BIOSHROOM,
    RU_KAPOK,
    RU_MAGNOLIA,
    RU_PINK_BIOSHROOM,
    RU_SOCOTRA,
    RU_YELLOW_BIOSHROOM,

    SP_STONE_PINE,
    TR_RUBBER,
    LDV_CHERRY;


    public BlockEntityType<? extends VariantChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_CHEST;
            case BAMBOO -> EntityInitialise.BAMBOO_CHEST;
            case BIRCH -> EntityInitialise.BIRCH_CHEST;
            case CHERRY -> EntityInitialise.CHERRY_CHEST;
            case CRIMSON -> EntityInitialise.CRIMSON_CHEST;
            case DARK_OAK -> EntityInitialise.DARK_OAK_CHEST;
            case JUNGLE -> EntityInitialise.JUNGLE_CHEST;
            case MANGROVE -> EntityInitialise.MANGROVE_CHEST;
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST;
            case WARPED -> EntityInitialise.WARPED_CHEST;

            case AA_GLACIAN -> EntityInitialise.AA_GLACIAN_CHEST;
            case LDBP_PALM -> EntityInitialise.LDBP_PALM_CHEST;
            case BA_ROTTEN -> EntityInitialise.BA_ROTTEN_CHEST;

            case BM_ANCIENT_OAK -> EntityInitialise.BM_ANCIENT_OAK_CHEST;
            case BM_BLIGHTED_BALSA -> EntityInitialise.BM_BLIGHTED_BALSA_CHEST;
            case BM_SWAMP_CYPRESS -> EntityInitialise.BM_SWAMP_CYPRESS_CHEST;
            case BM_WILLOW -> EntityInitialise.BM_WILLOW_CHEST;

            case CS_SCORCHED -> EntityInitialise.CS_SCORCHED_CHEST;
            case CS_UMBRAL -> EntityInitialise.CS_UMBRAL_CHEST;
            case DAD_ECHO -> EntityInitialise.DAD_ECHO_CHEST;
            case DS_CHARRED -> EntityInitialise.DS_CHARRED_CHEST;

            case ECO_AZALEA -> EntityInitialise.ECO_AZALEA_CHEST;
            case ECO_COCONUT -> EntityInitialise.ECO_COCONUT_CHEST;
            case ECO_FLOWERING_AZALEA -> EntityInitialise.ECO_FLOWERING_AZALEA_CHEST;
            case ECO_WALNUT -> EntityInitialise.ECO_WALNUT_CHEST;

            case MC_PUTRID -> EntityInitialise.MC_PUTRID_CHEST;

            case NS_ASPEN -> EntityInitialise.NS_ASPEN_CHEST;
            case NS_CEDAR -> EntityInitialise.NS_CEDAR_CHEST;
            case NS_COCONUT -> EntityInitialise.NS_COCONUT_CHEST;
            case NS_CYPRESS -> EntityInitialise.NS_CYPRESS_CHEST;
            case NS_FIR -> EntityInitialise.NS_FIR_CHEST;
            case NS_GHAF -> EntityInitialise.NS_GHAF_CHEST;
            case NS_JOSHUA -> EntityInitialise.NS_JOSHUA_CHEST;
            case NS_LARCH -> EntityInitialise.NS_LARCH_CHEST;
            case NS_MAPLE -> EntityInitialise.NS_MAPLE_CHEST;
            case NS_OLIVE -> EntityInitialise.NS_OLIVE_CHEST;
            case NS_PALO_VERDE -> EntityInitialise.NS_PALO_VERDE_CHEST;
            case NS_REDWOOD -> EntityInitialise.NS_REDWOOD_CHEST;
            case NS_SUGI -> EntityInitialise.NS_SUGI_CHEST;
            case NS_WILLOW -> EntityInitialise.NS_WILLOW_CHEST;
            case NS_WISTERIA -> EntityInitialise.NS_WISTERIA_CHEST;

            case PROM_DARK_AMARANTH -> EntityInitialise.PROM_DARK_AMARANTH_CHEST;
            case PROM_MAPLE -> EntityInitialise.PROM_MAPLE_CHEST;
            case PROM_PALM -> EntityInitialise.PROM_PALM_CHEST;
            case PROM_SAKURA -> EntityInitialise.PROM_SAKURA_CHEST;

            case RU_ALPHA -> EntityInitialise.RU_ALPHA_CHEST;
            case RU_BAOBAB -> EntityInitialise.RU_BAOBAB_CHEST;
            case RU_BLACK_PAINTED -> EntityInitialise.RU_BLACK_PAINTED_CHEST;
            case RU_BLACKWOOD -> EntityInitialise.RU_BLACKWOOD_CHEST;
            case RU_BLUE_PAINTED -> EntityInitialise.RU_BLUE_PAINTED_CHEST;
            case RU_BROWN_PAINTED -> EntityInitialise.RU_BROWN_PAINTED_CHEST;
            case RU_CYAN_PAINTED -> EntityInitialise.RU_CYAN_PAINTED_CHEST;
            case RU_CYPRESS -> EntityInitialise.RU_CYPRESS_CHEST;
            case RU_DEAD -> EntityInitialise.RU_DEAD_CHEST;
            case RU_EUCALYPTUS -> EntityInitialise.RU_EUCALYPTUS_CHEST;
            case RU_GRAY_PAINTED -> EntityInitialise.RU_GRAY_PAINTED_CHEST;
            case RU_GREEN_PAINTED -> EntityInitialise.RU_GREEN_PAINTED_CHEST;
            case RU_JOSHUA -> EntityInitialise.RU_JOSHUA_CHEST;
            case RU_LARCH -> EntityInitialise.RU_LARCH_CHEST;
            case RU_LIGHT_BLUE_PAINTED -> EntityInitialise.RU_LIGHT_BLUE_PAINTED_CHEST;
            case RU_LIGHT_GRAY_PAINTED -> EntityInitialise.RU_LIGHT_GRAY_PAINTED_CHEST;
            case RU_LIME_PAINTED -> EntityInitialise.RU_LIME_PAINTED_CHEST;
            case RU_MAGENTA_PAINTED -> EntityInitialise.RU_MAGENTA_PAINTED_CHEST;
            case RU_MAPLE -> EntityInitialise.RU_MAPLE_CHEST;
            case RU_MAUVE -> EntityInitialise.RU_MAUVE_CHEST;
            case RU_ORANGE_PAINTED -> EntityInitialise.RU_ORANGE_PAINTED_CHEST;
            case RU_PALM -> EntityInitialise.RU_PALM_CHEST;
            case RU_PINE -> EntityInitialise.RU_PINE_CHEST;
            case RU_PINK_PAINTED -> EntityInitialise.RU_PINK_PAINTED_CHEST;
            case RU_PURPLE_PAINTED -> EntityInitialise.RU_PURPLE_PAINTED_CHEST;
            case RU_REDWOOD -> EntityInitialise.RU_REDWOOD_CHEST;
            case RU_RED_PAINTED -> EntityInitialise.RU_RED_PAINTED_CHEST;
            case RU_WHITE_PAINTED -> EntityInitialise.RU_WHITE_PAINTED_CHEST;
            case RU_WILLOW -> EntityInitialise.RU_WILLOW_CHEST;
            case RU_YELLOW_PAINTED -> EntityInitialise.RU_YELLOW_PAINTED_CHEST;

            case RU_CHERRY -> EntityInitialise.RU_CHERRY_CHEST;
            case RU_SCULKWOOD -> EntityInitialise.RU_SCULKWOOD_CHEST;

            case RU_BLUE_BIOSHROOM -> EntityInitialise.RU_BLUE_BIOSHROOM_CHEST;
            case RU_BRIMWOOD -> EntityInitialise.RU_BRIMWOOD_CHEST;
            case RU_COBALT -> EntityInitialise.RU_COBALT_CHEST;
            case RU_GREEN_BIOSHROOM -> EntityInitialise.RU_GREEN_BIOSHROOM_CHEST;
            case RU_KAPOK -> EntityInitialise.RU_KAPOK_CHEST;
            case RU_MAGNOLIA -> EntityInitialise.RU_MAGNOLIA_CHEST;
            case RU_PINK_BIOSHROOM -> EntityInitialise.RU_PINK_BIOSHROOM_CHEST;
            case RU_SOCOTRA -> EntityInitialise.RU_SOCOTRA_CHEST;
            case RU_YELLOW_BIOSHROOM -> EntityInitialise.RU_YELLOW_BIOSHROOM_CHEST;

            case SP_STONE_PINE -> EntityInitialise.SP_STONE_PINE_CHEST;
            case TR_RUBBER -> EntityInitialise.TR_RUBBER_CHEST;
            case LDV_CHERRY -> EntityInitialise.LDV_CHERRY_CHEST;

        };
    }

    public VariantChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(this, pos, state);
    }

    public Identifier getId() {
        return new Identifier(Initialise.MOD_ID, this.name().toLowerCase(Locale.ROOT) + "_chest");
    }
}