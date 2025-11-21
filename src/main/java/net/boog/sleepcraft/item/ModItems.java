package net.boog.sleepcraft.item;

import net.boog.sleepcraft.SleepCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHAMBER_STICK = registerItem( name: "chamber_stick", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SleepCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SleepCraft.LOGGER.info("Registering Mod Itmes for " + SleepCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHAMBER_STICK);
        });
    }
}
