package com.xrd.pattern._04SingletonPattern;

/**
 * 饿汉模式
 */
public class EagerSingletonPattern {

    private static final EagerSingletonPattern instance = new EagerSingletonPattern();

    private EagerSingletonPattern(){};

    public static EagerSingletonPattern getInstance(){
        return instance;
    }
}
