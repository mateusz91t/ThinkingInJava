package com.matt.chapters.ch9.cycleinfactory;

public class Cycles {
    public static void cycling(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
    }
}
