package bluesteel42.swamptweaks.registries;

import bluesteel42.swamptweaks.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.SWAMP_WOOD, ModBlocks.STRIPPED_SWAMP_WOOD);
        StrippableBlockRegistry.register(ModBlocks.SWAMP_LOG, ModBlocks.STRIPPED_SWAMP_LOG);
    }
}
