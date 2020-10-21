package com.matt.chapters.ch4;

public class CharsFrom {
    static void printChars(char from, int howMany){
        for (char c = from; c <= from + howMany; c++){
            System.out.println("char " + c + " = int " + (int)c);
        }
    }
}
