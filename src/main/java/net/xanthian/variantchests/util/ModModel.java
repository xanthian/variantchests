package net.xanthian.variantchests.util;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModel {

    public static final Model CHEST;

    static {
        CHEST = createModel("variantchest", ModTextureKey.CHEST);
    }

    public static Identifier getBlockId(String id) {
        return new Identifier("variantchests", "block/" + id);
    }

    public static Model createModel(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(getBlockId(parent)), Optional.empty(), requiredTextures);
    }
}