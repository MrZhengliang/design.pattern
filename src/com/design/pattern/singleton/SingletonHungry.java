package com.design.pattern.singleton;

/**
 * Created by xx on 2017/5/24.
 * 饿汉模式
 */
public class SingletonHungry {

    private SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(SingletonHungry instance) {
        return instance;
    }
}
