package com.matt.chapters.ch8.starship;

import java.time.LocalDateTime;

public class Alert {
    String descripion;
    LocalDateTime dateTime;
    public Alert(){
        this.dateTime = LocalDateTime.now();
        this.descripion = "Destription of alert... ";
        sendAlert();
    }
    public void sendAlert(){
        System.out.println(dateTime + ": " + descripion);
    }
}
