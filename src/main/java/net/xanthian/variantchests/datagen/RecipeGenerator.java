package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.util.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerChestRecipe(exporter, Vanilla.ACACIA_CHEST, Items.ACACIA_PLANKS);
        offerChestRecipe(exporter, Vanilla.BAMBOO_CHEST, Items.BAMBOO_PLANKS);
        offerChestRecipe(exporter, Vanilla.BIRCH_CHEST, Items.BIRCH_PLANKS);
        //offerChestRecipe(exporter, Vanilla.CHERRY_CHEST, Items.CHERRY_PLANKS);
        offerChestRecipe(exporter, Vanilla.CRIMSON_CHEST, Items.CRIMSON_PLANKS);
        offerChestRecipe(exporter, Vanilla.DARK_OAK_CHEST, Items.DARK_OAK_PLANKS);
        offerChestRecipe(exporter, Vanilla.JUNGLE_CHEST, Items.JUNGLE_PLANKS);
        offerChestRecipe(exporter, Vanilla.MANGROVE_CHEST, Items.MANGROVE_PLANKS);
        offerChestRecipe(exporter, Vanilla.OAK_CHEST, Items.OAK_PLANKS);
        offerChestRecipe(exporter, Vanilla.SPRUCE_CHEST, Items.SPRUCE_PLANKS);
        offerChestRecipe(exporter, Vanilla.WARPED_CHEST, Items.WARPED_PLANKS);

        offerCustomChestBoatRecipe(exporter,Items.ACACIA_CHEST_BOAT, Items.ACACIA_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.BAMBOO_CHEST_RAFT, Items.BAMBOO_RAFT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.BIRCH_CHEST_BOAT, Items.BIRCH_BOAT, ModItemTags.CHESTS);
        //offerCustomChestBoatRecipe(exporter,Items.CHERRY_CHEST_BOAT, Items.CHERRY_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.JUNGLE_CHEST_BOAT, Items.JUNGLE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.MANGROVE_CHEST_BOAT, Items.MANGROVE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.OAK_CHEST_BOAT, Items.OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.SPRUCE_CHEST_BOAT, Items.SPRUCE_BOAT, ModItemTags.CHESTS);


        // Chest Minecart
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHEST_MINECART, 1)
                .input(ModItemTags.CHESTS).input(Items.MINECART)
                .criterion("has_minecart", VanillaRecipeProvider.conditionsFromItem(Items.MINECART))
                .offerTo(exporter, new Identifier("variantchests", "chest_minecart"));
        // Hopper
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.HOPPER, 1)
                .input('I', Items.IRON_INGOT).input('C', ModItemTags.CHESTS)
                .pattern("I I").pattern("ICI").pattern(" I ")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("variantchests", "hopper"));

        // Shulker Box
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SHULKER_BOX, 1)
                .input('-', Items.SHULKER_SHELL).input('#', ModItemTags.CHESTS)
                .pattern(" - ").pattern(" # ").pattern(" - ")
                .criterion("has_shulker_shell", VanillaRecipeProvider.conditionsFromItem(Items.SHULKER_SHELL))
                .offerTo(exporter, new Identifier("variantchests", "shulker_box"));

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHEST, 1)
                .input(ModItemTags.CHESTS)
                .criterion("has_chest", InventoryChangedCriterion.Conditions.items(Items.CHEST))
                .offerTo(exporter, new Identifier("variantchests", "chest"));
    }

    public static void offerChestRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible chest, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, chest, 1)
                .input('P', plank)
                .pattern("PPP").pattern("P P").pattern("PPP")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromItem(plank))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chest)));
    }

    public static void offerCustomChestBoatRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible chestboat, ItemConvertible boat, TagKey<Item> chest) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, chestboat)
                .input(chest).input(boat).group("chest_boat")
                .criterion("has_boat", RecipeProvider.conditionsFromTag(ItemTags.BOATS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chestboat)));
    }
}