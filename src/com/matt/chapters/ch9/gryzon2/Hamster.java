package com.matt.chapters.ch9.gryzon2;

public class Hamster implements Rodent {
    @Override
    public void sound() {
        System.out.println("strzy strzyyyyy... szszsz...");
    }

    @Override
    public void move() {
        System.out.println("Hamster is going...");
        sound();
    }
}
