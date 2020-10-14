package com.matt.ex16cycle;

public class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
    public static CycleFactory cycleFactory = () -> new Unicycle();
}
