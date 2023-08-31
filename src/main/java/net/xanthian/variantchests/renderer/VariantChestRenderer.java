package net.xanthian.variantchests.renderer;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.*;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import net.minecraft.client.render.block.entity.LightmapCoordinatesRetriever;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;

import net.xanthian.variantchests.block.VariantChestBlock;
import net.xanthian.variantchests.entity.VariantChestBlockEntity;

@Environment(EnvType.CLIENT)
public class VariantChestRenderer extends ChestBlockEntityRenderer<VariantChestBlockEntity> {

    private final ModelPart chestLid;
    private final ModelPart chestBase;
    private final ModelPart chestLock;

    public VariantChestRenderer(BlockEntityRendererFactory.Context context) {
        super(context);
        ModelPart modelPart = context.getLayerModelPart(EntityModelLayers.CHEST);
        this.chestBase = modelPart.getChild("bottom");
        this.chestLid = modelPart.getChild("lid");
        this.chestLock = modelPart.getChild("lock");
    }

    public void render(VariantChestBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        World world = entity.getWorld();

        BlockState blockState = world != null ? entity.getCachedState() : Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
        Block block = blockState.getBlock();

        if (block instanceof VariantChestBlock) {
            matrices.push();

            float f = blockState.get(ChestBlock.FACING).asRotation();
            matrices.translate(0.5F, 0.5F, 0.5F);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-f));
            matrices.translate(-0.5F, -0.5F, -0.5F);

            DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> propertySource;

            if (world == null) {
                propertySource = DoubleBlockProperties.PropertyRetriever::getFallback;
            } else {
                propertySource = ((VariantChestBlock)block).getBlockEntitySource(blockState, world, entity.getPos(), true);
            }

            float g = propertySource.apply(ChestBlock.getAnimationProgressRetriever(entity)).get(tickDelta);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = ((Int2IntFunction)propertySource.apply(new LightmapCoordinatesRetriever())).applyAsInt(light);
            SpriteIdentifier spriteIdentifier = new SpriteIdentifier(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, ((VariantChestBlock) block).chestType.getTextureId());
            VertexConsumer vertexConsumer = spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);

            this.render(matrices, vertexConsumer, this.chestLid, this.chestLock, this.chestBase, g, i, overlay);
            matrices.pop();
        }
    }

    private void render(MatrixStack matrices, VertexConsumer vertices, ModelPart lid, ModelPart latch, ModelPart base, float openFactor, int light, int overlay) {
        lid.pitch = -(openFactor * 1.5707964F);
        latch.pitch = lid.pitch;
        lid.render(matrices, vertices, light, overlay);
        latch.render(matrices, vertices, light, overlay);
        base.render(matrices, vertices, light, overlay);
    }
}