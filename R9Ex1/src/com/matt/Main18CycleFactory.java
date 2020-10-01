package com.matt;

import com.matt.cycleinfactory.*;

public class Main18CycleFactory {
    public static void main(String[] args){
        Cycles.cycling(new BicycleFactory());
        Cycles.cycling(new UnicycleFactory());
    }
}
