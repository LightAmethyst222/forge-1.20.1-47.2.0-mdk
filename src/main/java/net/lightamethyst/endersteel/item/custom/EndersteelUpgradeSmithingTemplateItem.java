package net.lightamethyst.endersteel.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EndersteelUpgradeSmithingTemplateItem extends Item {
    public EndersteelUpgradeSmithingTemplateItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.endersteel.endersteel_upgrade").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.literal(""));
        pTooltipComponents.add(Component.translatable("tooltip.endersteel.endersteel_upgrade_applies_to_title").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.endersteel.endersteel_upgrade_applies_to").withStyle(ChatFormatting.BLUE));
        pTooltipComponents.add(Component.translatable("tooltip.endersteel.endersteel_upgrade_ingredients_title").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.endersteel.endersteel_upgrade_ingredients").withStyle(ChatFormatting.BLUE));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
