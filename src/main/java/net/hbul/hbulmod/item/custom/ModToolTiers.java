package net.hbul.hbulmod.item.custom;

import net.hbul.hbulmod.item.Modsitem;
import net.hbul.hbulmod.item.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier HB = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_HBUL_TOOL,
            1400,7f,6f,20, () -> Ingredient.of(Modsitem.HB));

}
