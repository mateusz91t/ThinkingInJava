package com.matt.chapters.ch8.shapes;

import java.util.Random;

public class RandomShapeGenerator {
    private static Shape next() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Shape();
        }
    }

    public static Shape[] gen(int length) {
        Shape[] shapes = new Shape[length];
        for (int i = 0; i < length; i++) {
            shapes[i] = next();
        }
        return shapes;
    }

    public static void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes)
            shape.draw();
    }
    public static void growShapes(Shape[] shapes) {
        for (Shape shape : shapes)
            shape.grow();
    }
}
