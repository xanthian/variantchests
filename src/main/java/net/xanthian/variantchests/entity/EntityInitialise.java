package net.xanthian.variantchests.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.VariantChests;

public class EntityInitialise {

    public static BlockEntityType<VariantChestBlockEntity> ACACIA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BAMBOO_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BIRCH_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> SPRUCE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CHERRY_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CRIMSON_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> DARK_OAK_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> JUNGLE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> MANGROVE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> OAK_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> WARPED_CHEST;

        public static void registerBlockEntities() {
            ACACIA_CHEST = register(VariantChests.ACACIA, Vanilla.ACACIA_CHEST);
            BAMBOO_CHEST = register(VariantChests.BAMBOO, Vanilla.BAMBOO_CHEST);
            BIRCH_CHEST = register(VariantChests.BIRCH, Vanilla.BIRCH_CHEST);
            CHERRY_CHEST = register(VariantChests.CHERRY, Vanilla.CHERRY_CHEST);
            CRIMSON_CHEST = register(VariantChests.CRIMSON, Vanilla.CRIMSON_CHEST);
            DARK_OAK_CHEST = register(VariantChests.DARK_OAK, Vanilla.DARK_OAK_CHEST);
            JUNGLE_CHEST = register(VariantChests.JUNGLE, Vanilla.JUNGLE_CHEST);
            MANGROVE_CHEST = register(VariantChests.MANGROVE, Vanilla.MANGROVE_CHEST);
            OAK_CHEST = register(VariantChests.OAK, Vanilla.OAK_CHEST);
            SPRUCE_CHEST = register(VariantChests.SPRUCE, Vanilla.SPRUCE_CHEST);
            WARPED_CHEST = register(VariantChests.WARPED, Vanilla.WARPED_CHEST);
        }

        private static BlockEntityType<VariantChestBlockEntity> register(VariantChests type, Block... block){
            return Registry.register(Registries.BLOCK_ENTITY_TYPE, type.getId(),
                    FabricBlockEntityTypeBuilder.create((pos, state)-> new VariantChestBlockEntity(type, pos, state),
                            block).build(null));
        }
}