package com.huihuiz.oresoplenty.setup;

import com.huihuiz.oresoplenty.OresOPlenty;
import com.huihuiz.oresoplenty.blocks.ModBlocks;
import com.huihuiz.oresoplenty.items.ModItems;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvents;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("tutorial"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.RUBYBLOCK);
        }
    };

    public IItemTier tier_RUBY = new IItemTier() {
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

    public void init(){

    }
}
