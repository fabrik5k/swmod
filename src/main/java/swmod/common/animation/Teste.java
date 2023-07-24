package swmod.common.animation;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Teste extends AnimatedGeoModel {
    private static final ResourceLocation modelResource = new ResourceLocation(GeckoLib.ModID, "geo/jack.geo.json");
    private static final ResourceLocation textureResource = new ResourceLocation(GeckoLib.ModID, "textures/item/jack.png");
    private static final ResourceLocation animationResource = new ResourceLocation(GeckoLib.ModID, "animations/jackinthebox.animation.json");

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return modelResource;
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return textureResource;
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return animationResource;
    }

}
