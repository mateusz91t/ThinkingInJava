package com.matt.starship;

public class Carrier {
    Alert alert = new Alert();
    public void changeAlert(Alert alert){
        this.alert = alert;
    }
    public void getAlert(){
        this.alert.sendAlert();
    }
}
