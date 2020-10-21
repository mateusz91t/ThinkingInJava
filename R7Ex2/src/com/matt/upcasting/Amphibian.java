package com.matt.upcasting;

public class Amphibian {
//    public void move(){System.out.println("go");}
//    public void eat(){System.out.println("omnomnom");}
    public static void move(Amphibian amp){System.out.println("go");}
    public static void eat(Amphibian amp){System.out.println("omnomnom");}
    private String nameAmf;

    public String getNameAmf() {
        return nameAmf;
    }

    public void setNameAmf(String nameAmf) {
        this.nameAmf = nameAmf;
    }
}
