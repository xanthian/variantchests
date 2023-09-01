package net.xanthian.variantchests;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import net.xanthian.variantchests.datagen.*;

public class DatagenInitialise implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

        fabricDataGenerator.addProvider(BlockTagGenerator::new);
        fabricDataGenerator.addProvider(ItemTagGenerator::new);
        fabricDataGenerator.addProvider(LangFileGenerator::new);
        fabricDataGenerator.addProvider(LootTableGenerator::new);
        fabricDataGenerator.addProvider(RecipeGenerator::new);
        fabricDataGenerator.addProvider(ModelGenerator::new);
    }
}