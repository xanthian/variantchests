package net.xanthian.variantchests.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import net.xanthian.variantchests.entity.EntityInitialise;

@Environment(EnvType.CLIENT)
public class EntityRenderInitialise {

    public static void register() {

        BlockEntityRendererFactories.register(EntityInitialise.ACACIA_CHEST, VariantChestRenderer::new);
        //BlockEntityRendererFactories.register(EntityInitialise.BAMBOO_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.BIRCH_CHEST, VariantChestRenderer::new);
        //BlockEntityRendererFactories.register(EntityInitialise.CHERRY_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.CRIMSON_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.DARK_OAK_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.JUNGLE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.MANGROVE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.OAK_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.SPRUCE_CHEST, VariantChestRenderer::new);
        BlockEntityRendererFactories.register(EntityInitialise.WARPED_CHEST, VariantChestRenderer::new);
    }
}