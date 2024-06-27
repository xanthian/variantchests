package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class LootTableGenerator extends FabricBlockLootTableProvider {

    public LootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_CHESTS.values()) {
            addDrop(block, this::nameableContainerDrops);
        }

        //withConditions(ResourceConditions.allModsLoaded("ad_astra")).addDrop(AdAstra.AA_GLACIAN_CHEST, this::nameableContainerDrops);
        //withConditions(ResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_CHEST, this::nameableContainerDrops);
        //withConditions(ResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_CHEST, this::nameableContainerDrops);
        //registerSpecialLootTable(BiomeMakeover.BM_CHESTS, "biomemakeover");
        //registerSpecialLootTable(Cinderscapes.CS_CHESTS, "cinderscapes");
        //withConditions(ResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_CHEST, this::nameableContainerDrops);
        //withConditions(ResourceConditions.allModsLoaded("desolation")).addDrop(Desolation.DS_CHARRED_CHEST, this::nameableContainerDrops);
        //registerSpecialLootTable(Ecologics.ECO_CHESTS, "ecologics");
        //withConditions(ResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_CHEST, this::nameableContainerDrops);
        //registerSpecialLootTable(NaturesSpirit.NS_CHESTS, "natures_spirit");
        //registerSpecialLootTable(Promenade.PROM_CHESTS, "promenade");
        //registerSpecialLootTable(RegionsUnexplored.RU_CHESTS, "regions_unexplored");
        //withConditions(ResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_CHEST, this::nameableContainerDrops);
        //withConditions(ResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_CHEST, this::nameableContainerDrops);
        //withConditions(ResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_CHEST, this::nameableContainerDrops);
    }

    public void registerSpecialLootTable(Map<Identifier, Block> chests, String modId) {
        for (Map.Entry<Identifier, Block> entry : chests.entrySet()) {
            Identifier chestId = entry.getKey();
            Block chest = entry.getValue();
            String path = chestId.getPath();
            String name = path.replace("variantchests:", "").replace("_chest", "").replaceFirst("^[^_]+_", "");
            withConditions(ResourceConditions.and(
                    ResourceConditions.allModsLoaded(modId),
                    ResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(modId + ":" + name + "_planks")))
            )).addDrop(chest, this::nameableContainerDrops);
        }
    }
}