package com.design.pattern.observer;


import java.util.Observable;

/**
 * 观察者模式
 * 老师作为被观察者对象
 * Created by xx on 2017/5/26.
 */
public class Teacher extends Observable {

    private String phone;

    public Teacher(){
    }

    public Teacher(String phone){
        this.phone = phone;
    }

    public String getPhone() {
//        this.notifyObservers(phone);
//        System.out.println("老师原手机号:"+phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        this.setChanged();
        this.notifyObservers(phone);
    }
}
