package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Endersteel.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENDERSTEEL_TAB = CREATIVE_MODE_TABS.register("endersteel_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDERSTEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.endersteel_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //rearrange these once all the items are added
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.RAW_ENDERSCRAP.get());
                        output.accept(ModItems.REFINED_ENDERSCRAP.get());
                        output.accept(ModItems.ENDERSTEEL_INGOT.get());
                        output.accept(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get());

                        output.accept(ModItems.ENDERSTEEL_SWORD.get());
                        output.accept(ModItems.ENDERSTEEL_PICKAXE.get());
                        output.accept(ModItems.ENDERSTEEL_AXE.get());
                        output.accept(ModItems.ENDERSTEEL_SHOVEL.get());
                        output.accept(ModItems.ENDERSTEEL_HOE.get());

                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.STEEL_HOE.get());

                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.ENDERSTEEL_BLOCK.get());
                        output.accept(ModBlocks.ENDERSCRAP_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
