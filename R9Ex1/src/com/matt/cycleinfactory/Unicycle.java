package com.matt.cycleinfactory;

public class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
}
