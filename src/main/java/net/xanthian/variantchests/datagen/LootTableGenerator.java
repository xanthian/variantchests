package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_CHESTS.values()) {
            addDrop(block, this::nameableContainerDrops);
        }

        withConditions(DefaultResourceConditions.allModsLoaded("ad_astra")).addDrop(AdAstra.AA_GLACIAN_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_CHEST, this::nameableContainerDrops);
        registerSpecialLootTable(Cinderscapes.CS_CHESTS, "cinderscapes");
        withConditions(DefaultResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("desolation")).addDrop(Desolation.DS_CHARRED_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_CHEST, this::nameableContainerDrops);
        registerSpecialLootTable(RegionsUnexplored.RU_CHESTS, "regions_unexplored");
        withConditions(DefaultResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_CHEST, this::nameableContainerDrops);
    }

    public void registerSpecialLootTable(Map<Identifier, Block> chests, String modId) {
        for (Map.Entry<Identifier, Block> entry : chests.entrySet()) {
            Identifier chestId = entry.getKey();
            Block chest = entry.getValue();
            String path = chestId.getPath();
            String name = path.replace("variantchests:", "").replace("_chest", "").replaceFirst("^[^_]+_", "");
            withConditions(DefaultResourceConditions.and(
                    DefaultResourceConditions.allModsLoaded(modId),
                    DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(modId + ":" + name + "_planks")))
            )).addDrop(chest, this::nameableContainerDrops);
        }
    }
}