package net.lightamethyst.endersteel.datagen;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.block.ModBlocks;
import net.lightamethyst.endersteel.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Endersteel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.ENDERSCRAP_ORE.get(),
                        ModBlocks.ENDERSTEEL_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.ENDERSTEEL_BLOCK.get(),
                        ModBlocks.ENDERSCRAP_ORE.get()
                );
    }
}
