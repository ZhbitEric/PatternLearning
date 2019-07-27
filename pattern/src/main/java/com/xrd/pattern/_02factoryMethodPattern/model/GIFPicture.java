package com.xrd.pattern._02factoryMethodPattern.model;

public class GIFPicture implements Picture {
    @Override
    public void readPicture() {
        System.out.println("读取GIF图片");
    }
}
