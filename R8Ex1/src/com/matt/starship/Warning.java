package com.matt.starship;

import java.util.Date;

public class Warning extends Alert {
    @Override
    public void sendAlert(){
        System.out.println("Warning:");
        super.sendAlert();
    }
}
