package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Endersteel.MOD_ID);

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ENDERSCRAP = ITEMS.register("raw_enderscrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_ENDERSCRAP = ITEMS.register("refined_enderscrap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_INGOT = ITEMS.register("endersteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("endersteel_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> ENDERSTEEL_SWORD = ITEMS.register("endersteel_sword",
            () -> new SwordItem(ModToolTiers.ENDERSTEEL, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_PICKAXE = ITEMS.register("endersteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDERSTEEL, 2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_AXE = ITEMS.register("endersteel_axe",
            () -> new AxeItem(ModToolTiers.ENDERSTEEL, 6, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_SHOVEL = ITEMS.register("endersteel_shovel",
            () -> new ShovelItem(ModToolTiers.ENDERSTEEL, 2.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ENDERSTEEL_HOE = ITEMS.register("endersteel_hoe",
            () -> new HoeItem(ModToolTiers.ENDERSTEEL, -5, 0, new Item.Properties()));

public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 5.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 1.5f, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, -2, 0, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
