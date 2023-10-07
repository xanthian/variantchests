package net.xanthian.variantchests.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import net.xanthian.variantchests.block.custom.VariantChests;

import org.jetbrains.annotations.NotNull;

public class VariantChestBlockEntity extends ChestBlockEntity {

    private final VariantChests type;

    public VariantChestBlockEntity(BlockPos pos, BlockState state, VariantChests type) {
        this(type.getBlockEntityType(), pos, state, type);
    }

    public VariantChestBlockEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, VariantChests type) {
        super(blockEntityType, pos, state);
        this.type = type;
    }

    public VariantChests getChestType() {
        return type;
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.translatable("container.variantchests." + type.name().toLowerCase() + "_chest");
    }

}