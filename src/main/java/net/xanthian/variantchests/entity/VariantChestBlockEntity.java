package net.xanthian.variantchests.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import net.xanthian.variantchests.block.VariantChests;

public class VariantChestBlockEntity extends ChestBlockEntity {

    private final VariantChests chestType;

    public VariantChestBlockEntity(VariantChests chestType, BlockPos blockPos, BlockState blockState) {
        super(chestType.getBlockEntityType(), blockPos, blockState);
        this.chestType = chestType;
    }

    public VariantChests getChestType() {
        return chestType;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.variantchests." + chestType.name().toLowerCase() + "_chest");
    }
}