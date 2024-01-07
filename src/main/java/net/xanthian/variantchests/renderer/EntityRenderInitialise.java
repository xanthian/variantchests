package net.xanthian.variantchests.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.xanthian.variantchests.entity.EntityInitialise;

@Environment(EnvType.CLIENT)
public class EntityRenderInitialise {
    public static void register() {

        BlockEntityRendererFactories.register(EntityInitialise.ACACIA_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.BAMBOO_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.BIRCH_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.CHERRY_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.CRIMSON_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.DARK_OAK_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.JUNGLE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.MANGROVE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.SPRUCE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.WARPED_CHEST, VariantChestRenderer::new);
    }

    public static void registerAAChests() {
        BlockEntityRendererFactories.register(EntityInitialise.AA_GLACIAN_CHEST, VariantChestRenderer::new);
    }

    public static void registerLDBPChests() {
        BlockEntityRendererFactories.register(EntityInitialise.LDBP_PALM_CHEST, VariantChestRenderer::new);
    }

    public static void registerBAChests() {
        BlockEntityRendererFactories.register(EntityInitialise.BA_ROTTEN_CHEST, VariantChestRenderer::new);
    }

    public static void registerCSChests() {
        BlockEntityRendererFactories.register(EntityInitialise.CS_SCORCHED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.CS_UMBRAL_CHEST, VariantChestRenderer::new);
    }

    public static void registerDADChests() {
        BlockEntityRendererFactories.register(EntityInitialise.DAD_ECHO_CHEST, VariantChestRenderer::new);
    }

    public static void registerDSChests() {
        BlockEntityRendererFactories.register(EntityInitialise.DS_CHARRED_CHEST, VariantChestRenderer::new);
    }

    public static void registerMCChests() {
        BlockEntityRendererFactories.register(EntityInitialise.MC_PUTRID_CHEST, VariantChestRenderer::new);
    }

    public static void registerRUChests() {
        BlockEntityRendererFactories.register(EntityInitialise.RU_ALPHA_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BAOBAB_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BLACK_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BLACKWOOD_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BLUE_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BROWN_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_CYAN_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_CYPRESS_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_DEAD_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_EUCALYPTUS_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_GRAY_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_GREEN_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_JOSHUA_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_LARCH_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_LIGHT_BLUE_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_LIGHT_GRAY_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_LIME_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_MAGENTA_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_MAPLE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_MAUVE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_ORANGE_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_PALM_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_PINE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_PINK_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_PURPLE_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_REDWOOD_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_RED_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_WHITE_PAINTED_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_WILLOW_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_YELLOW_PAINTED_CHEST, VariantChestRenderer::new);

        BlockEntityRendererFactories.register(EntityInitialise.RU_CHERRY_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_SCULKWOOD_CHEST, VariantChestRenderer::new);

        BlockEntityRendererFactories.register(EntityInitialise.RU_BLUE_BIOSHROOM_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_BRIMWOOD_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_COBALT_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_GREEN_BIOSHROOM_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_KAPOK_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_MAGNOLIA_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_PINK_BIOSHROOM_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_SOCOTRA_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.RU_YELLOW_BIOSHROOM_CHEST, VariantChestRenderer::new);
    }

    public static void registerSPChests() {
        BlockEntityRendererFactories.register(EntityInitialise.SP_STONE_PINE_CHEST, VariantChestRenderer::new);
    }

    public static void registerTRChests() {
        BlockEntityRendererFactories.register(EntityInitialise.TR_RUBBER_CHEST, VariantChestRenderer::new);
    }

    public static void registerLDVChests() {
        BlockEntityRendererFactories.register(EntityInitialise.LDV_CHERRY_CHEST, VariantChestRenderer::new);
    }
}