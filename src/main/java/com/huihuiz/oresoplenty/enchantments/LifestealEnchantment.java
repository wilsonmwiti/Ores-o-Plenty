package com.huihuiz.oresoplenty.enchantments;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;

public class LifestealEnchantment extends Enchantment {

    public LifestealEnchantment() {
        super(Rarity.COMMON, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
        setRegistryName("oresoplenty","lifesteal");
    }

    public int getMinEnchantability(int enchantmentLevel) {
        return 1 + (enchantmentLevel - 1) * 11;
    }

    public int func_223551_b(int p_223551_1_) {
        return this.getMinEnchantability(p_223551_1_) + 20;
    }

    public int getMaxLevel() {
        return 5;
    }

    public boolean canApplyTogether(Enchantment enchantment) {
        return !(enchantment instanceof LifestealEnchantment);
    }

    public boolean canApply(ItemStack itemStack) {
        return itemStack.getItem() instanceof AxeItem ? true : super.canApply(itemStack);
    }

    public void onEntityDamaged(LivingEntity entity, Entity target, int level) {
        ClientPlayerEntity player = Minecraft.getInstance().player;
        player.setHealth(player.getHealth()+(0.5F*(level+1)));

    }
}

