package com.matt.chapters.ch9.gryzon;

public class Hamster extends Rodent {
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
