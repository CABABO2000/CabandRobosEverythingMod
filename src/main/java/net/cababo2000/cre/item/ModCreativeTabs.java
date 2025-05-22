package net.cababo2000.cre.item;

import net.cababo2000.cre.c_r_e;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
