package net.xanthian.variantchests;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.util.ModFuelRegistry;

public class Initialise  implements ModInitializer {

    public static final String MOD_ID = "variantchests";

    public static final ItemGroup VARIANTCHESTS = FabricItemGroupBuilder.build(new Identifier("variantchests"),
            () -> new ItemStack(Vanilla.WARPED_CHEST));

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaChests();
        EntityInitialise.registerBlockEntities();
        ModFuelRegistry.registerFuel();
    }
}