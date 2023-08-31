package net.xanthian.variantchests;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.xanthian.variantchests.renderer.EntityRenderInitialise;

@Environment(EnvType.CLIENT)
    public class ClientInitialise implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
            EntityRenderInitialise.register();
    }
}