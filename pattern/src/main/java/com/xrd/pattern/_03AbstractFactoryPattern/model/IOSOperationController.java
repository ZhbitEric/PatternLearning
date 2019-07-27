package com.xrd.pattern._03AbstractFactoryPattern.model;

public class IOSOperationController implements OperationController {
    @Override
    public void operation() {
        System.out.println("IOS平台的操作");
    }
}
