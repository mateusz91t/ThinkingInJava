package com.matt.chapters.ch8.cars;

public class Car {
    public static void wheels(){
        System.out.println(Wheels.counter);
    }
    public Car() {
        System.out.println("Created Car");
        wheels.trueRef();
    }

    Wheels wheels = new Wheels();
    Hood hood = new Hood();

    void dispose() {
        System.out.println("Car.dispose()");
        hood.dispose();
        wheels.dispose();
    }

    @Override
    protected void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}

class Hood {
    String type;

    public Hood() {
        type = "standard";
        System.out.println("created Hood");
    }

    void dispose() {
        System.out.println("Hood.dispose()");
    }
}

class Wheels {
    static long counter = 0;
    private boolean ref;
    private int howMany;

    public Wheels() {
        howMany = 0;
        counter++;
        System.out.println("Created Wheels");
    }

    void trueRef() {
        this.ref = true;
    }

    void dispose() {
        System.out.println("Wheels.dispose()");
        ref = false;
        counter--;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!ref) {
            System.out.println("finalize done");
            super.finalize();
        } else
            System.out.println("finalize error");
    }
}
