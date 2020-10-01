package com.matt.finalC;

import java.util.Random;

public class ClassFinal {
    static Random random = new Random(47);
    public static final int S_F_I = random.nextInt();

    public int getfI() {
        return fI;
    }

    final int fI = random.nextInt();
}
