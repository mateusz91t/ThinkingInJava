package com.matt.ex16cycle;

public class Cycles {
    public static void rideCycle(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.ride();
    }
}

interface Cycle {
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
}
