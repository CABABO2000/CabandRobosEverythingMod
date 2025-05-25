package net.cababo2000.cre.item;

import net.cababo2000.cre.block.ModBlocks;
import net.cababo2000.cre.c_r_e;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, c_r_e.MODID);

    public static final RegistryObject<CreativeModeTab> CRE_INGREDIENTS = CREATIVE_MODE_TABS.register("cre_ingredients",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STARITE.get()))
                    .title(Component.translatable("creativetab.cre_ingredients"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STARITE.get());
                        pOutput.accept(ModItems.ENDCOR.get());
                        pOutput.accept(ModItems.WOODEN_GRIP.get());


                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> CRE_FOODS = CREATIVE_MODE_TABS.register("cre_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STARITE.get()))
                    .title(Component.translatable("creativetab.cre_food"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHOCOLATE_BAR.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> CRE_BLOCKS = CREATIVE_MODE_TABS.register("cre_block",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STARITE_ORE.get()))
                    .title(Component.translatable("creativetab.cre_blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.STARITE_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
