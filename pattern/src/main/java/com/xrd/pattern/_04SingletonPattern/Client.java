package com.xrd.pattern._04SingletonPattern;

public class Client {
    public static void main(String[] args) {
        EagerSingletonPattern eager_1 = EagerSingletonPattern.getInstance();
        EagerSingletonPattern eager_2 = EagerSingletonPattern.getInstance();
        if(eager_1==eager_2){
            System.out.println("eager一样");
        }

        LazySingletonPattern lazy_1 = LazySingletonPattern.getLazySingletonPattern();
        LazySingletonPattern lazy_2 = LazySingletonPattern.getLazySingletonPattern();
        if (lazy_1==lazy_2){
            System.out.println("lazy一样");
        }

        IoDHSingletonPattern ioDH_1 = IoDHSingletonPattern.getInstance();
        IoDHSingletonPattern ioDH_2 = IoDHSingletonPattern.getInstance();
        if (ioDH_1==ioDH_2){
            System.out.println("IoDH一样");
        }
    }
}
