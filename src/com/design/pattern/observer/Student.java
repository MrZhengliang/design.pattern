package com.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 学生作为观察者
 * Created by xx on 2017/5/26.
 */
public class Student implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        String phone = arg.toString();
        System.out.print(this.getClass().getSimpleName()+",观察:"+o.getClass().getSimpleName()+"的手机状态;");
        System.out.println("老师手机更换:"+phone);
    }
}
