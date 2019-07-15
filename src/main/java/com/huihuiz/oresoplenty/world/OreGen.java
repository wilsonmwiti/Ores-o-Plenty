package com.huihuiz.oresoplenty.world;

import com.huihuiz.oresoplenty.blocks.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

public class OreGen {
    private static final CountRangeConfig RUBY = new CountRangeConfig(20, 5, 5, 32);
    private static final int RUBY_VEINSIZE = 5;

    public static void setupOreGeneration() {
        for (BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
                biomeEntry.biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        ModBlocks.RUBYORE.getDefaultState(), RUBY_VEINSIZE), Placement.COUNT_RANGE, RUBY));
            }
        }
    }
/*
    public static void setupNetherOreGeneration() {
        if (IaniteOreConfig.enableTritaniumOre) {
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                    IaniteBlocks.tritanium_ore.getDefaultState(), TRITANIUM_VEINSIZE), Placement.COUNT_RANGE, TRITANIUM));
        }
    }
    */
}