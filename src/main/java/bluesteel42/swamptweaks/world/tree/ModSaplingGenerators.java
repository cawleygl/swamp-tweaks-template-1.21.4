package bluesteel42.swamptweaks.world.tree;

import bluesteel42.swamptweaks.SwampTweaks;
import bluesteel42.swamptweaks.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator SWAMP = new SaplingGenerator(SwampTweaks.MOD_ID + ":swamp",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SWAMP_KEY), Optional.empty());
}
