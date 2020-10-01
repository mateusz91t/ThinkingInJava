package com.matt.starship;

public class Main16Starship {
    /*
    Design pattern
    wzorzec projektowy State Pattern - Thinking in Java, page 264
    kompozycja ze zmianą stanu pola na inny rodzaj podklasy za pomocą metody
    połączona z dziedziczeniem
     */
    public static void main(String[] args){
        Starship s1 = new Starship(5);
        System.out.println();
        Carrier c1 = new Carrier();
        c1.getAlert();
        c1.changeAlert(new Error());
        c1.changeAlert(new Info());
        c1.changeAlert(new Warning());
    }
}
