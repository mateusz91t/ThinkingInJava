package com.matt.chapters.ch9.gryzon;

public class Mouse extends Rodent {
    @Override
    public void sound() {
        System.out.println("piii pi pi pi!");
    }

    @Override
    public void move() {
        System.out.println("Mouse is going...");
        sound();
    }
}
