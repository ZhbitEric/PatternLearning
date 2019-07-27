package com.xrd.pattern._04SingletonPattern;

/**
 * IoDH技术实现 延时加载的单例模式
 * 使用成员内部类实现
 */
public class IoDHSingletonPattern {
    private IoDHSingletonPattern(){}

    private static class HolderClass{
        private final static IoDHSingletonPattern instance = new IoDHSingletonPattern();
    }

    public static IoDHSingletonPattern getInstance(){
        return HolderClass.instance;
    }
}
