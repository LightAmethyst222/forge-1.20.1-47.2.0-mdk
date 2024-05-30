package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> ENDERSTEEL_SMELTABLES = List.of(ModItems.RAW_ENDERSCRAP.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreBlasting(consumer, ENDERSTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.REFINED_ENDERSCRAP.get(), 2.0f, 200, "endersteel");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDERSTEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ENDERSTEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.ENDERSTEEL_INGOT.get()), has(ModItems.ENDERSTEEL_INGOT.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ENDERSTEEL_INGOT.get(), 9)
                .requires(ModBlocks.ENDERSTEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ENDERSTEEL_BLOCK.get()), has(ModBlocks.ENDERSTEEL_BLOCK.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.STEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer,"steel_block_from_ingots");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 9)
                .requires(ModBlocks.STEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.STEEL_BLOCK.get()), has(ModBlocks.STEEL_BLOCK.get()))
                .save(consumer, "steel_ingots_from_block");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(),8)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .define('#', Blocks.IRON_BLOCK)
                .define('C', Blocks.COAL_BLOCK)
                .unlockedBy(getHasName(Blocks.IRON_BLOCK), has(Blocks.IRON_BLOCK))
                .unlockedBy(getHasName(Blocks.COAL_BLOCK), has(Blocks.COAL_BLOCK))
                .save(consumer, "steel_blocks_from_components");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_INGOT.get(),8)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .define('#', Items.IRON_INGOT)
                .define('C', Items.COAL)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(consumer, "steel_ingots_from_components");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get(), 2)
                .pattern("#T#")
                .pattern("#B#")
                .pattern("###")
                .define('#', Items.DIAMOND)
                .define('T', ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get())
                .define('B', Blocks.END_STONE)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(Blocks.END_STONE), has(Blocks.END_STONE))
                .unlockedBy(getHasName(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()), has(ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer);
       ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get())
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer, "steel_axe_facing_left");
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_AXE.get())
                .pattern("##")
                .pattern("S#")
                .pattern("S ")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer, "steel_axe_facing_right");
     ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_SHOVEL.get())
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer);
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer, "steel_hoe_facing_left");
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.STEEL_HOE.get())
                .pattern("##")
                .pattern("S ")
                .pattern("S ")
                .define('#', ModItems.STEEL_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(ModItems.STEEL_INGOT.get()), has(ModItems.STEEL_INGOT.get()))
                .save(consumer, "steel_hoe_facing_right");
    }



    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Endersteel.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
