package com.matt;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class RunClass {
    public static void main(String[] params) {
        //region Aliasing
        println("Aliasing");
        AliasingClass ac1 = new AliasingClass();
        AliasingClass ac2 = ac1;
        ac1.fieldFloat = 3.47f;
        println(ac1.fieldFloat + " " + ac2.fieldFloat);
        ac1.fieldFloat -= 2.65f;
        println(ac1.fieldFloat + " " + ac2.fieldFloat);
        ac2.fieldFloat *= 3.47f;
        println(ac1.fieldFloat + " " + ac2.fieldFloat);
        //endregion
        //region AliasingRefChar
        println("AliasingRefChar");
        NewChar cn1 = new NewChar();
        cn1.myChar = 'a';
        println(cn1.myChar);
        ChangeChar.ChangeChar(cn1);
        println(cn1.myChar);
        //endregion
        //region Speed
        println("Speed");
        Speed s1 = new Speed(1500, 10);
        s1.printSpeed();
        //endregion
        //region DogClass
        println("Dogs");
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "Hau";
        scruffy.name = "scruffy";
        scruffy.says = "Wrr";
        spot.dajGlos();
        scruffy.dajGlos();
        Dog d1 = spot;
        Dog d2 = new Dog();
        d2.name = "spot";
        d2.says = "Hau";

        System.out.println();
        System.out.println("== vs equals");
        System.out.println(d1.equals(spot));
        System.out.println(d1 == spot);
        System.out.println(d1.says.equals(spot.says));
        System.out.println(d1.says == spot.says);
        System.out.println("not copy ref");
        System.out.println(d2.equals(spot));
        System.out.println(d2 == spot);
        System.out.println(d2.says.equals(spot.says));
        System.out.println(d2.says == spot.says);
        //endregion
        //region RzucanieMoneta
        System.out.println();
        System.out.println("throwing a coin");
        Moneta m1 = new Moneta();
        m1.rzut();
        m1.rzut(10);
        //endregion
        //region 16&8
        System.out.println();
        System.out.println("16&8");
        long l1 = 100l;
        long l2 = 200L;
        long l3 = 0466;
        long l4 = 0xffffff;
        long[] lt1 = {l1, l2, l3, l4, 0x2f};
        for (int i = 0; i < lt1.length; i++) {
            System.out.println(lt1[i]);
            System.out.println(Long.toBinaryString(lt1[i]));
        }
        //endregion
        //region Wykladniczy
        System.out.println();
        System.out.println("Wykladniczy");
        float fMax = Float.MAX_VALUE;
        float fMin = Float.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        double dMin = Double.MIN_VALUE;
        System.out.println("fMin = " + fMin);
        System.out.println("fMax = " + fMax);
        System.out.println("dMin = " + dMin);
        System.out.println("dMax = " + dMax);
        float fMin2 = 1.4e-45f;
        double dMin2 = 4.9e-324;
        System.out.println(fMin2 - 0.1f);
        System.out.println(dMin2 - 0.1);
        //endregion
        //region BinaryOperators
        System.out.println();
        System.out.println("BinaryOperators");
        int i1 = Integer.parseInt("0101010100", 2);
        int i2 = Integer.parseInt("0101010101", 2);
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("&");
        System.out.println(Integer.toBinaryString(i1 & i2));
        System.out.println(Integer.toBinaryString(i2 & i1));
        System.out.println("|");
        System.out.println(Integer.toBinaryString(i1 | i2));
        System.out.println(Integer.toBinaryString(i2 | i1));
        System.out.println("^");
        System.out.println(Integer.toBinaryString(i1 ^ i2));
        System.out.println(Integer.toBinaryString(i2 ^ i1));
        //endregion
        //region ShiftBits
        System.out.println();
        System.out.println("ShiftBits");
        Bits biMaxInt1 = new Bits(Integer.MAX_VALUE);
        Bits biMinInt1 = new Bits(Integer.MIN_VALUE);
        Random rand1 = new Random(40);
        Bits bir1 = new Bits(rand1.nextInt(10000));
        Bits bir2 = new Bits(rand1.nextInt(10000));
        biMaxInt1.prn();
        biMinInt1.prn();
        System.out.println();
        bir1.prn();
        bir2.prn();
        Bits.prn(bir1.i & bir2.i);
        Bits.prn(bir1.i | bir2.i);
        Bits.prn(bir1.i ^ bir2.i);
        System.out.println("suma i iloczyn b1 i b2");
        System.out.println(bir1.i + bir2.i);
        System.out.println(bir1.i * bir2.i);

        System.out.println();
        int i3 = 0x7FFFFEFF;
        biMaxInt1.prn();
        Bits.prn(i3);
        biMaxInt1.prn();
        Bits.prn(~i3);
        biMaxInt1.prn();

        System.out.println();
        Bits.prn(i3);
        Bits.prn(i3 >> 5);
        Bits.prn(i3 >>> 5);
        Bits.prn(i3 << 5);

        System.out.println();
        int i4 = ~0x7FFFFFFF;
        Bits.prn(i4);
        for (int i = 0; i < Integer.toBinaryString(i4).length(); i++){
            Bits.prn(i4 >> i);
        }
        System.out.println();
        int i5 = 0x7FFFFFFF;
        Bits.prn(i5);
        for (int i = 0; i < Integer.toBinaryString(i4).length(); i++){
            Bits.prn(i4 >>> i);
        }
        //endregion
        //region CharToBinaryClass
        System.out.println();
        System.out.println("CharToBinaryClass");
        char[] ct1 = {20, 'e', 100, 5, '5', 127, 0, 128, 65535};
        CharToBinary.chToB(ct1);
        //endregion
    }
}

class AliasingClass {
    float fieldFloat;
}

class NewChar {
    char myChar;
}

class ChangeChar {
    static void ChangeChar(NewChar newChar) {
        newChar.myChar = '@';
    }
}

class Speed {
    double distance;
    int hours;

    public Speed() {
    }

    public Speed(double distance, int hours) {
        this.distance = distance;
        this.hours = hours;
    }

    void printSpeed() {
        System.out.println(distance / hours);
    }
}

class Dog {
    String name;
    String says;

    void dajGlos() {
        println(says);
    }
}

class Moneta {
    static Random rand = new Random();
    boolean strona;

    void rzut() {
        strona = rand.nextBoolean();
        System.out.println(strona);
    }

    void rzut(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++)
            rzut();
    }
}

class Bits {
    int i;

    public Bits() {
    }

    public Bits(int i) {
        this.i = i;
    }

    void prn() {
        System.out.println(Integer.toBinaryString(i) + " = " + i);
    }

    static void prn(int i) {
        System.out.println(Integer.toBinaryString(i) + " = " + i);
    }
}

class CharToBinary{
    char aChar;
    void chToB(){
        System.out.println();
    }
    static void chToB(char[] chars){
        for(int i = 0; i < chars.length; i++)
        System.out.println(chars[i] + "\t = " + (int)chars[i] + "\t = " + Integer.toBinaryString(chars[i]));
    }
}