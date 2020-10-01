package com.matt;

import com.matt.outer.Outer;

public class Main1Outer {
    public static void main(String[] a){
        Outer o1 = new Outer("bla lba");
        Outer.Inner i1 = o1.getInner();
        i1.f();
        System.out.println(i1.getFieldString());
        i1 = o1.new Inner();
    }
}
