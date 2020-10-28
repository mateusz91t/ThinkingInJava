package com.matt.chapters.ch11.test;

import java.util.ArrayList;

import static com.matt.myutil.Print.println;

public class ApplesAndOranges {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //program wysypie się na tym:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            println(((Apple) apples.get(i)).getId());
        }
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long getId() {
        return id;
    }
}

//nie wysypie się jeśli Orange będzie podobne do Apple
class Orange /* extends Apple */ {
}
