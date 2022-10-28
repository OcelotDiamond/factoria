package com.ocelotdiamond.factoria.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab MAIN = new CreativeModeTab("factoria_machines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLACEHOLDER.get());
        }
    };

    public static final CreativeModeTab MATERIALS = new CreativeModeTab("factoria_materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLACEHOLDER.get());
        }
    };
}
