package net.lightamethyst.endersteel.item;

import net.lightamethyst.endersteel.Endersteel;
import net.lightamethyst.endersteel.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ENDERSTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 10f, 5f, 18,
                    ModTags.Blocks.NEEDS_ENDERSTEEL_TOOL, () -> Ingredient.of(ModItems.ENDERSTEEL_INGOT.get())),
            new ResourceLocation(Endersteel.MOD_ID, "endersteel"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 905, 7f, 2.5f, 12,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(Endersteel.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
