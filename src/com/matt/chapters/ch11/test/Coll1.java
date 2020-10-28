package com.matt.chapters.ch11.test;

import java.util.*;

public class Coll1 {
    Integer[] t1 = {1,2,3};
    List<Integer> l1 = Arrays.asList(t1);
    List<Integer> l2 = Arrays.asList(4,5,6);
    //brak add w List
//    l2.add(0);
    Collection<Integer> c1 = Arrays.asList(t1);
    Collection<Integer> c2 = Arrays.asList(4,5,6);
    //brak add w Collection
//    c2.add(0);

    List<Snow> s1 = Arrays.asList(new Snow(), new Rain() );

    List<Snow> s2 = new ArrayList<>();

    //brak takiej metody w tej wersji?
//    Collections.addAll(s2, new Snow(), new Snow());
}

class Snow {}
class Rain extends Snow{}