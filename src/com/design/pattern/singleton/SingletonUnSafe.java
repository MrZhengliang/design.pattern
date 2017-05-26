package com.design.pattern.singleton;

/**
 * 懒汉模式,（懒汉，线程不安全）
 */
public class SingletonUnSafe {

    private SingletonUnSafe instance = null;

    private SingletonUnSafe(){}

    public static SingletonUnSafe getInstance(SingletonUnSafe instance) {
        if (null == instance) {
            instance = new SingletonUnSafe();
        }
        return instance;
    }

}
