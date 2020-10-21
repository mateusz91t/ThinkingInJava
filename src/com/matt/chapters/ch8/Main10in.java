package com.matt.chapters.ch8;

import com.matt.chapters.ch8.in.Currency;
import com.matt.chapters.ch8.in.Dollar;

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
