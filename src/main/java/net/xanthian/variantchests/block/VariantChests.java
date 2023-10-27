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
    BAMBOO,
    BIRCH,
    CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    MANGROVE,
    OAK,
    SPRUCE,
    WARPED,

    AA_GLACIAN,
    LDBP_PALM,
    BA_ROTTEN,
    DAD_ECHO,
    MC_PUTRID,
    SP_STONE_PINE,
    TR_RUBBER,
    LDV_CHERRY
    ;


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
            case OAK -> EntityInitialise.OAK_CHEST;
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST;
            case WARPED -> EntityInitialise.WARPED_CHEST;

            case AA_GLACIAN -> EntityInitialise.AA_GLACIAN_CHEST;
            case LDBP_PALM -> EntityInitialise.LDBP_PALM_CHEST;
            case BA_ROTTEN -> EntityInitialise.BA_ROTTEN_CHEST;
            case DAD_ECHO -> EntityInitialise.DAD_ECHO_CHEST;
            case MC_PUTRID -> EntityInitialise.MC_PUTRID_CHEST;
            case SP_STONE_PINE -> EntityInitialise.SP_STONE_PINE_CHEST;
            case TR_RUBBER -> EntityInitialise.TR_RUBBER_CHEST;
            case LDV_CHERRY -> EntityInitialise.LDV_CHERRY_CHEST;

        };
    }

    public VariantChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(this, pos, state);
    }

    public Identifier getId(){
        return new Identifier(Initialise.MOD_ID, this.name().toLowerCase() + "_chest");
    }
}