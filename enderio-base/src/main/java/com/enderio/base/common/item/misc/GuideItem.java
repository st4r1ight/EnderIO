package com.enderio.base.common.item.misc;

import guideme.GuidesCommon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GuideItem extends Item {

    public GuideItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        var stack = player.getItemInHand(usedHand);

        if (level.isClientSide()) {
            GuidesCommon.openGuide(player, ResourceLocation.fromNamespaceAndPath("enderio", "guide"));
        }

        return InteractionResultHolder.fail(stack);
    }
}
