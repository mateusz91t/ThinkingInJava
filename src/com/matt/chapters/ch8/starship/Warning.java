package com.matt.chapters.ch8.starship;

import java.util.Date;

public class Warning extends Alert {
    @Override
    public void sendAlert(){
        System.out.println("Warning:");
        super.sendAlert();
    }
}
