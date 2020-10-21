package com.matt.chapters.ch10;

import com.matt.chapters.ch10.ex15.Device;
import com.matt.chapters.ch10.ex15.Shop;

public class MainEx15 {
    public static void main(String[] args){
        Shop s1 = new Shop();
        Device d1 = s1.buyDevice(5);
        System.out.println(d1.getHowManyProcessors());
    }
}
