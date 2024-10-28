package net.hbul.hbulmod.block;

import net.hbul.hbulmod.HbulMod;
import net.hbul.hbulmod.item.Modsitem;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HbulMod.MODID);

    public static final DeferredBlock<Block> HB_BLOCK = registerBlock("hb_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.7f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final DeferredBlock<Block> HB_ORE = registerBlock("hb_ore",
            () -> new DropExperienceBlock(UniformInt.of(2,4),
                    BlockBehaviour.Properties.of().strength(0.6f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<StairBlock> HB_STAIR = registerBlock("hb_stair",
            () -> new StairBlock(ModBlocks.HB_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(0.7f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<SlabBlock> HB_SLAB = registerBlock("hb_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(0.7f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<PressurePlateBlock> HB_PRESSURE_PLATE = registerBlock("hb_presshure_plate",
            () -> new PressurePlateBlock(BlockSetType.GOLD,BlockBehaviour.Properties.of().strength(0.7f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<ButtonBlock> HB_BUTTON = registerBlock("hb_button",
            () -> new ButtonBlock(BlockSetType.GOLD,20,BlockBehaviour.Properties.of().strength(0.7f).requiresCorrectToolForDrops().noCollission()));
    public static final DeferredBlock<DoorBlock> HB_DOOR = registerBlock("hb_door",
            () -> new DoorBlock(BlockSetType.GOLD,BlockBehaviour.Properties.of().strength(0.7f).requiresCorrectToolForDrops().noCollission()));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Modsitem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
