package com.matt.chapters.ch6;
import static com.matt.chapters.ch6.util.Printer.println;

public class Class2 extends Class1 {
    public static void main(String[] args){
        Class1 c1 = new Class1();
        c1.s = "łańcuszek";
        c1.i = 22;
        println(c1.i + " " + c1.s);
    }
}
