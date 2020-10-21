package com.matt.chapters.ch8.starship;

import java.util.Date;

public class Info extends Alert {
    @Override
    public void sendAlert() {
        System.out.println("info:");
        super.sendAlert();
    }
}
