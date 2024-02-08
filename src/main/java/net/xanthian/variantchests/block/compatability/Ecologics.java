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

public class Ecologics {

    public static Map<Identifier, Block> ECO_CHESTS = Maps.newHashMap();

    public static Block ECO_AZALEA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ECO_AZALEA);
    public static Block ECO_COCONUT_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ECO_COCONUT);
    public static Block ECO_FLOWERING_AZALEA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ECO_FLOWERING_AZALEA);
    public static Block ECO_WALNUT_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ECO_WALNUT);

    public static void registerChests() {
        registerChests("eco_azalea_chest", ECO_AZALEA_CHEST);
        registerChests("eco_coconut_chest", ECO_COCONUT_CHEST);
        registerChests("eco_flowering_azalea_chest", ECO_FLOWERING_AZALEA_CHEST);
        registerChests("eco_walnut_chest", ECO_WALNUT_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        ECO_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}