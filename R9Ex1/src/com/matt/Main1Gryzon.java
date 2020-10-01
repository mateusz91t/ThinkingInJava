package com.matt;

import com.matt.abconstructor.AC1;
import com.matt.gryzon.Rodent;

public class Main1Gryzon {
    public static void main(String[] args) {
        //region Ex1CommonAbstractClass
        Rodent[] rt1 = Rodent.getRodents(10);
        Rodent.moveAllRodents(rt1);
        //endregion

        //region Ex2EmpyAmstract
        System.out.println();
        System.out.println();
        AC1 ac1 = new AC1() {};

        System.out.println(ac1.getClass());
        //endregion
    }
}
