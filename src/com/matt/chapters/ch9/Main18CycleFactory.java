package com.matt.chapters.ch9;

import com.matt.chapters.ch9.cycleinfactory.*;

public class Main18CycleFactory {
    public static void main(String[] args){
        Cycles.cycling(new BicycleFactory());
        Cycles.cycling(new UnicycleFactory());
    }
}
