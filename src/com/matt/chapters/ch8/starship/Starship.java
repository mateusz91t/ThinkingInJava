package com.matt.chapters.ch8.starship;

import java.util.Random;

public class Starship {
    Alert[] alert;
    Random random = new Random();
    public Starship(int howLongFlight){
        alert = getAlerts(10);
    }

    private Alert[] getAlerts(int howManyAlerts) {
        Alert[] a = new Alert[howManyAlerts];
        for (int i = 0; i < howManyAlerts; i++) {
            a[i] = getRandomAlert();
        }
        return a;
    }
    private Alert getRandomAlert(){
        switch (random.nextInt(3)){
            case 0: return new Info();
            case 1: return new Warning();
            case 2: return new Alert();
            default: return new Alert();
        }
    }
}
