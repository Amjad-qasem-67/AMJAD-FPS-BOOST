
package com.amjad.fpsboost;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(
    modid = "amjadfpsboost",
    name = "AMJAD FPS BOOST",
    version = "1.0",
    acceptedMinecraftVersions = "[1.12.2]"
)
@Mod.EventBusSubscriber(Side.CLIENT)
public class AmjadFPSBoost {

    @SubscribeEvent
    public static void renderFPS(RenderGameOverlayEvent.Text event) {

        Minecraft mc = Minecraft.getMinecraft();

        int fps = Minecraft.getDebugFPS();

        mc.fontRenderer.drawStringWithShadow(
            "AMJAD FPS: " + fps,
            8,
            8,
            0x55FF55
        );
    }
}
