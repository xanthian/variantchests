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

public class Promenade {

    public static Map<Identifier, Block> PROM_CHESTS = Maps.newHashMap();

    public static Block PROM_DARK_AMARANTH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.PROM_DARK_AMARANTH);
    public static Block PROM_MAPLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.PROM_MAPLE);
    public static Block PROM_PALM_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.PROM_PALM);
    public static Block PROM_SAKURA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.PROM_SAKURA);

    public static void registerChests() {
        registerChest("prom_dark_amaranth_chest", PROM_DARK_AMARANTH_CHEST);
        registerChest("prom_maple_chest", PROM_MAPLE_CHEST);
        registerChest("prom_palm_chest", PROM_PALM_CHEST);
        registerChest("prom_sakura_chest", PROM_SAKURA_CHEST);
    }

    private static void registerChest(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        PROM_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}