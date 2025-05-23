package net.cababo2000.cre.enchantment;

import net.cababo2000.cre.c_r_e;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, c_r_e.MODID);

    public static final RegistryObject<Enchantment> SERRATIONS = ENCHANTMENTS.register("serrations",
            () -> new Serrations(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, EquipmentSlot.values()));

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }
}
