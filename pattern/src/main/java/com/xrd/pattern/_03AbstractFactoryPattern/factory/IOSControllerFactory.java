package com.xrd.pattern._03AbstractFactoryPattern.factory;

import com.xrd.pattern._03AbstractFactoryPattern.model.IOSInterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.IOSOperationController;
import com.xrd.pattern._03AbstractFactoryPattern.model.InterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.OperationController;

public class IOSControllerFactory implements ControllerFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new IOSInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new IOSOperationController();
    }
}
