package com.xrd.pattern._03AbstractFactoryPattern.factory;

import com.xrd.pattern._03AbstractFactoryPattern.model.InterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.OperationController;
import com.xrd.pattern._03AbstractFactoryPattern.model.WINInterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.WINOperationController;

public class WINControllerFactory implements ControllerFactory {
    @Override
    public InterfaceController createInterfaceController() {
        return new WINInterfaceController();
    }

    @Override
    public OperationController createOperationController() {
        return new WINOperationController();
    }
}
