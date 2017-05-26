package com.design.pattern.singleton;

/**
 * Created by xx on 2017/5/24.
 * 静态内部类
 */
public class SingletonStaticInner {

    private static class SingletonHolder{
        private static final SingletonStaticInner INSTANCE = new SingletonStaticInner();
    }


    private SingletonStaticInner(){}

    public static SingletonStaticInner getInstance(SingletonStaticInner instance) {
        return SingletonHolder.INSTANCE;
    }
}
