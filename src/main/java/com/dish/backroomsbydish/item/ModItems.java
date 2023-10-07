package com.dish.backroomsbydish.item;

import com.dish.backroomsbydish.BackroomsByDish;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COFFEE = registerItem("coffee", new Item(new FabricItemSettings()));

    private static void addItemsToTab(FabricItemGroupEntries entries)
    {
        entries.add(COFFEE);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(BackroomsByDish.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        BackroomsByDish.LOGGER.info("Registering mod items for " + BackroomsByDish.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToTab);
    }
}
