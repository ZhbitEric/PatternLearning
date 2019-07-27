package com.xrd.pattern._02factoryMethodPattern.factory;

import com.xrd.pattern._02factoryMethodPattern.model.GIFPicture;
import com.xrd.pattern._02factoryMethodPattern.model.Picture;

public class GIFPictureFactory implements PictureFactory {
    @Override
    public Picture CreatePicture() {
        return new GIFPicture();
    }
}
