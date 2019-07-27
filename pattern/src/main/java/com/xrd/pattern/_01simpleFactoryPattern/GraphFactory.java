package com.xrd.pattern._01simpleFactoryPattern;

public class GraphFactory {

    public static Graph getGraph(String type) throws Exception {
        Graph graph =null;
        if (type.equalsIgnoreCase("circle")){
            graph = new Circle();
            System.out.println("初始化设置圆形");
        }else if (type.equalsIgnoreCase("square")){
            graph = new Square();
            System.out.println("初始化设置正方形");
        }else {
            throw new Exception("UnSupportedShapeException");
        }
        return graph;
    }
}
