package com.matt.chapters.ch9.cycleinfactory;

public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }

    @Override
    public void ride() {
        System.out.println(this.getClass().getSimpleName() + ".ride()");
    }
}
