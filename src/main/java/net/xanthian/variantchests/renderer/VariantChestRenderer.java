package net.xanthian.variantchests.renderer;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.*;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.enums.ChestType;
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
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.World;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.VariantChestBlock;
import net.xanthian.variantchests.block.VariantChests;
import net.xanthian.variantchests.entity.VariantChestBlockEntity;

import java.util.Locale;

@Environment(EnvType.CLIENT)
public class VariantChestRenderer extends ChestBlockEntityRenderer<VariantChestBlockEntity> {

    private final ModelPart singleChestLid;
    private final ModelPart singleChestBase;
    private final ModelPart singleChestLock;
    private final ModelPart doubleChestLeftBase;
    private final ModelPart doubleChestLeftLid;
    private final ModelPart doubleChestLeftLock;
    private final ModelPart doubleChestRightBase;
    private final ModelPart doubleChestRightLid;
    private final ModelPart doubleChestRightLock;
    public static SpriteIdentifier[] single = new SpriteIdentifier[VariantChests.values().length];
    public static SpriteIdentifier[] left = new SpriteIdentifier[VariantChests.values().length];
    public static SpriteIdentifier[] right = new SpriteIdentifier[VariantChests.values().length];

    static {
        for (VariantChests type : VariantChests.values()) {
            int ordinal = type.ordinal();
            String name = type.name().toLowerCase(Locale.ROOT);
            single[ordinal] = getChestID(name + "_chest");
            left[ordinal] = getChestID(name + "_chest_left");
            right[ordinal] = getChestID(name + "_chest_right");
        }
    }

    public static SpriteIdentifier getChestID(String path) {
        return new SpriteIdentifier(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, new Identifier(Initialise.MOD_ID, "entity/chest/" + path)) {};
    }

    private SpriteIdentifier getChestTexture(VariantChestBlockEntity tile, ChestType type) {
            return chooseMaterial(type, left[tile.getChestType().ordinal()], right[tile.getChestType().ordinal()], single[tile.getChestType().ordinal()]);
    }

    public VariantChestRenderer(BlockEntityRendererFactory.Context context) {
        super(context);
        ModelPart modelPart = context.getLayerModelPart(EntityModelLayers.CHEST);
        this.singleChestBase = modelPart.getChild("bottom");
        this.singleChestLid = modelPart.getChild("lid");
        this.singleChestLock = modelPart.getChild("lock");
        ModelPart modelPart2 = context.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_LEFT);
        this.doubleChestLeftBase = modelPart2.getChild("bottom");
        this.doubleChestLeftLid = modelPart2.getChild("lid");
        this.doubleChestLeftLock = modelPart2.getChild("lock");
        ModelPart modelPart3 = context.getLayerModelPart(EntityModelLayers.DOUBLE_CHEST_RIGHT);
        this.doubleChestRightBase = modelPart3.getChild("bottom");
        this.doubleChestRightLid = modelPart3.getChild("lid");
        this.doubleChestRightLock = modelPart3.getChild("lock");
    }

    public void render(VariantChestBlockEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        World world = entity.getWorld();

        BlockState blockState = world != null ? entity.getCachedState() : Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = blockState.contains(ChestBlock.CHEST_TYPE) ? (ChestType)blockState.get(ChestBlock.CHEST_TYPE) : ChestType.SINGLE;
        Block block = blockState.getBlock();

        if (block instanceof VariantChestBlock) {
            boolean bl2 = chestType != ChestType.SINGLE;
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
            SpriteIdentifier spriteIdentifier = getChestTexture(entity, chestType);
            VertexConsumer vertexConsumer = spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);
            if (bl2) {
                if (chestType == ChestType.LEFT) {
                    this.render(matrices, vertexConsumer, this.doubleChestLeftLid, this.doubleChestLeftLock, this.doubleChestLeftBase, g, i, overlay);
                } else {
                    this.render(matrices, vertexConsumer, this.doubleChestRightLid, this.doubleChestRightLock, this.doubleChestRightBase, g, i, overlay);
                }
            } else {
                this.render(matrices, vertexConsumer, this.singleChestLid, this.singleChestLock, this.singleChestBase, g, i, overlay);
            }

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


    public static SpriteIdentifier chooseMaterial(ChestType type, SpriteIdentifier left, SpriteIdentifier right, SpriteIdentifier single) {
        return switch (type) {
            case LEFT -> left;
            case RIGHT -> right;
            default -> single;
        };
    }
}