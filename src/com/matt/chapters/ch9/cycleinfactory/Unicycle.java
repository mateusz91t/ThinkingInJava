package com.matt.chapters.ch9.cycleinfactory;

public class Unicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
}
