package com.design.pattern.singleton;

/**
 * Created by xx on 2017/5/24.
 * 懒汉模式,（懒汉，线程安全）
 */
public class SingletonSafe {

    private SingletonSafe instance = null;

    private SingletonSafe(){}

    public static synchronized SingletonSafe getInstance(SingletonSafe instance) {
        if (null == instance) {
            instance = new SingletonSafe();
        }
        return instance;
    }

    public static SingletonSafe getInstanceS(SingletonSafe instance) {
        synchronized(SingletonSafe.class){
            if (null == instance) {
                instance = new SingletonSafe();
            }
        }
        return instance;
    }
}
