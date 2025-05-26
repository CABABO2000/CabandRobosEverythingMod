package net.cababo2000.cre.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFooditems {
    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(4)
            .fast()
            .alwaysEat()
            .saturationMod(1f)
            .effect(
                    () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 0.99f
            )
            .effect(
                    () -> new MobEffectInstance(MobEffects.HUNGER, 260, 4), 0.20f
            )
            .build();
    public static final FoodProperties PIZZA = new FoodProperties.Builder()
            .nutrition(10)
            .saturationMod(1f)
            .effect(
                    () -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 3), 0.8f
            )
            .effect(
                    () -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1f
            )


            .build();

}
