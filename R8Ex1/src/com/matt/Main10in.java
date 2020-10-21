package com.matt;

import com.matt.in.Currency;
import com.matt.in.Dollar;

public class Main10in {
    public static void main(String[] args) {
        Dollar d1 = new Dollar();
        d1.sell();

        System.out.println();
        Currency c1 = new Dollar();
        System.out.println(c1.getClass());
        c1.sell();
    }
}
