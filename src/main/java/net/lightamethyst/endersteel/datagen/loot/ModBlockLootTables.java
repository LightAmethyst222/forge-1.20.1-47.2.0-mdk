package net.lightamethyst.endersteel.datagen.loot;

import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(Set<Item> pExplosionResistant, FeatureFlagSet pEnabledFeatures) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.ENDERSTEEL_BLOCK.get());

        this.add(ModBlocks.ENDERSCRAP_ORE.get(),
                block -> createEnderscrapOreDrop(ModBlocks.ENDERSCRAP_ORE.get(), ModItems.RAW_ENDERSCRAP.get()));
    }
    protected LootTable.Builder createEnderscrapOreDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock, (LootPoolEntryContainer.Builder) this.applyExplosionDecay(pBlock, LootItem.lootTableItem(pItem)));
    }

        @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
