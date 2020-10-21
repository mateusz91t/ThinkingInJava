package com.matt.chapters.ch10;

import com.matt.chapters.ch10.ex16cycle.Bicycle;
import com.matt.chapters.ch10.ex16cycle.Cycles;
import com.matt.chapters.ch10.ex16cycle.Unicycle;

public class MainEx16Cycles {
    public static void main(String[] args){
        Cycles.rideCycle(Bicycle.cycleFactory);
        Cycles.rideCycle(Unicycle.cycleFactory);
    }
}
