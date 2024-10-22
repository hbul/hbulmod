package net.hbul.hbulmod.item;

import net.hbul.hbulmod.HbulMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
