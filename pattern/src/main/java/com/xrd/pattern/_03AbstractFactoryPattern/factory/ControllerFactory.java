package com.xrd.pattern._03AbstractFactoryPattern.factory;

import com.xrd.pattern._03AbstractFactoryPattern.model.InterfaceController;
import com.xrd.pattern._03AbstractFactoryPattern.model.OperationController;

public interface ControllerFactory {

    InterfaceController createInterfaceController();

    OperationController createOperationController();
}
