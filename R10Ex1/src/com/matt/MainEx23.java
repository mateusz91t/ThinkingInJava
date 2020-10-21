package com.matt;

import com.matt.ex23.A;
import com.matt.ex23.B;
import com.matt.ex23.U;

public class MainEx23 {
    public static void main(String[] args){
        A a1 = new A();
        U u1 = a1.createU();
        U u2 = a1.createU();
        U u3 = a1.createU();
        B b1 = new B(4);
        b1.fillUTab(u1, 0);
        b1.fillUTab(u2, 2);
        b1.fillUTab(u3, 3);
        b1.checkElementsUTab();
        b1.nullUTab(0);
    }
}
