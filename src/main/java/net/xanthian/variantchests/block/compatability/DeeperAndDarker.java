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

public class DeeperAndDarker {

    public static Map<Identifier, Block> DAD_CHESTS = Maps.newHashMap();

    public static Block DAD_ECHO_CHEST = new VariantChestBlock(AbstractBlock.Settings.copy(Blocks.CHEST), VariantChests.DAD_ECHO);

    public static void registerChests() {
        registerChests("dad_echo_chest", DAD_ECHO_CHEST);
    }

    private static void registerChests(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        DAD_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
    }
}