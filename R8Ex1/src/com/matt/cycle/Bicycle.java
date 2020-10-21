package com.matt.cycle;

public class Bicycle extends Cycle {
    String name;

    public Bicycle() {
        name = "Fast&Furious";
        ride();
    }

    @Override
    public void ride() {
        System.out.println("Bicycle.ride() on " + name);
    }

    public void balance() {
        System.out.println("Bicycle balance...");
    }
}
