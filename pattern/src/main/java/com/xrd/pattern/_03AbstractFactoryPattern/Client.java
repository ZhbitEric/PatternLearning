package com.xrd.pattern._03AbstractFactoryPattern;

import com.xrd.pattern._03AbstractFactoryPattern.factory.ControllerFactory;
import com.xrd.pattern._03AbstractFactoryPattern.model.InterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.OperationController;

public class Client {
    public static void main(String[] args) {
       ControllerFactory controllerFactory = (ControllerFactory) XMLUtil.getBean();
        InterfaceController interfaceController = controllerFactory.createInterfaceController();
        OperationController operationController = controllerFactory.createOperationController();

        interfaceController.gameFace();
        operationController.operation();


    }
}
