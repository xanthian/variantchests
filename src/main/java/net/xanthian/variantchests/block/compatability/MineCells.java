package net.xanthian.variantchests.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantchests.block.VariantChestBlock;
import net.xanthian.variantchests.block.VariantChests;

public class MineCells {

    public static Block MC_PUTRID_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.MC_PUTRID);

    public static void registerChests() {
        registerChests(VariantChests.MC_PUTRID.getId(), MC_PUTRID_CHEST);
    }

    private static void registerChests(Identifier Id, Block block) {
        Identifier identifier = new Identifier(Id.toString());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}