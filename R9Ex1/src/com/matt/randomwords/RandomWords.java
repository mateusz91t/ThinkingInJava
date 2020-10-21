package com.matt.randomwords;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class RandomWords implements Readable {
    private static Random rand = new Random();
    private static final char[] capitals =
            "AĄBCĆDEĘFGHIJKLŁMNOÓPRSŚTUVWXYZŹŻ".toCharArray();
    private static final char[] lowers =
            "aąbcćdeęfghijklłmnoóprsśtuvwxyzźż".toCharArray();
    private static final char[] vowels =
            "aąeęcćioóu".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < rand.nextInt(10); i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 1;
    }
}
