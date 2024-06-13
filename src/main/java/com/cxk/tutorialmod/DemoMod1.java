package com.cxk.tutorialmod;

import com.cxk.tutorialmod.block.ModBlocks;
import com.cxk.tutorialmod.item.ModItemGroups;
import com.cxk.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

/**
 * @author houyunfei
 */
public class DemoMod1 implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
    }
}
