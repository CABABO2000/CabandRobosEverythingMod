// Bleeding.java
package net.cababo2000.cre.effect;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;

import java.util.Random;

public class Bleeding extends MobEffect {
    private static final ResourceKey<DamageType> OUT_OF_WORLD_KEY =
            ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("minecraft", "out_of_world"));

    public Bleeding() {
        super(MobEffectCategory.HARMFUL, 0x770606);
    }

    protected Bleeding(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.level().isClientSide() && entity.level() instanceof ServerLevel serverLevel) {
            var damageTypeHolder = serverLevel.registryAccess()
                    .registryOrThrow(Registries.DAMAGE_TYPE)
                    .getHolderOrThrow(OUT_OF_WORLD_KEY);

            DamageSource damageSource = new DamageSource(damageTypeHolder);
            entity.hurt(damageSource, 1F * amplifier); // Scale with level
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        // Apply every 20 ticks (1 second)
        return duration % 10 == 0;
    }
}

