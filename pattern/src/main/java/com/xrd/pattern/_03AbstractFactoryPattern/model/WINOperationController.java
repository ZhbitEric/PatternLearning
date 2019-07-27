package com.xrd.pattern._03AbstractFactoryPattern.model;

public class WINOperationController implements OperationController {
    @Override
    public void operation() {
        System.out.println("WIN平台的操作");
    }
}
