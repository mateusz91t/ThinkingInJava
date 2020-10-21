package com.matt.chapters.ch8.in;

public class Dollar extends Currency{
    public Dollar(){
        System.out.println("Dollar created");
    }
    @Override
    public void getMoney() {
        System.out.println("Dollar.getMoney()");
    }
}
