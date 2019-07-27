package com.xrd.pattern._01simpleFactoryPattern;

public class TestDemo {

    public static void main(String[] args) throws Exception {
        Graph graph;
        String type = XMLUtil.getChartType();
        graph = GraphFactory.getGraph(type);
        graph.draw();
        graph.erase();
    }
}
