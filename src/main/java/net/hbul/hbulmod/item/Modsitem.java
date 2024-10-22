package net.hbul.hbulmod.item;

import net.hbul.hbulmod.HbulMod;
import net.hbul.hbulmod.item.custom.ModArmorItem;
import net.hbul.hbulmod.item.custom.ModArmorMaterials;
import net.hbul.hbulmod.item.custom.ModToolTiers;
import net.hbul.hbulmod.item.custom.hanastick;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
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
    public static final DeferredItem<Item> PP = ITEMS.register("pp",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> KOKORO = ITEMS.register("kokoro",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUNDER = ITEMS.register("sunder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MIZU = ITEMS.register("mizu",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> HB_SWORD = ITEMS.register("hb_sword",
            () -> new SwordItem(ModToolTiers.HB, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HB,15,1.0f))));

    public static final DeferredItem<PickaxeItem> HB_PICKAXE = ITEMS.register("hb_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HB, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.HB,3F,-2.8f))));

    public static final DeferredItem<ShovelItem> HB_SHOVEL = ITEMS.register("hb_shovel",
            () -> new ShovelItem(ModToolTiers.HB, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.HB,1.5F,-3.0f))));

    public static final DeferredItem<AxeItem> HB_AXE = ITEMS.register("hb_axe",
            () -> new AxeItem(ModToolTiers.HB, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.HB,40F,-1.0f))));

    public static final DeferredItem<HoeItem> HB_Hoe = ITEMS.register("hb_hoe",
            () -> new HoeItem(ModToolTiers.HB, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.HB,0,-3.0f))));

    public static final DeferredItem<ArmorItem> HB_HELMET = ITEMS.register("hb_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HB_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<ArmorItem> HB_CHESTPLATE = ITEMS.register("hb_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HB_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<ArmorItem> HB_LEGGINGS = ITEMS.register("hb_leggings",
            () -> new ArmorItem(ModArmorMaterials.HB_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<ArmorItem> HB_BOOTS = ITEMS.register("hb_boots",
            () -> new ArmorItem(ModArmorMaterials.HB_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));

    public static final DeferredItem<ArmorItem> SUNDER_HELMET = ITEMS.register("sunder_helmet",
            () -> new ModArmorItem(ModArmorMaterials.SUNDER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<ArmorItem> SUNDER_CHESTPLATE = ITEMS.register("sunder_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.SUNDER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
    public static final DeferredItem<ArmorItem> SUNDER_LEGGINGS = ITEMS.register("sunder_leggings",
            () -> new ModArmorItem(ModArmorMaterials.SUNDER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
    public static final DeferredItem<ArmorItem> SUNDER_BOOTS = ITEMS.register("sunder_boots",
            () -> new ModArmorItem(ModArmorMaterials.SUNDER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
