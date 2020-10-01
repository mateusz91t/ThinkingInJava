package com.matt.seqselector;

public class ClassWithString {
    String string;

    public ClassWithString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "ClassWithString{" + "string='" + string + '\'' + '}';
    }
}
