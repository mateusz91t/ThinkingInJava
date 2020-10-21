package com.matt.chapters.ch6.nextpack;

import com.matt.chapters.ch6.Class2;
import com.matt.chapters.ch6.pack1.Widget;

public class Class3 {
    public static void main(String[] args) {
        Class2 c2 = new Class2();
//        c2.b = true;
//        c2.i = 25;
//        c2.s = "tekst";
        c2.d = 23.9d;
        Widget widget = new Widget();
    }
    Widget widget;
    protected String name;
    protected int age;
    protected double weight;
}