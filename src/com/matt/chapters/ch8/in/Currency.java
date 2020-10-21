package com.matt.chapters.ch8.in;

public class Currency {
    public Currency(){
        System.out.println("Currency created");
    }
    public void sell(){
        System.out.println("Currency.sell()");
        getMoney();
    }
    public void getMoney(){
        System.out.println("Currency.getMoney()");
    }
}
