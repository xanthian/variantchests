package net.xanthian.variantchests.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.AbstractBlock;
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

public class BetterArcheology {

    public static Map<Identifier, Block> BA_CHESTS = Maps.newHashMap();

    public static Block BA_ROTTEN_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.BA_ROTTEN);

    public static void registerChests() {
        registerChests("ba_rotten_chest", BA_ROTTEN_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BA_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
    }
}