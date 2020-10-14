package com.matt;

import com.matt.ex16cycle.Bicycle;
import com.matt.ex16cycle.Cycles;
import com.matt.ex16cycle.Unicycle;

public class MainEx16Cycles {
    public static void main(String[] args){
        Cycles.rideCycle(Bicycle.cycleFactory);
        Cycles.rideCycle(Unicycle.cycleFactory);
    }
}
