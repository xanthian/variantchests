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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_CHESTS = Maps.newHashMap();

    public static Block NS_ASPEN_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_ASPEN);
    public static Block NS_CEDAR_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_CEDAR);
    public static Block NS_COCONUT_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_COCONUT);
    public static Block NS_CYPRESS_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_CYPRESS);
    public static Block NS_FIR_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_FIR);
    public static Block NS_GHAF_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_GHAF);
    public static Block NS_JOSHUA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_JOSHUA);
    public static Block NS_LARCH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_LARCH);
    public static Block NS_MAPLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_MAPLE);
    public static Block NS_OLIVE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_OLIVE);
    public static Block NS_PALO_VERDE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_PALO_VERDE);
    public static Block NS_REDWOOD_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_REDWOOD);
    public static Block NS_SUGI_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_SUGI);
    public static Block NS_WILLOW_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_WILLOW);
    public static Block NS_WISTERIA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.NS_WISTERIA);

    public static void registerChests() {
        registerChest("ns_aspen_chest", NS_ASPEN_CHEST);
        registerChest("ns_cedar_chest", NS_CEDAR_CHEST);
        registerChest("ns_coconut_chest", NS_COCONUT_CHEST);
        registerChest("ns_cypress_chest", NS_CYPRESS_CHEST);
        registerChest("ns_fir_chest", NS_FIR_CHEST);
        registerChest("ns_ghaf_chest", NS_GHAF_CHEST);
        registerChest("ns_joshua_chest", NS_JOSHUA_CHEST);
        registerChest("ns_larch_chest", NS_LARCH_CHEST);
        registerChest("ns_maple_chest", NS_MAPLE_CHEST);
        registerChest("ns_olive_chest", NS_OLIVE_CHEST);
        registerChest("ns_palo_verde_chest", NS_PALO_VERDE_CHEST);
        registerChest("ns_redwood_chest", NS_REDWOOD_CHEST);
        registerChest("ns_sugi_chest", NS_SUGI_CHEST);
        registerChest("ns_willow_chest", NS_WILLOW_CHEST);
        registerChest("ns_wisteria_chest", NS_WISTERIA_CHEST);
    }

    private static void registerChest(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        NS_CHESTS.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}