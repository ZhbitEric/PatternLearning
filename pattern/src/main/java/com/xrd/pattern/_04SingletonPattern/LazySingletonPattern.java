package com.xrd.pattern._04SingletonPattern;

/**
 * 懒汉模式
 */
public class LazySingletonPattern {
    private volatile static LazySingletonPattern instance = null;

    private LazySingletonPattern() {
    }


    public static LazySingletonPattern getLazySingletonPattern() {
        if (instance == null) {
            synchronized (LazySingletonPattern.class) {
                if (instance == null) {
                    instance = new LazySingletonPattern();
                }
            }
        }
        return instance;
    }
}
