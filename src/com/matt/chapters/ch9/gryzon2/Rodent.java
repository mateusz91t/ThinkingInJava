package com.matt.chapters.ch9.gryzon2;

import java.util.Random;

public interface Rodent {
    void sound();

    void move();

    static Rodent[] getRodents(int howMany) {
        Rodent[] r = new Rodent[howMany];
        for (int i = 0; i < howMany; i++) {
            r[i] = getRandomRodent();
        }
        return r;
    }

    static Rodent getRandomRodent() {
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0:
                return new Mouse();
            case 1:
                return new Hamster();
            default:
                return null;
        }
    }

    static void moveAllRodents(Rodent[] rodents) {
        for (Rodent rodent :
                rodents) {
            rodent.move();
        }
    }
}
