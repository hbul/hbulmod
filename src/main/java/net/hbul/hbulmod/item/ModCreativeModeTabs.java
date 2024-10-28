package net.hbul.hbulmod.item;

import net.hbul.hbulmod.HbulMod;
import net.hbul.hbulmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HbulMod.MODID);

    public static final Supplier<CreativeModeTab> HBGOD_ITEMS_TAB = CREATIVE_MODE_TAB.register("hbgod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Modsitem.HBGOD.get()))
                    .title(Component.translatable("creativetab.hbulmod.hbgod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Modsitem.HBGOD);
                        output.accept(Modsitem.UMAISIRU);
                        output.accept(Modsitem.KUERUSIRU);
                        output.accept(Modsitem.HANASTICK);
                        output.accept(Modsitem.HB);
                        output.accept(Modsitem.PP);
                        output.accept(Modsitem.HB_SWORD);
                        output.accept(Modsitem.HB_AXE);
                        output.accept(Modsitem.HB_Hoe);
                        output.accept(Modsitem.HB_PICKAXE);
                        output.accept(Modsitem.HB_SHOVEL);
                        output.accept(Modsitem.KOKORO);
                        output.accept(Modsitem.SUNDER);
                        output.accept(Modsitem.MIZU);

                        output.accept(Modsitem.HB_HELMET);
                        output.accept(Modsitem.HB_LEGGINGS);
                        output.accept(Modsitem.HB_CHESTPLATE);
                        output.accept(Modsitem.HB_BOOTS);

                        output.accept(Modsitem.SUNDER_BOOTS);
                        output.accept(Modsitem.SUNDER_CHESTPLATE);
                        output.accept(Modsitem.SUNDER_HELMET);
                        output.accept(Modsitem.SUNDER_LEGGINGS);



                    }).build());
    public static final Supplier<CreativeModeTab> HBGOD_BLOCK_TAB = CREATIVE_MODE_TAB.register("hbgod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HB_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HbulMod.MODID, "hbgod_items_tab"))
                    .title(Component.translatable("creativetab.hbulmod.hbgod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HB_BLOCK);
                        output.accept(ModBlocks.HB_ORE);

                        output.accept(ModBlocks.HB_STAIR);
                        output.accept(ModBlocks.HB_BUTTON);
                        output.accept(ModBlocks.HB_SLAB);
                        output.accept(ModBlocks.HB_PRESSURE_PLATE);
                        output.accept(ModBlocks.HB_DOOR);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
