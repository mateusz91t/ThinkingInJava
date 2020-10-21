package com.matt.gryzon;

import java.util.Random;

public abstract class Rodent {
    public abstract void sound();

    public abstract void move();
    public static Rodent[] getRodents(int howMany){
        Rodent[] r = new Rodent[howMany];
        for (int i = 0; i < howMany; i++) {
            r[i] = getRandomRodent();
        }
        return r;
    }

    private static Rodent getRandomRodent() {
        Random random = new Random();
        switch (random.nextInt(2)){
            case 0: return new Mouse();
            case 1: return new Hamster();
            default: return null;
        }
    }

    public static void moveAllRodents(Rodent[] rodents){
        for (Rodent rodent :
                rodents) {
            rodent.move();
        }
    }
}
