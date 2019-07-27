package com.xrd.pattern._02factoryMethodPattern.model;

public class JPGPicture implements Picture {
    @Override
    public void readPicture() {
        System.out.println("读取JPG图片");
    }
}
