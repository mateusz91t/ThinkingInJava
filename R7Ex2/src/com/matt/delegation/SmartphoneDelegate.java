package com.matt.delegation;

public class SmartphoneDelegate {
    private String name;
    private Features features = new Features();
    public Smartphone smartphone = new Smartphone();

    public SmartphoneDelegate(String name) {
        this.name = name;
    }
    //delegated methods

    public void localization() {
        features.localization();
    }

    public void teleconfereces() {
        features.teleconfereces();
    }

    public void papilarLines() {
        features.papilarLines();
    }

    public void cameras() {
        features.cameras();
    }

    public void g3() {
        features.g3();
    }

    public void g4() {
        features.g4();
    }

    public void g4_5() {
        features.g4_5();
    }

    public void setName(String name) {
        smartphone.setName(name);
    }
}
