package net.xanthian.variantchests.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.variantchests.Initialise;
import net.xanthian.variantchests.block.Vanilla;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Initialise.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VC_TAB = CREATIVE_MODE_TABS.register("variantchests",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Vanilla.MANGROVE_CHEST.get()))
                    .title(Component.literal("Variant Chests"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Vanilla.ACACIA_CHEST.get());
                        pOutput.accept(Vanilla.BAMBOO_CHEST.get());
                        pOutput.accept(Vanilla.BIRCH_CHEST.get());
                        pOutput.accept(Vanilla.CHERRY_CHEST.get());
                        pOutput.accept(Vanilla.CRIMSON_CHEST.get());
                        pOutput.accept(Vanilla.DARK_OAK_CHEST.get());
                        pOutput.accept(Vanilla.JUNGLE_CHEST.get());
                        pOutput.accept(Vanilla.MANGROVE_CHEST.get());
                        pOutput.accept(Blocks.CHEST);
                        pOutput.accept(Vanilla.SPRUCE_CHEST.get());
                        pOutput.accept(Vanilla.WARPED_CHEST.get());
                    })
                    .build());
}