package com.matt.chapters.ch7.over_l_r;

public class Dog extends Animal {
    String type;

        @Override
    public void run() {
        System.out.println("Could I run in the past?");
        super.run();
    }
    public void run(boolean whatIs){
        System.out.println("My ability of running is " + whatIs);
    }

    @Override
    public int run(int howFast) {
        System.out.println("ONLY RUN " + howFast + " units");
        return 100;
    }
}

class Animal extends Organism {
    String family;

    public void run() {
        System.out.println("I can run");
    }

    public int run(int howFast) {
        System.out.println("I can run with speed " + howFast + " units");
        return howFast;
    }

    public String run(String howRun) {
        System.out.println("I can run like a " + howRun);
        return howRun;
    }

    public void fly() {
        System.out.println("I can fly");
    }
}

class Organism {
    String kind;

    public void divide() {
        System.out.println("I can divide");
    }

    public void move() {
        System.out.println("I can move");
    }

    public int move(int howMuch) {
        System.out.println("I can move " + howMuch + " distance");
        return howMuch;
    }

    public void growUp() {
        System.out.println("I can grow up");
    }
}
