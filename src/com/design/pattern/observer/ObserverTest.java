package com.design.pattern.observer;

/**
 * Created by xx on 2017/5/26.
 */
public class ObserverTest {

    public static void main(String[] args){
        Teacher teacher = new Teacher();

        Student stu = new Student();

        teacher.addObserver(stu);
//        teacher.getPhone();
        teacher.setPhone("321321321");
        teacher.setPhone("777777777");
    }
}
