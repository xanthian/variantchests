package net.xanthian.variantchests;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.xanthian.variantchests.block.Vanilla;
import net.xanthian.variantchests.entity.EntityInitialise;
import net.xanthian.variantchests.item.ModItems;
import net.xanthian.variantchests.renderer.VariantChestRenderer;
import net.xanthian.variantchests.util.ModCreativeModeTabs;

@Mod(Initialise.MOD_ID)
@Mod.EventBusSubscriber(modid= Initialise.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class Initialise {

    public static final String MOD_ID = "variantchests";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Vanilla.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        modEventBus.addListener(this::registerChestEntityRenders);

        EntityInitialise.registerBlockEntities();

        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }


    @SubscribeEvent
    public void registerChestEntityRenders(EntityRenderersEvent.RegisterRenderers  event) {
        event.registerBlockEntityRenderer(EntityInitialise.ACACIA_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BAMBOO_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BIRCH_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CHERRY_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CRIMSON_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.DARK_OAK_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.JUNGLE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.MANGROVE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.SPRUCE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.WARPED_CHEST.get(), VariantChestRenderer::new);
    }
}