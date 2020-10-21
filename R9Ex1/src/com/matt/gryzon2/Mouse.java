package com.matt.gryzon2;

public class Mouse implements Rodent {
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
