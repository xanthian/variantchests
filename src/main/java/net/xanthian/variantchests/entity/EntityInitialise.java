package net.xanthian.variantchests.entity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.custom.VariantChests;

@Mod.EventBusSubscriber(modid = Initialise.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInitialise {

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Initialise.MOD_ID);

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> ACACIA_CHEST =
            BLOCK_ENTITIES.register("acacia_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.ACACIA),
                            Vanilla.ACACIA_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> BAMBOO_CHEST =
            BLOCK_ENTITIES.register("bamboo_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.BAMBOO),
                            Vanilla.BAMBOO_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> BIRCH_CHEST =
            BLOCK_ENTITIES.register("birch_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.BIRCH),
                            Vanilla.BIRCH_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> CHERRY_CHEST =
            BLOCK_ENTITIES.register("cherry_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.CHERRY),
                            Vanilla.CHERRY_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> CRIMSON_CHEST =
            BLOCK_ENTITIES.register("crimson_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.CRIMSON),
                            Vanilla.CRIMSON_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> DARK_OAK_CHEST =
            BLOCK_ENTITIES.register("dark_oak_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.DARK_OAK),
                            Vanilla.DARK_OAK_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> JUNGLE_CHEST =
            BLOCK_ENTITIES.register("jungle_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.JUNGLE),
                            Vanilla.JUNGLE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> MANGROVE_CHEST =
            BLOCK_ENTITIES.register("mangrove_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.MANGROVE),
                            Vanilla.MANGROVE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> SPRUCE_CHEST =
            BLOCK_ENTITIES.register("spruce_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.SPRUCE),
                            Vanilla.SPRUCE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> WARPED_CHEST =
            BLOCK_ENTITIES.register("warped_chest", () ->
                    BlockEntityType.Builder.of((pos, state)-> new VariantChestBlockEntity(
                            pos, state, VariantChests.WARPED),
                            Vanilla.WARPED_CHEST.get()).build(null));

    public static void registerBlockEntities() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}