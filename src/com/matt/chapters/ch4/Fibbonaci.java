package com.matt.chapters.ch4;

public class Fibbonaci {
    int i;
    static void FiboTo(int howManySteps){
        int Fib1 = 0, Fib2 = 1, FibTmp = Fib2 ;
        for (int i = 1; i <= howManySteps; i++){
            Fib2 +=Fib1;
            Fib1 = FibTmp;
            FibTmp = Fib2;
            System.out.println(Fib2);
        }
    }
}
