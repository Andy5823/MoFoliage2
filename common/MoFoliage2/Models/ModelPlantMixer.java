package MoFoliage2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlantMixer extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Top;
    ModelRenderer Bottom;
    ModelRenderer BottomLayer2;
    ModelRenderer BottomLayer3;
    ModelRenderer BottomLayer4;
  
  public ModelPlantMixer()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 12, 15, 12);
      Base.setRotationPoint(-6F, 9F, -6F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 52, 0);
      Top.addBox(0F, 0F, 0F, 10, 1, 10);
      Top.setRotationPoint(-5F, 8F, -5F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Bottom = new ModelRenderer(this, 0, 28);
      Bottom.addBox(0F, 0F, 0F, 16, 1, 16);
      Bottom.setRotationPoint(-8F, 23F, -8F);
      Bottom.setTextureSize(128, 128);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      BottomLayer2 = new ModelRenderer(this, 0, 29);
      BottomLayer2.addBox(0F, 0F, 0F, 15, 1, 15);
      BottomLayer2.setRotationPoint(-7.5F, 22.5F, -7.5F);
      BottomLayer2.setTextureSize(128, 128);
      BottomLayer2.mirror = true;
      setRotation(BottomLayer2, 0F, 0F, 0F);
      BottomLayer3 = new ModelRenderer(this, 0, 30);
      BottomLayer3.addBox(0F, 0F, 0F, 14, 1, 14);
      BottomLayer3.setRotationPoint(-7F, 22F, -7F);
      BottomLayer3.setTextureSize(128, 128);
      BottomLayer3.mirror = true;
      setRotation(BottomLayer3, 0F, 0F, 0F);
      BottomLayer4 = new ModelRenderer(this, 0, 31);
      BottomLayer4.addBox(0F, 0F, 0F, 13, 1, 13);
      BottomLayer4.setRotationPoint(-6.5F, 21.5F, -6.5F);
      BottomLayer4.setTextureSize(128, 128);
      BottomLayer4.mirror = true;
      setRotation(BottomLayer4, 0F, 0F, 0F);
  }
  
  public void renderModel(float f1)
  {
      Base.render(f1);
      Top.render(f1);
      Bottom.render(f1);
      BottomLayer2.render(f1);
      BottomLayer3.render(f1);
      BottomLayer4.render(f1);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Base.render(f5);
    Top.render(f5);
    Bottom.render(f5);
    BottomLayer2.render(f5);
    BottomLayer3.render(f5);
    BottomLayer4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    //super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }
}
