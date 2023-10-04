package net.xanthian.variantchests.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.xanthian.variantchests.entity.VariantChestBlockEntity;

import org.jetbrains.annotations.Nullable;

public class VariantChestBlock extends ChestBlock {

    public final VariantChests chestType;

    public VariantChestBlock(Settings settings, VariantChests type) {
        super(settings, type::getBlockEntityType);
        this.chestType = type;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return this.chestType.getBlockEntity(pos, state);
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return world.isClient ? checkType(type, this.getExpectedEntityType(), VariantChestBlockEntity::clientTick) : null;
    }

    public VariantChests getType(){return chestType;}
}