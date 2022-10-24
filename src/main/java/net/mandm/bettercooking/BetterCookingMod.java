package net.mandm.bettercooking;

import net.fabricmc.api.ModInitializer;
import net.mandm.bettercooking.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterCookingMod implements ModInitializer {
    public static final String MOD_ID = "bettercooking";
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        LOGGER.info("Hello Fabric world!");
    }
}
