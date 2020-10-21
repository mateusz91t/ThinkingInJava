package com.matt.chapters.ch9;

import com.matt.chapters.ch9.abconstructor.AC1;
import com.matt.chapters.ch9.abconstructor.AC2;
import com.matt.chapters.ch9.abconstructor.C1;
import com.matt.chapters.ch9.abconstructor.C2;

public class Main2AbConstructor {
    public static void main(String[] args) {
        C1 c1 = new C1();
//        ((C2)c1).f(); // ClassCastException
        C1 c2 = new C2();
        ((C2) c2).f();


        AC1 ac1 = new AC2();
        ((AC2) ac1).g();
    }
}
