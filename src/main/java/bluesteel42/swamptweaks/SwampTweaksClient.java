package bluesteel42.swamptweaks;

import bluesteel42.swamptweaks.block.ModBlocks;
import bluesteel42.swamptweaks.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;

public class SwampTweaksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Boat Models
        TerraformBoatClientHelper.registerModelLayers(ModBoats.SWAMP_BOATS_ID);
        // Color Leaves
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            if (view == null || pos == null) {
                return -7158200;
            }
            return BiomeColors.getFoliageColor(view, pos);
        }, ModBlocks.SWAMP_LEAVES);


    }
}
