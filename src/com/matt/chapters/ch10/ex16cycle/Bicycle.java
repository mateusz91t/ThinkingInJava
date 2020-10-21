package com.matt.chapters.ch10.ex16cycle;

public class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
    public static CycleFactory cycleFactory = Bicycle::new;
}
