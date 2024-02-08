package net.xanthian.variantchests.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID, "chests"));
    public static final TagKey<Block> C_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:chests"));
    public static final TagKey<Block> C_WOODEN_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:wooden_chests"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_CHESTS);

        registerTags(BiomeMakeover.BM_CHESTS);
        registerTags(Cinderscapes.CS_CHESTS);
        registerTags(Ecologics.ECO_CHESTS);
        registerTags(NaturesSpirit.NS_CHESTS);
        registerTags(Promenade.PROM_CHESTS);
        registerTags(RegionsUnexplored.RU_CHESTS);

        getOrCreateTagBuilder(CHESTS)
                .addOptional(new Identifier("variantchests:aa_glacian_chest"))
                .addOptional(new Identifier("variantchests:ldbp_palm_chest"))
                .addOptional(new Identifier("variantchests:ba_rotten_chest"))
                .addOptional(new Identifier("variantchests:dad_echo_chest"))
                .addOptional(new Identifier("variantchests:ds_charred_chest"))
                .addOptional(new Identifier("variantchests:mc_putrid_chest"))
                .addOptional(new Identifier("variantchests:sp_stone_pine_chest"))
                .addOptional(new Identifier("variantchests:tr_rubber_chest"))
                .addOptional(new Identifier("variantchests:ldv_cherry_chest"));

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(C_CHESTS)
                .forceAddTag(CHESTS);

        getOrCreateTagBuilder(C_WOODEN_CHESTS)
                .forceAddTag(CHESTS);
    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);

            getOrCreateTagBuilder(CHESTS)
                    .addOptional(modifiedId);
        }
    }
}