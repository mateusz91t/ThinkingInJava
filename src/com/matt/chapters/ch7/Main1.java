package com.matt.chapters.ch7;

import com.matt.chapters.ch7.abc.C;
import com.matt.chapters.ch7.delegation.SmartphoneDelegate;
import com.matt.chapters.ch7.ex7.Stem;
import com.matt.chapters.ch7.over_l_r.Dog;
import com.matt.chapters.ch7.upcasting.Amphibian;
import com.matt.chapters.ch7.upcasting.Frog;

public class Main1 {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = new C("tekst",true);

        System.out.println();
        Stem s1 = new Stem();

        System.out.println();
        SmartphoneDelegate sd1 = new SmartphoneDelegate("Huawei P10 Lite");
        sd1.cameras();
        sd1.g4();
        sd1.teleconfereces();
        sd1.smartphone.setName("P10 Lite");

        System.out.println();
        c1.dispose();

        System.out.println();
        Dog d1 = new Dog();
        d1.divide();
        d1.run();
        d1.run(true);
        d1.run(20);
        d1.run("very fast");

        System.out.println();
        Frog f1 = new Frog();
        System.out.println(f1.getClass());
        System.out.println(((Amphibian)f1).getClass());
        System.out.println();

        Amphibian.eat(f1);
        Frog.eat(f1);

        Amphibian amp1 = new Amphibian();
        Amphibian amp2 = new Frog();
        amp2.setNameAmf("jestem amfibianem");
    }
}
