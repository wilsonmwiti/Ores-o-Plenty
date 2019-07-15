package com.huihuiz.oresoplenty.setup;

import com.huihuiz.oresoplenty.blocks.ModBlocks;
import com.huihuiz.oresoplenty.items.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("oresoplenty"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.RUBYBLOCK);
        }
    };

    public IItemTier tool_RUBY = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 512;
        }

        @Override
        public float getEfficiency() {
            return 7.0F;
        }

        @Override
        public float getAttackDamage() {
            return 2.5F;
        }

        @Override
        public int getHarvestLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 12;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(new IItemProvider[]{ModItems.RUBY});
        }
    };

    public IArmorMaterial armor_RUBY = new IArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlotType equipmentSlotType) {
            return 512;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType) {
            if(equipmentSlotType.equals(EquipmentSlotType.HEAD)) return 2;
            if(equipmentSlotType.equals(EquipmentSlotType.CHEST)) return 6;
            if(equipmentSlotType.equals(EquipmentSlotType.LEGS)) return 8;
            if(equipmentSlotType.equals(EquipmentSlotType.FEET)) return 2;
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 12;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(new IItemProvider[]{ModItems.RUBY});
        }

        @Override
        public String getName() {
            return "oresoplenty:ruby";
        }

        @Override
        public float getToughness() {
            return 1.0F;
        }
    };

    public void init(){
    }
}
