package com.ocelotdiamond.factoria.block;

import com.ocelotdiamond.factoria.factoria;
import com.ocelotdiamond.factoria.item.ModItemGroup;
import com.ocelotdiamond.factoria.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, factoria.MODID);

    public static final RegistryObject<Block> PLACEHOLDER_BLOCK = registerBlock("placeholder_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);

    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(3f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(4.5f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);
    public static final RegistryObject<Block> UNSTABLE_BLOCK = registerBlock("unstable_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModItemGroup.MATERIALS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}