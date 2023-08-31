package net.xanthian.variantchests;

import net.fabricmc.api.ModInitializer;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.util.ModCreativeTab;
import net.xanthian.variantchests.util.ModFuelRegistry;

public class Initialise  implements ModInitializer {

    public static final String MOD_ID = "variantchests";

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaChests();
        EntityInitialise.registerBlockEntities();
        ModCreativeTab.registerItemGroup();
        ModFuelRegistry.registerFuel();
    }
}