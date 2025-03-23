package bluesteel42.swamptweaks.registries;

import bluesteel42.swamptweaks.block.ModBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.block.MudBlock;

public class ModRegistries {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.SWAMP_WOOD, ModBlocks.STRIPPED_SWAMP_WOOD);
        StrippableBlockRegistry.register(ModBlocks.SWAMP_LOG, ModBlocks.STRIPPED_SWAMP_LOG);
    }

    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.SWAMP_LEAVES, 0.3F);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.SWAMP_SAPLING, 0.3F);
    }

    public static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SWAMP_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SWAMP_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SWAMP_LEAVES, 30, 60);
    }

}
