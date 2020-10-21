package com.matt.chapters.ch8;

import com.matt.chapters.ch8.shapes.RandomShapeGenerator;
//import com.matt.shapes.RectangleS;
import com.matt.chapters.ch8.shapes.Shape;

public class Main2Shapes {
    public static void main(String[] args){
        Shape[] sh1 = RandomShapeGenerator.gen(10);
        RandomShapeGenerator.drawShapes(sh1);
        System.out.println();
        RandomShapeGenerator.growShapes(sh1);
//        RectangleS r1 = new RectangleS();
    }
}
