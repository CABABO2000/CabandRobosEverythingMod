package net.cababo2000.cre.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = "cre", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "cre");

    public static final RegistryObject<MobEffect> BLEEDING =
            MOB_EFFECTS.register("bleeding", Bleeding::new);

    public static void register() {
        MOB_EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}