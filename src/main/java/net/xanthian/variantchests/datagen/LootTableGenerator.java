package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Vanilla.ACACIA_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BAMBOO_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.BIRCH_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.CHERRY_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.CRIMSON_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.DARK_OAK_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.JUNGLE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.MANGROVE_CHEST, this::nameableContainerDrops);

        addDrop(Vanilla.SPRUCE_CHEST, this::nameableContainerDrops);
        addDrop(Vanilla.WARPED_CHEST, this::nameableContainerDrops);

        withConditions(DefaultResourceConditions.allModsLoaded("ad_astra")).addDrop(AdAstra.AA_GLACIAN_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_CHEST, this::nameableContainerDrops);
        withConditions(DefaultResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_CHEST, this::nameableContainerDrops);
    }
}