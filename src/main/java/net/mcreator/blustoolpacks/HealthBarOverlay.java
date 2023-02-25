/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.blustoolpacks as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.blustoolpacks;

import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.blustoolpacks.gui.overlay.HealthBarOverlay;
import net.minecraft.entity.Entity;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HealthBarOverlay {
	public HealthBarOverlay() {
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		new HealthBarOverlay();
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
				double health = (Entity.getHealth());
				double maxHealth = (Entity.getMaxHealth());
				int barlength = (int)Math.round(((200)*(health/maxHealth)
		}
	}

	@Mod.EventBusSubscriber
	private static class ForgeBusEvents {
		// Example Forge bus event registration
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
		}

		@SubscribeEvent
		public static void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void clientLoad(FMLClientSetupEvent event) {
		}
	}
}
