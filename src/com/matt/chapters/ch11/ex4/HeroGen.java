package com.matt.chapters.ch11.ex4;

import java.util.*;

import static com.matt.myutil.Print.*;

public class HeroGen {
    private static String[] heroTab2 = {"Gandalf", "Aragorn", "Boromir", "Legolas",
            "Faramir", "Theoden", "Eomer", "Eowina", "Frodo", "Sam", "Pippin", "Merry",
            "Drzewiec", "Orzeł", "Ent", "Orzeł", "Ent", "Lurtz"};
    private static String[] heroTab = {"Gandalf", "Aragorn", "Boromir"};
    private static ArrayList<String> heroArrayList = new ArrayList<>(Arrays.asList(heroTab));
    private static LinkedList<String> heroLinkedList = new LinkedList<>();
    private static HashSet<String> heroHashSet = new HashSet<>();
    private static LinkedHashSet<String> heroLinkedHashSet = new LinkedHashSet<>();
    private static TreeSet<String> heroTreeSet = new TreeSet<>();
    private static int counterArrayList = 0;
    private static int counterLinkedList = 0;
    private static Iterator<String> iteratorHashSet;
    private static Iterator<String> iteratorLinkedHashSet;
    private static Iterator<String> iteratorTreeSet;

    static {
        Collections.addAll(heroLinkedList, heroTab);
        Collections.addAll(heroHashSet, heroTab);
        Collections.addAll(heroLinkedHashSet, heroTab);
        Collections.addAll(heroTreeSet, heroTab);
        iteratorHashSet = heroHashSet.iterator();
        iteratorLinkedHashSet = heroLinkedHashSet.iterator();
        iteratorTreeSet = heroTreeSet.iterator();
    }

    static String getHeroFromArrayList() {
        if (counterArrayList == heroTab.length)
            counterArrayList = 0;
        counterArrayList++;
        return heroArrayList.get(counterArrayList - 1);
    }

    static String getHeroFromLinkedList() {
        if (counterLinkedList == heroTab.length)
            counterLinkedList = 0;
        counterLinkedList++;
        return heroLinkedList.get(counterLinkedList - 1);
    }

    static String getHeroFromHashSet() {
        if (!iteratorHashSet.hasNext())
            iteratorHashSet = heroHashSet.iterator();
        return iteratorHashSet.next();
    }

    static String getHeroFromLinkedHashSet() {
        if (!iteratorLinkedHashSet.hasNext())
            iteratorLinkedHashSet = heroLinkedHashSet.iterator();
        return iteratorLinkedHashSet.next();
    }

    static String getHeroFromTreeSet() {
        if (!iteratorTreeSet.hasNext())
            iteratorTreeSet = heroTreeSet.iterator();
        return iteratorTreeSet.next();
    }

    public static void getHeroes() {
        println(getHeroFromArrayList());
        println(getHeroFromLinkedList());
        println(getHeroFromHashSet());
        println(getHeroFromLinkedHashSet());
        println(getHeroFromTreeSet());
    }
}
