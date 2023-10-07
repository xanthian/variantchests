package net.xanthian.variantchests.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.entity.VariantChestBlockEntity;


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
    ;

    public BlockEntityType<? extends VariantChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_CHEST.get();
            case BAMBOO -> EntityInitialise.BAMBOO_CHEST.get();
            case BIRCH -> EntityInitialise.BIRCH_CHEST.get();
            case CHERRY -> EntityInitialise.CHERRY_CHEST.get();
            case CRIMSON -> EntityInitialise.CRIMSON_CHEST.get();
            case DARK_OAK -> EntityInitialise.DARK_OAK_CHEST.get();
            case JUNGLE -> EntityInitialise.JUNGLE_CHEST.get();
            case MANGROVE -> EntityInitialise.MANGROVE_CHEST.get();
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST.get();
            case WARPED -> EntityInitialise.WARPED_CHEST.get();
        };
    }

    public VariantChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(pos, state, this);
    }
}