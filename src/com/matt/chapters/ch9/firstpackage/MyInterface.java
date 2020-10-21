package com.matt.chapters.ch9.firstpackage;

public interface MyInterface {
    void f();

    void g();

    int MY_INT = 2;

    default void h(){
        System.out.println("MyInterface.h()");
    }

    static void i(){
        System.out.println("MyInterface.i()");
    }
}
