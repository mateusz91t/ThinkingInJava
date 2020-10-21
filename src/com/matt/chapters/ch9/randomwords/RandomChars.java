package com.matt.chapters.ch9.randomwords;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

public class RandomChars implements Readable {
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "aąbcćdeęfghijklłmnoóprsśtuvwxyzźż".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();

    private int count;

    Random rand = new Random();

    public RandomChars(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if(count-- == 0)
            return -1;
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < rand.nextInt(6); i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 1;
    }
}
