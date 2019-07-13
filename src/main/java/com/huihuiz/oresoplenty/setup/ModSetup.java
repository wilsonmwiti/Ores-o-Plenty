package com.huihuiz.oresoplenty.setup;

import com.huihuiz.oresoplenty.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("tutorial"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModBlocks.RUBYBLOCK);
        }
    };

    public void init(){

    }
}
