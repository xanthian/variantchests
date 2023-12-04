package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;
import net.xanthian.variantchests.util.ModItemTags;

import java.util.Map;
import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
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

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerChestRecipe(exporter, Vanilla.ACACIA_CHEST, Items.ACACIA_PLANKS);
        offerChestRecipe(exporter, Vanilla.BAMBOO_CHEST, Items.BAMBOO_PLANKS);
        offerChestRecipe(exporter, Vanilla.BIRCH_CHEST, Items.BIRCH_PLANKS);
        offerChestRecipe(exporter, Vanilla.CHERRY_CHEST, Items.CHERRY_PLANKS);
        offerChestRecipe(exporter, Vanilla.CRIMSON_CHEST, Items.CRIMSON_PLANKS);
        offerChestRecipe(exporter, Vanilla.DARK_OAK_CHEST, Items.DARK_OAK_PLANKS);
        offerChestRecipe(exporter, Vanilla.JUNGLE_CHEST, Items.JUNGLE_PLANKS);
        offerChestRecipe(exporter, Vanilla.MANGROVE_CHEST, Items.MANGROVE_PLANKS);
        offerChestRecipe(exporter, Vanilla.SPRUCE_CHEST, Items.SPRUCE_PLANKS);
        offerChestRecipe(exporter, Vanilla.WARPED_CHEST, Items.WARPED_PLANKS);

        registerChestRecipe(exporter, AdAstra.AA_CHESTS, "ad_astra");
        registerChestRecipe(exporter, BeachParty.LDBP_CHESTS, "beachparty");
        registerChestRecipe(exporter, BetterArcheology.BA_CHESTS, "betterarcheology");
        //registerChestRecipe(exporter, Bewitchment.BW_CHESTS, "bewitchment");
        //registerChestRecipe(exporter, BiomeMakeover.BM_CHESTS, "biomemakeover");
        //registerChestRecipe(exporter, Blockus.BLS_CHESTS, "blockus");
        //registerChestRecipe(exporter, Botania.BOT_CHESTS, "botania");
        //registerChestRecipe(exporter, Cinderscapes.CS_CHESTS, "cinderscapes");
        registerChestRecipe(exporter, DeeperAndDarker.DAD_CHESTS, "deeperdarker");
        //registerChestRecipe(exporter, Desolation.DS_CHESTS, "desolation");
        //registerChestRecipe(exporter, EldritchEnd.EE_CHESTS, "eldritch_end");
        registerChestRecipe(exporter, MineCells.MC_CHESTS, "minecells");
        //registerChestRecipe(exporter, NaturesSpirit.NS_CHESTS, "natures_spirit");
        //registerChestRecipe(exporter, Promenade.PROM_CHESTS, "promenade");
        registerChestRecipe(exporter, RegionsUnexplored.RU_CHESTS, "regions_unexplored");
        //registerChestRecipe(exporter, SnifferPlus.SP_CHESTS, "snifferplus");
        registerChestRecipe(exporter, TechReborn.TR_CHESTS, "techreborn");
        registerChestRecipe(exporter, Vinery.LDV_CHESTS, "vinery");

        offerCustomChestBoatRecipe(exporter, Items.ACACIA_CHEST_BOAT, Items.ACACIA_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.BAMBOO_CHEST_RAFT, Items.BAMBOO_RAFT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.BIRCH_CHEST_BOAT, Items.BIRCH_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.CHERRY_CHEST_BOAT, Items.CHERRY_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.JUNGLE_CHEST_BOAT, Items.JUNGLE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.MANGROVE_CHEST_BOAT, Items.MANGROVE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.OAK_CHEST_BOAT, Items.OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.SPRUCE_CHEST_BOAT, Items.SPRUCE_BOAT, ModItemTags.CHESTS);

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

    public void registerChestRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> chests, String modId) {
        registerChestRecipe(exporter, chests, modId, "_planks");
    }

    public void registerChestRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> chests, String modId, String plankSuffix) {
        for (Map.Entry<Identifier, Block> entry : chests.entrySet()) {
            Identifier chestId = entry.getKey();
            Block chest = entry.getValue();
            String path = chestId.getPath();
            String name = path.replace("variantchests:", "").replace("_chest", "").replaceFirst("^[^_]+_", "");
            String plankPath = modId + ":" + name + plankSuffix;
            offerChestRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                            DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath))))),
                    chest, Registries.ITEM.get(new Identifier(plankPath)));
        }
    }
}