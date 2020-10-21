package com.matt.chapters.ch8.shapes;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void grow() {
        System.out.println("Circle.grow()");
    }
}
