package com.matt.chapters.ch9.abconstructor;

public class Downcaster {
    public static void downcast1(C1 c1) {
        ((C2) c1).f();
    }

    public static void downcast1(AC1 ac1) {
        ((AC2) ac1).g();
    }
}
