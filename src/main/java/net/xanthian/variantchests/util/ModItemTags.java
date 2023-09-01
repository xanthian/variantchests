package net.xanthian.variantchests.util;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;

import net.minecraft.util.registry.Registry;
import net.xanthian.variantchests.Initialise;

public class ModItemTags {

    public static final TagKey<Item> CHESTS = register("chests");

    private ModItemTags() {
    }

    private static TagKey<Item> register(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Initialise.MOD_ID, id));
    }
}