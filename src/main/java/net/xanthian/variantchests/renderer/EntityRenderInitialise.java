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
        BlockEntityRendererFactories.register(EntityInitialise.OAK_CHEST, VariantChestRenderer::new);
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
    public static void registerDADChests() {
        BlockEntityRendererFactories.register(EntityInitialise.DAD_ECHO_CHEST, VariantChestRenderer::new);
    }
    public static void registerMCChests() {
        BlockEntityRendererFactories.register(EntityInitialise.MC_PUTRID_CHEST, VariantChestRenderer::new);
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