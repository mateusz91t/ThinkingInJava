// {CompileTimeError}
package com.matt.chapters.ch5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("tab of ints");
        int[] it1 = new int[4];
        System.out.println(it1[2]);
        for (int i : it1) {
            System.out.println(i);
        }

        System.out.println("tab of Integers");
        Integer[] integerT1 = new Integer[5];
        for (Integer integer : integerT1) {
            System.out.println(integer);
        }

        System.out.println();
        integerT1[3] = new Integer(5);
        integerT1[2] = 21;
        System.out.println(integerT1[3]);

        System.out.println();
        ArraysClass.printArray(it1);
        ArraysClass.fillIntArray(integerT1);
        System.out.println();
        ArraysClass.printArray((Object[]) integerT1);
        System.out.println();
        ArraysClass.printArray((Object[]) integerT1);
        System.out.println();
        ArraysClass.printArray((Object) new int[]{1, 2, 3, 4});
        System.out.println();
        ArraysClass.printArray((Object[]) new Integer[]{1, 2, 3, 4});

        System.out.println();
        System.out.println("Enums...");
        ArraysClass.printString("abc","cde","efg");
        ArraysClass.printString(new String[]{"abc","cde","efg"});
        System.out.println();
        System.out.println(Levels.class);
        System.out.println(Levels.values());
        System.out.println(Levels.valueOf("HARD"));
        System.out.println(Levels.IMPOSSIBLE);
        System.out.println();
        EnumClass.printEnums();

        System.out.println();
        Game g1 = new Game(Levels.IMPOSSIBLE);
        Levels l1 = Levels.EASY;
        Game g2 = new Game(l1);
        g2.whatLevel();
        g1.whatLevel();
    }
}

class ArraysClass {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " " + obj.getClass() + "; ");
        }
    }

    static void fillIntArray(Integer[] ints) {
        Random random = new Random(47);
//        for (int i: ints) {
//            i = random.nextInt(5000);
//        }
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(5000);
        }

    }

    static void printString(String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    static void main(String... args){
        for (String s : args) {
            System.out.println(s);
        }
    }
}

enum Levels{
    EASY, MEDIUM, HARD, IMPOSSIBLE
}

class EnumClass {
    static void printEnums(){
        for (Levels lvl: Levels.values()) {
            System.out.println(lvl.ordinal() + ": " + lvl);
        }
    }
}

class Game{
    Levels level;
    public Game(Levels lvl){
        this.level=lvl;
    }
    void whatLevel(){
        System.out.println("Your lvl is:");
        switch (level){
            case EASY: System.out.println("lvl for losers...");
            break;
            case MEDIUM: System.out.println("quite easy");
            break;
            case HARD: System.out.println("not easy, it is a game!");
            break;
            case IMPOSSIBLE: System.out.println("it is too hard!");
            break;
            default: System.out.println("what is it?");
        }
    }
}