package com.cxk.demo01.item;

import com.cxk.demo01.DemoMod1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * @author houyunfei
 */
public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));

    public static void registerModItems() {
        DemoMod1.LOGGER.info("Registering items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(ModItems::addItemsToIngredientTabItemGroup);
    }

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }


    public static Item registerItem(String name, Item item) {
        DemoMod1.LOGGER.info("Registering item " + name);
        Registry.register(Registries.ITEM, new Identifier(DemoMod1.MOD_ID, name), item);
        return item;
    }
}
