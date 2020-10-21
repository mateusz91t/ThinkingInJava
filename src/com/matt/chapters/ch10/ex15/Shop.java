package com.matt.chapters.ch10.ex15;

public class Shop {
    public Device buyDevice(int howManyProcessors) {
        return new Device(howManyProcessors) {};
    }
}
