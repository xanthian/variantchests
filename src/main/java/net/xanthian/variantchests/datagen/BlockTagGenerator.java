package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.*;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.AXE_MINEABLE;
import static net.minecraft.registry.tag.BlockTags.GUARDED_BY_PIGLINS;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID,"chests"));
    public static final TagKey<Block> C_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:chests"));
    public static final TagKey<Block> C_WOODEN_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:wooden_chests"));


    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(CHESTS)
                .add(Vanilla.ACACIA_CHEST)
                .add(Vanilla.BAMBOO_CHEST)
                .add(Vanilla.BIRCH_CHEST)
                //.add(Vanilla.CHERRY_CHEST)
                .add(Vanilla.CRIMSON_CHEST)
                .add(Vanilla.DARK_OAK_CHEST)
                .add(Vanilla.JUNGLE_CHEST)
                .add(Vanilla.MANGROVE_CHEST)
                .add(Vanilla.OAK_CHEST)
                .add(Vanilla.SPRUCE_CHEST)
                .add(Vanilla.WARPED_CHEST);

        getOrCreateTagBuilder(AXE_MINEABLE)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(GUARDED_BY_PIGLINS)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(C_CHESTS)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(C_WOODEN_CHESTS)
                .forceAddTag(CHESTS);
    }
}