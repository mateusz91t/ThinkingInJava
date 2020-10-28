package com.matt.chapters.ch11.test;

import java.util.ArrayList;

import static com.matt.myutil.Print.println;

public class ApplesAndOranges2 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //teraz program nie skompiluje się
//        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            println(apples.get(i).getId());
        }
    }
}