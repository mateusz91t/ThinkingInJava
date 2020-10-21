package com.matt.chapters.ch7.ex7;

public class NextClass extends BaseClass {

    public NextClass(int i) {
        super(i);
    }
    public NextClass() {
        super(2);
    }
}

class BaseClass {
    int i;

    public BaseClass(int i) {
        this.i = i;
    }
}