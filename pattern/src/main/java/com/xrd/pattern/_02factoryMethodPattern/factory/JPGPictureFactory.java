package com.xrd.pattern._02factoryMethodPattern.factory;

import com.xrd.pattern._02factoryMethodPattern.model.JPGPicture;
import com.xrd.pattern._02factoryMethodPattern.model.Picture;

public class JPGPictureFactory implements PictureFactory{
    @Override
    public Picture CreatePicture() {
        return new JPGPicture();
    }
}
