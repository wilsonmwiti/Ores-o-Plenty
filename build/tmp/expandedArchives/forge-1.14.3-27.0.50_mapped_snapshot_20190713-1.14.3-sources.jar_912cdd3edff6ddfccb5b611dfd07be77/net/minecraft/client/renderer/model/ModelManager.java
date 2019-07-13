package net.minecraft.client.renderer.model;

import java.util.Map;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.resources.ReloadListener;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelManager extends ReloadListener<ModelBakery> {
   private Map<ResourceLocation, IBakedModel> modelRegistry = new java.util.HashMap<>();
   private final AtlasTexture texMap;
   private final BlockModelShapes modelProvider;
   private IBakedModel defaultModel;

   public ModelManager(AtlasTexture textures) {
      this.texMap = textures;
      this.modelProvider = new BlockModelShapes(this);
   }

   public IBakedModel getModel(ModelResourceLocation modelLocation) {
      return this.modelRegistry.getOrDefault(modelLocation, this.defaultModel);
   }

   public IBakedModel getMissingModel() {
      return this.defaultModel;
   }

   public BlockModelShapes getBlockModelShapes() {
      return this.modelProvider;
   }

   // TODO
   //@Override
   public net.minecraftforge.resource.IResourceType getResourceType() {
      return net.minecraftforge.resource.VanillaResourceType.MODELS;
   }

   /**
    * Performs any reloading that can be done off-thread, such as file IO
    */
   protected ModelBakery prepare(IResourceManager resourceManagerIn, IProfiler profilerIn) {
      profilerIn.startTick();
      net.minecraftforge.client.model.ModelLoader modelbakery = new net.minecraftforge.client.model.ModelLoader(resourceManagerIn, this.texMap, profilerIn);
      profilerIn.endTick();
      return modelbakery;
   }

   protected void apply(ModelBakery splashList, IResourceManager resourceManagerIn, IProfiler profilerIn) {
      profilerIn.startTick();
      profilerIn.startSection("upload");
      splashList.func_217844_a(profilerIn);
      this.modelRegistry = splashList.func_217846_a();
      this.defaultModel = this.modelRegistry.get(ModelBakery.MODEL_MISSING);
      net.minecraftforge.client.ForgeHooksClient.onModelBake(this, this.modelRegistry, (net.minecraftforge.client.model.ModelLoader) splashList);
      profilerIn.endStartSection("cache");
      this.modelProvider.reloadModels();
      profilerIn.endSection();
      profilerIn.endTick();
   }
}