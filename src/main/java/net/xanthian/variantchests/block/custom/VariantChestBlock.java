package net.xanthian.variantchests.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import net.xanthian.variantchests.entity.VariantChestBlockEntity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VariantChestBlock extends ChestBlock {

    public final VariantChests chestType;

    public VariantChestBlock(BlockBehaviour.Properties pProperties, VariantChests pType) {
        super(pProperties, pType::getBlockEntityType);
        this.chestType = pType;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return this.chestType.getBlockEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, @NotNull BlockState pState, @NotNull BlockEntityType<T> pBlockEntityType) {
        return pLevel.isClientSide ? createTickerHelper(pBlockEntityType, this.blockEntityType(), VariantChestBlockEntity::lidAnimateTick) : null;
    }

    public VariantChests getType() {
        return chestType;
    }
}