package com.huihuiz.oresoplenty.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {

    public RubyOre(){
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(3f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE));
        setRegistryName("oresoplenty","rubyore");
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 5 : 0;
    }
}
