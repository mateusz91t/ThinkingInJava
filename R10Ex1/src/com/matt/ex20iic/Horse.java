package com.matt.ex20iic;

public class Horse implements ICanRun {
    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + ".run()");
    }

    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.run();
        ICanRun h2 = new Horse();
        h2.run();
        ICanRun.Running.invokeRunning(h2);
        ICanRun.Running.invokeRunning(h1);
    }
}

interface ICanRun {
    void run();

    static class Running {
        double speed;

        static void invokeRunning(ICanRun icr) {
            icr.run();
        }
    }
}