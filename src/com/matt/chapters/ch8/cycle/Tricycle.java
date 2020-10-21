package com.matt.chapters.ch8.cycle;

public class Tricycle extends Bicycle {
    int howFast;

    public Tricycle() {
        howFast = 50;
        ride();
    }

    @Override
    public void ride() {
        System.out.println("Tricycle.ride() on " + name + " " + howFast + " km/h");
    }
}
