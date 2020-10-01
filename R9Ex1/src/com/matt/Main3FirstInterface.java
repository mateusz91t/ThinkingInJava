package com.matt;

import com.matt.firstpackage.MyInterface;
import com.matt.secondpackage.MyClass1;

public class Main3FirstInterface {
    public static void main(String[] args){
        MyInterface mi1 = new MyClass1();
        mi1.f();
        mi1.h();
        MyInterface.i();
//        MyClass1.myInt = 3;
        System.out.println(MyInterface.MY_INT);
        System.out.println(MyClass1.MY_INT);
    }
}
