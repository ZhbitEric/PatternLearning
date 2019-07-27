package com.xrd.pattern._01simpleFactoryPattern;

public class Square implements Graph {
    @Override
    public void draw() {
        System.out.println("绘制一个正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个正方形");
    }
}
