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
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_PLATE = ITEMS.register("brass_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_ROD = ITEMS.register("brass_rod", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_PIPE = ITEMS.register("brass_pipe", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_WIRE = ITEMS.register("brass_wire", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_ROD = ITEMS.register("bronze_rod", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_PIPE = ITEMS.register("bronze_pipe", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_WIRE = ITEMS.register("bronze_wire", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties().tab(ModItemGroup.MATERIALS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}