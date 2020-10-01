package com.matt;

import com.matt.cycle.Bicycle;
import com.matt.cycle.Cycle;
import com.matt.cycle.Tricycle;
import com.matt.cycle.Unicycle;

public class Main1 {
    public static void main(String[] args) {
        //region Constructors
//        Bicycle b1 = new Bicycle();
////        b1.ride();
//        Tricycle t1 = new Tricycle();
////        t1.ride();
//        Cycle c1 = new Bicycle();
//        Cycle c2 = new Tricycle();
//        Bicycle b2 = new Tricycle();
////        c1.ride();
////        c2.ride();
        //endregion

        //region downcasting
        Cycle[] ct1 = {
                new Cycle(),
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
//        ct1[0].balance(); //Cannot resolve method balance() in Cycle
//        ((Bicycle)ct1[1]).balance(); //ClassCastException
        ((Unicycle)ct1[1]).balance();
        ((Bicycle)ct1[2]).balance();
        ((Tricycle)ct1[3]).balance();
        ((Bicycle)ct1[3]).balance();
//        ((Unicycle)ct1[3]).balance(); //ClassCastException

        //endregion
    }
}
