package MoFoliage2.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGreenHouse extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Pole1;
    ModelRenderer Pole2;
    ModelRenderer Pole3;
    ModelRenderer Pole4;
    ModelRenderer Top;
    ModelRenderer Glass1;
    ModelRenderer Glass2;
    ModelRenderer Glass3;
    ModelRenderer Glass4;
    ModelRenderer Top2;
    ModelRenderer GlassLeft;
    ModelRenderer GlassLeft2;
    ModelRenderer TopLeft;
    ModelRenderer GlassRight;
    ModelRenderer GlassRight2;
    ModelRenderer TopRight;
    ModelRenderer GlassFront;
    ModelRenderer GlassFront2;
    ModelRenderer TopFront;
    ModelRenderer GlassBack;
    ModelRenderer GlassBack2;
    ModelRenderer TopBack;
  
    public ModelGreenHouse()
    {
        textureWidth = 256;
        textureHeight = 128;
        
          Base = new ModelRenderer(this, 0, 0);
          Base.addBox(0F, 0F, 0F, 16, 1, 16);
          Base.setRotationPoint(-8F, 23F, -8F);
          Base.setTextureSize(256, 128);
          Base.mirror = true;
          setRotation(Base, 0F, 0F, 0F);
          Pole1 = new ModelRenderer(this, 0, 20);
          Pole1.addBox(0F, 0F, 0F, 1, 13, 1);
          Pole1.setRotationPoint(6F, 11F, -7F);
          Pole1.setTextureSize(256, 128);
          Pole1.mirror = true;
          setRotation(Pole1, 0F, 0F, 0F);
          Pole2 = new ModelRenderer(this, 0, 20);
          Pole2.addBox(0F, 0F, 0F, 1, 13, 1);
          Pole2.setRotationPoint(-7F, 11F, -7F);
          Pole2.setTextureSize(256, 128);
          Pole2.mirror = true;
          setRotation(Pole2, 0F, 0F, 0F);
          Pole3 = new ModelRenderer(this, 0, 20);
          Pole3.addBox(0F, 0F, 0F, 1, 13, 1);
          Pole3.setRotationPoint(-7F, 11F, 6F);
          Pole3.setTextureSize(256, 128);
          Pole3.mirror = true;
          setRotation(Pole3, 0F, 0F, 0F);
          Pole4 = new ModelRenderer(this, 0, 20);
          Pole4.addBox(0F, 0F, 0F, 1, 13, 1);
          Pole4.setRotationPoint(6F, 11F, 6F);
          Pole4.setTextureSize(256, 128);
          Pole4.mirror = true;
          setRotation(Pole4, 0F, 0F, 0F);
          Top = new ModelRenderer(this, 128, 0);
          Top.addBox(0F, 0F, 0F, 12, 1, 12);
          Top.setRotationPoint(-6F, 9F, -6F);
          Top.setTextureSize(256, 128);
          Top.mirror = true;
          setRotation(Top, 0F, 0F, 0F);
          Glass1 = new ModelRenderer(this, 12, 20);
          Glass1.addBox(0F, 0F, 0F, 1, 12, 12);
          Glass1.setRotationPoint(6F, 11F, -6F);
          Glass1.setTextureSize(256, 128);
          Glass1.mirror = true;
          setRotation(Glass1, 0F, 0F, 0F);
          Glass2 = new ModelRenderer(this, 12, 20);
          Glass2.addBox(0F, 0F, 0F, 1, 12, 12);
          Glass2.setRotationPoint(-7F, 11F, -6F);
          Glass2.setTextureSize(256, 128);
          Glass2.mirror = true;
          setRotation(Glass2, 0F, 0F, 0F);
          Glass3 = new ModelRenderer(this, 43, 20);
          Glass3.addBox(0F, 0F, 0F, 12, 12, 1);
          Glass3.setRotationPoint(-6F, 11F, -7F);
          Glass3.setTextureSize(256, 128);
          Glass3.mirror = true;
          setRotation(Glass3, 0F, 0F, 0F);
          Glass4 = new ModelRenderer(this, 43, 20);
          Glass4.addBox(0F, 0F, 0F, 12, 12, 1);
          Glass4.setRotationPoint(-6F, 11F, 6F);
          Glass4.setTextureSize(256, 128);
          Glass4.mirror = true;
          setRotation(Glass4, 0F, 0F, 0F);
          Top2 = new ModelRenderer(this, 83, 0);
          Top2.addBox(0F, 0F, 0F, 14, 1, 1);
          Top2.setRotationPoint(-7F, 10F, -8F);
          Top2.setTextureSize(256, 128);
          Top2.mirror = true;
          setRotation(Top2, 0F, 0F, 0F);
          GlassLeft = new ModelRenderer(this, 12, 46);
          GlassLeft.addBox(0F, 0F, 0F, 2, 12, 1);
          GlassLeft.setRotationPoint(6F, 11F, 6F);
          GlassLeft.setTextureSize(256, 128);
          GlassLeft.mirror = true;
          setRotation(GlassLeft, 0F, 0F, 0F);
          GlassLeft2 = new ModelRenderer(this, 12, 46);
          GlassLeft2.addBox(0F, 0F, 0F, 2, 12, 1);
          GlassLeft2.setRotationPoint(6F, 11F, -7F);
          GlassLeft2.setTextureSize(256, 128);
          GlassLeft2.mirror = true;
          setRotation(GlassLeft2, 0F, 0F, 0F);
          TopLeft = new ModelRenderer(this, 71, 0);
          TopLeft.addBox(0F, 0F, 0F, 1, 1, 14);
          TopLeft.setRotationPoint(7F, 10F, -7F);
          TopLeft.setTextureSize(256, 128);
          TopLeft.mirror = true;
          setRotation(TopLeft, 0F, 0F, 0.0174533F);
          GlassRight = new ModelRenderer(this, 12, 46);
          GlassRight.addBox(0F, 0F, 0F, 2, 12, 1);
          GlassRight.setRotationPoint(-8F, 11F, 6F);
          GlassRight.setTextureSize(256, 128);
          GlassRight.mirror = true;
          setRotation(GlassRight, 0F, 0F, 0F);
          GlassRight2 = new ModelRenderer(this, 12, 46);
          GlassRight2.addBox(0F, 0F, 0F, 2, 12, 1);
          GlassRight2.setRotationPoint(-8F, 11F, -7F);
          GlassRight2.setTextureSize(256, 128);
          GlassRight2.mirror = true;
          setRotation(GlassRight2, 0F, 0F, 0F);
          TopRight = new ModelRenderer(this, 71, 0);
          TopRight.addBox(0F, 0F, 0F, 1, 1, 14);
          TopRight.setRotationPoint(-8F, 10F, -7F);
          TopRight.setTextureSize(256, 128);
          TopRight.mirror = true;
          setRotation(TopRight, 0F, 0F, 0F);
          GlassFront = new ModelRenderer(this, 12, 46);
          GlassFront.addBox(0F, 0F, 0F, 1, 12, 2);
          GlassFront.setRotationPoint(6F, 11F, -8F);
          GlassFront.setTextureSize(256, 128);
          GlassFront.mirror = true;
          setRotation(GlassFront, 0F, 0F, 0F);
          GlassFront2 = new ModelRenderer(this, 12, 46);
          GlassFront2.addBox(0F, 0F, 0F, 1, 12, 2);
          GlassFront2.setRotationPoint(-7F, 11F, -8F);
          GlassFront2.setTextureSize(256, 128);
          GlassFront2.mirror = true;
          setRotation(GlassFront2, 0F, 0F, 0F);
          TopFront = new ModelRenderer(this, 68, 0);
          TopFront.addBox(0F, 0F, 0F, 14, 1, 14);
          TopFront.setRotationPoint(-7F, 10F, -7F);
          TopFront.setTextureSize(256, 128);
          TopFront.mirror = true;
          setRotation(TopFront, 0F, 0F, 0F);
          GlassBack = new ModelRenderer(this, 12, 46);
          GlassBack.addBox(0F, 0F, 0F, 1, 12, 2);
          GlassBack.setRotationPoint(6F, 11F, 6F);
          GlassBack.setTextureSize(256, 128);
          GlassBack.mirror = true;
          setRotation(GlassBack, 0F, 0F, 0F);
          GlassBack2 = new ModelRenderer(this, 12, 46);
          GlassBack2.addBox(0F, 0F, 0F, 1, 12, 2);
          GlassBack2.setRotationPoint(-7F, 11F, 6F);
          GlassBack2.setTextureSize(256, 128);
          GlassBack2.mirror = true;
          setRotation(GlassBack2, 0F, 0F, 0F);
          TopBack = new ModelRenderer(this, 82, 0);
          TopBack.addBox(0F, 0F, 0F, 14, 1, 1);
          TopBack.setRotationPoint(7F, 10F, 8F);
          TopBack.setTextureSize(256, 128);
          TopBack.mirror = true;
          setRotation(TopBack, 0F, 3.141593F, 0F);
    }
  
  public void renderModel(float f1, boolean isLeft, boolean isRight, boolean isForward, boolean isBackward)
  {
      //TopFront and Top2 were misnamed and needed to be reversed
      Base.render(f1);
      Top.render(f1);
      TopFront.render(f1);
      
      if(!isForward && !isLeft)
          Pole1.render(f1);
      
      if(!isForward && !isRight)
          Pole2.render(f1);
      
      if(!isBackward && !isRight)
          Pole3.render(f1);
      
      if(!isBackward && !isLeft)
          Pole4.render(f1);
      
      
      if(!isLeft)
          Glass1.render(f1);
      
      if(!isRight)
          Glass2.render(f1);
      
      if(!isForward)
          Glass3.render(f1);
      
      if(!isBackward)
          Glass4.render(f1);
      
      
      if(isLeft)
      {
          GlassLeft.render(f1);
          GlassLeft2.render(f1);
          TopLeft.render(f1);
      }
      
      if(isRight)
      {
          GlassRight.render(f1);
          GlassRight2.render(f1);
          TopRight.render(f1); 
      }
      
      
      if(isForward)
      {
          GlassFront.render(f1);
          GlassFront2.render(f1);
          Top2.render(f1);
      }
      
      if(isBackward)
      {
          GlassBack.render(f1);
          GlassBack2.render(f1);
          TopBack.render(f1);
      }
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Base.render(f5);
    Pole1.render(f5);
    Pole2.render(f5);
    Pole3.render(f5);
    Pole4.render(f5);
    Top.render(f5);
    Glass1.render(f5);
    Glass2.render(f5);
    Glass3.render(f5);
    Glass4.render(f5);
    Top2.render(f5);
    GlassLeft.render(f5);
    GlassLeft2.render(f5);
    TopLeft.render(f5);
    GlassRight.render(f5);
    GlassRight2.render(f5);
    TopRight.render(f5);
    GlassFront.render(f5);
    GlassFront2.render(f5);
    TopFront.render(f5);
    GlassBack.render(f5);
    GlassBack2.render(f5);
    TopBack.render(f5);
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
