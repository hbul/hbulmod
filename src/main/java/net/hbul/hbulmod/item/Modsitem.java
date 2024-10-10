package net.hbul.hbulmod.item;

import net.hbul.hbulmod.HbulMod;
import net.hbul.hbulmod.item.custom.hanastick;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Modsitem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HbulMod.MODID);

    public static final DeferredItem<Item> HBGOD = ITEMS.register("hbgod",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UMAISIRU = ITEMS.register("umaisiru",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HB = ITEMS.register("hb",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KUERUSIRU = ITEMS.register("kuerusiru",
            () -> new Item(new Item.Properties().food(ModFoodProperites.KUERUSIRU)));


    public static final DeferredItem<Item> HANASTICK = ITEMS.register("hanastick",
            () -> new hanastick(new Item.Properties().durability(32)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
