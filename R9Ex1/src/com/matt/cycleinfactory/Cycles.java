package com.matt.cycleinfactory;

public class Cycles {
    public static void cycling(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
    }
}
