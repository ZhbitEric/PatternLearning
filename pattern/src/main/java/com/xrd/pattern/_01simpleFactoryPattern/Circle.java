package com.xrd.pattern._01simpleFactoryPattern;

public class Circle implements Graph {
    @Override
    public void draw() {
        System.out.println("绘制一个圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个圆形");
    }
}
