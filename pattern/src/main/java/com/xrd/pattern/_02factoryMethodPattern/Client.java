package com.xrd.pattern._02factoryMethodPattern;

import com.xrd.pattern._02factoryMethodPattern.factory.PictureFactory;
import com.xrd.pattern._02factoryMethodPattern.model.Picture;

public class Client {
    public static void main(String[] args) {
        PictureFactory pictureFactory = (PictureFactory) XMLUtil.getBean();
        Picture picture = pictureFactory.CreatePicture();
        picture.readPicture();
    }
}
