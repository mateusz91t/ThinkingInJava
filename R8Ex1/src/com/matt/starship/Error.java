package com.matt.starship;

public class Error extends Alert {
    @Override
    public void sendAlert() {
        System.out.println("ERROR:");
        super.sendAlert();
    }
}
