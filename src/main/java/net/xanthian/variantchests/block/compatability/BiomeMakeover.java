package net.xanthian.variantchests.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.VariantChestBlock;
import net.xanthian.variantchests.block.VariantChests;

import java.util.Map;

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_CHESTS = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BM_ANCIENT_OAK);
    public static Block BM_BLIGHTED_BALSA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BM_BLIGHTED_BALSA);
    public static Block BM_SWAMP_CYPRESS_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BM_SWAMP_CYPRESS);
    public static Block BM_WILLOW_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BM_WILLOW);

    public static void registerChests() {
        registerChests("bm_ancient_oak_chest", BM_ANCIENT_OAK_CHEST);
        registerChests("bm_blighted_balsa_chest", BM_BLIGHTED_BALSA_CHEST);
        registerChests("bm_swamp_cypress_chest", BM_SWAMP_CYPRESS_CHEST);
        registerChests("bm_willow_chest", BM_WILLOW_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}