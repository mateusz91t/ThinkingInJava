package com.matt.upcasting;

public class Frog extends Amphibian {

    public static void move(Amphibian map){System.out.println("gogogo");}
    public static void eat(Amphibian amp){System.out.println("mniam");}
    private String nameFrog;

    public String getNameFrog() {
        return nameFrog;
    }

    public void setNameFrog(String nameFrog) {
        this.nameFrog = nameFrog;
    }
}

