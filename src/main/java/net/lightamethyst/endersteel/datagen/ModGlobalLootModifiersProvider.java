package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.item.ModItems;
import net.lightamethyst.endersteel.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Endersteel.MOD_ID);
    }

    @Override
    protected void start() {
        add("endersteel_smithing_upgrade_template_from_end_city_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build()}, ModItems.ENDERSTEEL_UPGRADE_SMITHING_TEMPLATE.get()));
    }
}
