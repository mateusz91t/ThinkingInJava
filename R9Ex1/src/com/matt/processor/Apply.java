package com.matt.processor;

public class Apply {
    public static void process(Processor proc, Object obj){
        System.out.println("I'm using " + proc.name() + " processor");
        System.out.println(proc.process(obj));
    }
}
