package com.matt.chapters.ch6.util;

public class TabFiller {
    public static int[] fillTab(int length){
        int[] resultTab = new int[length];
        for (int i = 0; i < length; i++) {
            resultTab[i] = i;
        }
        return resultTab;
    }

}
