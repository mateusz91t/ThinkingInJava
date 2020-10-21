package com.matt.chapters.ch7;

import com.matt.chapters.ch7.finalC.ClassFinal;
import com.matt.chapters.ch7.finalNull.CFinalUninitialized;
import com.matt.chapters.ch7.finalargs.CFArgs;
import com.matt.chapters.ch7.finaloverr.OClass1;
import com.matt.chapters.ch7.finaloverr.OClass2;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(ClassFinal.S_F_I);
        ClassFinal cf1 = new ClassFinal();
        System.out.println(ClassFinal.S_F_I);
        System.out.println(cf1.getfI());

        System.out.println();
        ClassFinal cf2 = new ClassFinal();
        System.out.println(ClassFinal.S_F_I);
        System.out.println(cf2.getfI());

        System.out.println();
        CFinalUninitialized cfu1 = new CFinalUninitialized(1, 2, "variable - zmienna, value - wartość");
        System.out.println(cfu1.getVd1() + " " + cfu1.getVi1() + " " + cfu1.getVs1());
//        cfu1.vi1 = 2;

        System.out.println();
        cfu1.getIc();

        System.out.println();
        System.out.println(CFArgs.fa(20));
        System.out.println(CFArgs.faw(30));

        System.out.println();
        OClass1 oc1 = new OClass1();
        OClass2 oc2 = new OClass1();
        oc1.oc2v1();
        oc1.oc2v2("łańcuch");
        oc1.oc2v3();
        oc2.oc2v3();
        oc1.oc2v1("łańcuszek");
    }
}
