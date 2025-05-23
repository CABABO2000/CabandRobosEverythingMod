package net.cababo2000.cre.enchantment;

import net.cababo2000.cre.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class Serrations extends Enchantment {
    protected Serrations(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide() && pTarget instanceof LivingEntity livingentity) {

            if(pLevel == 1) {
                    livingentity.addEffect(new MobEffectInstance(ModEffects.BLEEDING.get(), 25, 1));
                    livingentity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 80, 1));
            }
            if(pLevel == 2) {
                    livingentity.addEffect(new MobEffectInstance(ModEffects.BLEEDING.get(), 45, 2));
                    livingentity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 2));
            }
            if(pLevel == 3) {
                    livingentity.addEffect(new MobEffectInstance(ModEffects.BLEEDING.get(), 65, 3));
                    livingentity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 120, 3));
            }
        }

        super.doPostAttack(pAttacker, pTarget, pLevel);

    }

    @Override
    public int getMinCost(int pLevel) {
        return 16 + (pLevel - 1) * 20;
    }

    @Override
    public int getMaxCost(int pLevel) {
        return 55;
    }

    public boolean canEnchant(ItemStack pStack) {
        return pStack.getItem() instanceof TridentItem || ((!super.canEnchant(pStack) || !(pStack.getItem() instanceof AxeItem)) && super.canEnchant(pStack));
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
