package com.xrd.pattern._03AbstractFactoryPattern.model;

public class IOSInterfaceController implements InterfaceController {
    @Override
    public void gameFace() {
        System.out.println("IOS平台的游戏界面控制");
    }
}
