package com.ocelotdiamond.factoria.item;

import com.ocelotdiamond.factoria.factoria;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, factoria.MODID);

    public static final RegistryObject<Item> PLACEHOLDER = ITEMS.register("placeholder", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    // Materials
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ZINC_GEAR = ITEMS.register("zinc_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("brass_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> UNSTABLE_INGOT = ITEMS.register("unstable_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> UNSTABLE_NUGGET = ITEMS.register("unstable_nugget", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> UNSTABLE_PLATE = ITEMS.register("unstable_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> UNSTABLE_GEAR = ITEMS.register("unstable_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> UNSTABLE_DUST = ITEMS.register("unstable_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}