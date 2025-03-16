package bluesteel42.swamptweaks;

import bluesteel42.swamptweaks.entity.ModBoats;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;

public class SwampTweaksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Boat Models
        TerraformBoatClientHelper.registerModelLayers(ModBoats.SWAMP_BOATS_ID);
    }
}
