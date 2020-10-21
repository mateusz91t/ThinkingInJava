package com.matt.ex16cycle;

public class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
    public static CycleFactory cycleFactory = Bicycle::new;
}
