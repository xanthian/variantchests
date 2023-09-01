package net.xanthian.variantchests.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.entity.VariantChestBlockEntity;

public enum VariantChests {

    ACACIA,
    //BAMBOO,
    BIRCH,
    //CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    //MANGROVE,
    OAK,
    SPRUCE,
    WARPED,
    ;

    public BlockEntityType<? extends VariantChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_CHEST;
            //case BAMBOO -> EntityInitialise.BAMBOO_CHEST;
            case BIRCH -> EntityInitialise.BIRCH_CHEST;
            //case CHERRY -> EntityInitialise.CHERRY_CHEST;
            case CRIMSON -> EntityInitialise.CRIMSON_CHEST;
            case DARK_OAK -> EntityInitialise.DARK_OAK_CHEST;
            case JUNGLE -> EntityInitialise.JUNGLE_CHEST;
            //case MANGROVE -> EntityInitialise.MANGROVE_CHEST;
            case OAK -> EntityInitialise.OAK_CHEST;
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST;
            case WARPED -> EntityInitialise.WARPED_CHEST;
        };
    }

    public VariantChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(this, pos, state);
    }

    public Identifier getId(){
        return new Identifier(Initialise.MOD_ID, this.name().toLowerCase() + "_chest");
    }
}