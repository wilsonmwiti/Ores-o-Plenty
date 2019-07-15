package com.huihuiz.oresoplenty.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {

    public RubyBlock(){
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(4f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.METAL));
        setRegistryName("oresoplenty","rubyblock");
    }

}
