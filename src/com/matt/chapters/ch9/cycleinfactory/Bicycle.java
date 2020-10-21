package com.matt.chapters.ch9.cycleinfactory;

public class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
}
