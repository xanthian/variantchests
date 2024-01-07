package net.xanthian.variantchests;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.block.compatability.*;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.util.ModCreativeTab;
import net.xanthian.variantchests.util.ModFuelRegistry;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantchests";

    public static void ifModLoaded(String modId, Runnable... runnables) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        }
    }

    @Override
    public void onInitialize() {

        Vanilla.registerVanillaChests();
        EntityInitialise.registerBlockEntities();
        ModCreativeTab.registerItemGroup();
        ModFuelRegistry.registerFuel();

        ifModLoaded("ad_astra", AdAstra::registerChests, EntityInitialise::registerAABlockEntities);
        ifModLoaded("beachparty", BeachParty::registerChests, EntityInitialise::registerLDBPBlockEntities);
        ifModLoaded("betterarcheology", BetterArcheology::registerChests, EntityInitialise::registerBABlockEntities);
        ifModLoaded("cinderscapes", Cinderscapes::registerChests, EntityInitialise::registerCSBlockEntities);
        ifModLoaded("deeperdarker", DeeperAndDarker::registerChests, EntityInitialise::registerDADBlockEntities);
        ifModLoaded("desolation", Desolation::registerChests, EntityInitialise::registerDSBlockEntities);
        ifModLoaded("minecells", MineCells::registerChests, EntityInitialise::registerMCBlockEntities);
        ifModLoaded("regions_unexplored", RegionsUnexplored::registerChests, EntityInitialise::registerRUBlockEntities);
        ifModLoaded("snifferplus", SnifferPlus::registerChests, EntityInitialise::registerSPBlockEntities);
        ifModLoaded("techreborn", TechReborn::registerChests, EntityInitialise::registerTRBlockEntities);
        ifModLoaded("vinery", Vinery::registerChests, EntityInitialise::registerLDVBlockEntities);

        //SnifferPlus.registerChests();
    }
}