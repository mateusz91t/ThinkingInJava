package com.matt.leniwa;

public class Osoba {
    String imie;
    int wiek;
    Ubranie ubranie;
    Zawod zawod = new Zawod();

    {
        wiek = 4;
        imie = "Imię osoby";
    }

    public String toString() {
        if (ubranie == null)
            ubranie = new Ubranie();
        return
                "na imię: " + imie + " wiek: " + wiek + "\n" +
                        ubranie + "\n" +
                        zawod;
    }
    public Osoba(){
        System.out.println("Nowa Osoba");
    }
}

class Ubranie {
    Rozmiar rozmiar;
    String typ;

    public Ubranie() {
        System.out.println("Nowe ubranie");
        typ = "typ ubrania";
    }

    public String toString() {
        if (rozmiar == null)
            rozmiar = Rozmiar.L;
        return "typ ubrania: " + typ + " w rozmiarze " + rozmiar;
    }
}

enum Rozmiar {
    XS, S, M, L, XL, XXL, X3L
}

class Zawod {
    String nazwa;
    float staz;

    public Zawod() {
        System.out.println("Nowy zawód");
        nazwa = "nazwa zawodu";
        staz = 0;
    }

    public String toString() {
        return nazwa + " w stażu: " + staz;
    }
}