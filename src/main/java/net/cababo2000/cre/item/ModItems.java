package net.cababo2000.cre.item;

import net.cababo2000.cre.c_r_e;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, c_r_e.MODID);

    public static final RegistryObject<Item> STARITE = ITEMS.register("starite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDCOR = ITEMS.register("endcor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_GRIP = ITEMS.register("wooden_grip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar",
            () -> new Item(new Item.Properties().food(Fooditems.CHOCOLATE_BAR)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
