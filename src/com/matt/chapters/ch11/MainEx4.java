package com.matt.chapters.ch11;

import static com.matt.chapters.ch11.ex4.HeroGen.*;
import static com.matt.myutil.Print.println;

public class MainEx4 {
    public static void main(String[] args){
        for (int i = 0; i < 40; i++) {
            println(i);
            getHeroes();
            println();
        }
    }
}
