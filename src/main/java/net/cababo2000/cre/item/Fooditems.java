package net.cababo2000.cre.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
public class Fooditems {
    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(4).fast().alwaysEat().saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.99f).build();

}
