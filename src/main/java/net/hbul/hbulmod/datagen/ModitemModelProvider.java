package net.hbul.hbulmod.datagen;

import net.hbul.hbulmod.HbulMod;
import net.hbul.hbulmod.item.Modsitem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.repository.Pack;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModitemModelProvider extends ItemModelProvider {
    public ModitemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HbulMod.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(Modsitem.HB.get());

        basicItem(Modsitem.HB_SWORD.get());
        basicItem(Modsitem.HB_PICKAXE.get());

        handheldItem(Modsitem.HB_SWORD);
        handheldItem(Modsitem.HB_PICKAXE);




    }
    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(HbulMod.MODID,"item/" + item.getId().getPath()));
        
    }


}
