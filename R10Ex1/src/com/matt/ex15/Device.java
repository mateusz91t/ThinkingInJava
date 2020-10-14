package com.matt.ex15;

public class Device {
    public int getHowManyProcessors(){
        return howManyProcessors;
    }

    int howManyProcessors;

    public Device(int howManyProcessors) {
        this.howManyProcessors = howManyProcessors;
        System.out.println("Constructor Device(int hMP)");
    }
}
