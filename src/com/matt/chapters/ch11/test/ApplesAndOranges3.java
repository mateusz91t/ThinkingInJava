package com.matt.chapters.ch11.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.matt.myutil.Print.println;

public class ApplesAndOranges3 {
    public static void main(String[] args) {
        Set<Apple> apples = new HashSet<>();
        Apple a1 = new Apple();
        for (int i = 0; i < 3; i++) {
            apples.add(a1);
        }
        //teraz program nie skompiluje się
//        apples.add(new Orange());
        for (Apple a :
                apples) {
            println(a.getId());
        }
    }
}