package com.cxk.demo01;

import com.cxk.demo01.item.ModItemGroups;
import com.cxk.demo01.item.ModItems;
import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

/**
 * @author houyunfei
 */
public class DemoMod1 implements ModInitializer {
    public static final String MOD_ID = "demo01";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
    }
}
