package com.matt;

import com.matt.outer.Outer;

public class Main1Outer {
    public static void main(String[] a){
        Outer o1 = new Outer("bla lba");
        Outer.Inner i1 = o1.getInner();
        i1.f();
        System.out.println(i1.getFieldString());
        i1 = o1.new Inner();
        i1.setInneri(15);
        System.out.println(i1.getInneri());

        System.out.println();

        System.out.println(o1.getInner());
        System.out.println(o1.getOuteri());
    }
}
