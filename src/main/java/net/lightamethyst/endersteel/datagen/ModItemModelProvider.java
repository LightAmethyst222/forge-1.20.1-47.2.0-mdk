package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Endersteel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.ENDERSTEEL_INGOT);
        simpleItem(ModItems.RAW_ENDERSCRAP);
        simpleItem(ModItems.REFINED_ENDERSCRAP);
        simpleItem(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE);

        handheldItem(ModItems.ENDERSTEEL_SWORD);
        handheldItem(ModItems.ENDERSTEEL_PICKAXE);
        handheldItem(ModItems.ENDERSTEEL_AXE);
        handheldItem(ModItems.ENDERSTEEL_SHOVEL);
        handheldItem(ModItems.ENDERSTEEL_HOE);

        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Endersteel.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Endersteel.MOD_ID,"item/" + item.getId().getPath()));
    }
}
