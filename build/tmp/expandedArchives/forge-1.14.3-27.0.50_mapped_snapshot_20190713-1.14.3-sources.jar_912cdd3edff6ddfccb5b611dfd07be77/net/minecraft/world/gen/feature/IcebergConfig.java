package net.minecraft.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class IcebergConfig implements IFeatureConfig {
   public final BlockState state;

   public IcebergConfig(BlockState state) {
      this.state = state;
   }

   public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
      return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createString("state"), BlockState.serialize(ops, this.state).getValue())));
   }

   public static <T> IcebergConfig deserialize(Dynamic<T> p_214710_0_) {
      BlockState blockstate = p_214710_0_.get("state").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
      return new IcebergConfig(blockstate);
   }
}