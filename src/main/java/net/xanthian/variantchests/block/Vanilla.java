package net.xanthian.variantchests.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.custom.VariantChestBlock;
import net.xanthian.variantchests.block.custom.VariantChests;
import net.xanthian.variantchests.item.ModItems;

import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class Vanilla {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static final RegistryObject<Block> ACACIA_CHEST = register("acacia_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS), VariantChests.ACACIA), 300);

    public static final RegistryObject<Block> BAMBOO_CHEST = register("bamboo_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS), VariantChests.BAMBOO), 300);

    public static final RegistryObject<Block> BIRCH_CHEST = register("birch_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS), VariantChests.BIRCH), 300);

    public static final RegistryObject<Block> CHERRY_CHEST = register("cherry_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), VariantChests.CHERRY), 300);

    public static final RegistryObject<Block> CRIMSON_CHEST = register("crimson_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS), VariantChests.CRIMSON), 0);

    public static final RegistryObject<Block> DARK_OAK_CHEST = register("dark_oak_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS), VariantChests.DARK_OAK), 300);

    public static final RegistryObject<Block> JUNGLE_CHEST = register("jungle_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS), VariantChests.JUNGLE), 300);

    public static final RegistryObject<Block> MANGROVE_CHEST = register("mangrove_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS), VariantChests.MANGROVE), 300);


    public static final RegistryObject<Block> SPRUCE_CHEST = register("spruce_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS), VariantChests.SPRUCE), 300);

    public static final RegistryObject<Block> WARPED_CHEST = register("warped_chest",
            () -> new VariantChestBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS), VariantChests.WARPED), 0);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> void registerItem(String name, RegistryObject<T> block, int burnTime) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }
}