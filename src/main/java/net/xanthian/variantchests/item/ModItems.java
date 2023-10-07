package net.xanthian.variantchests.item;

import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.xanthian.variantchests.Initialise;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);
}
