package com.matt.chapters.ch9;

import com.matt.chapters.ch9.processor.Apply;
import com.matt.chapters.ch9.processor.ex11.MyClassEx11;

public class MainEx11 {
    public static void main(String[] args){
        MyClassEx11 mce1 = new MyClassEx11();
        String s1 = "0123456789";
        System.out.println(mce1.f(s1));

        Apply.process(mce1, s1);
    }
}
