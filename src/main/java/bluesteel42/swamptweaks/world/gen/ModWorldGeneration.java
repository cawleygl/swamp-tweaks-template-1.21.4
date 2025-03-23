package bluesteel42.swamptweaks.world.gen;

import bluesteel42.swamptweaks.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.SWAMP_MUD_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.SWAMP_MUDDY_GRASS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SWAMP_HUGE_MUSHROOMS_PLACED_KEY);
    }
}
