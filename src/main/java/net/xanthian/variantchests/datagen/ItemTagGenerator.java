package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantchests.block.*;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.ItemTags.NON_FLAMMABLE_WOOD;

import static net.xanthian.variantchests.util.ModItemTags.CHESTS;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Item> C_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:chests"));
    public static final TagKey<Item> C_WOODEN_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_chests"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(CHESTS)
                    .add(Vanilla.ACACIA_CHEST.asItem())
                    .add(Vanilla.BAMBOO_CHEST.asItem())
                    .add(Vanilla.BIRCH_CHEST.asItem())
                    .add(Vanilla.CHERRY_CHEST.asItem())
                    .add(Vanilla.CRIMSON_CHEST.asItem())
                    .add(Vanilla.DARK_OAK_CHEST.asItem())
                    .add(Vanilla.JUNGLE_CHEST.asItem())
                    .add(Vanilla.MANGROVE_CHEST.asItem())
                    .add(Vanilla.OAK_CHEST.asItem())
                    .add(Vanilla.SPRUCE_CHEST.asItem())
                    .add(Vanilla.WARPED_CHEST.asItem());

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Vanilla.CRIMSON_CHEST.asItem())
                    .add(Vanilla.WARPED_CHEST.asItem());

            getOrCreateTagBuilder(C_CHESTS)
                    .forceAddTag(CHESTS);

            getOrCreateTagBuilder(C_WOODEN_CHESTS)
                    .forceAddTag(CHESTS);
        }
    }