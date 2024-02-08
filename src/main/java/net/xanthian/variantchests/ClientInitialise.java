package net.xanthian.variantchests;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.xanthian.variantchests.renderer.EntityRenderInitialise;

@Environment(EnvType.CLIENT)
public class ClientInitialise implements ClientModInitializer {
    public static void ifModLoaded(String modId, Runnable... runnables) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            for (Runnable runnable : runnables) {
                runnable.run();
            }
        }
    }

    @Override
    public void onInitializeClient() {
        EntityRenderInitialise.register();

        ifModLoaded("ad_astra", EntityRenderInitialise::registerAAChests);
        ifModLoaded("beachparty", EntityRenderInitialise::registerLDBPChests);
        ifModLoaded("betterarcheology", EntityRenderInitialise::registerBAChests);
        ifModLoaded("biomemakeover", EntityRenderInitialise::registerBMChests);
        ifModLoaded("cinderscapes", EntityRenderInitialise::registerCSChests);
        ifModLoaded("deeperdarker", EntityRenderInitialise::registerDADChests);
        ifModLoaded("desolation", EntityRenderInitialise::registerDSChests);
        ifModLoaded("ecologics", EntityRenderInitialise::registerECOChests);
        ifModLoaded("minecells", EntityRenderInitialise::registerMCChests);
        ifModLoaded("natures_spirit", EntityRenderInitialise::registerNSChests);
        ifModLoaded("promenade", EntityRenderInitialise::registerPROMChests);
        ifModLoaded("regions_unexplored", EntityRenderInitialise::registerRUChests);
        ifModLoaded("snifferplus", EntityRenderInitialise::registerSPChests);
        ifModLoaded("techreborn", EntityRenderInitialise::registerTRChests);
        ifModLoaded("vinery", EntityRenderInitialise::registerLDVChests);

        //EntityRenderInitialise.registerSPChests();
    }
}