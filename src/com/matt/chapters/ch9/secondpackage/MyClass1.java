package com.matt.chapters.ch9.secondpackage;

import com.matt.chapters.ch9.firstpackage.MyInterface;

public class MyClass1 implements MyInterface {
    @Override
    public void f() {
        System.out.println("MyClass1.f()");
    }

    @Override
    public void g() {
        System.out.println("MyClass1.g()");
    }
}
