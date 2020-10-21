package com.matt.chapters.ch6;
import static com.matt.chapters.ch6.util.Printer.*;
import static com.matt.chapters.ch6.debugoff.DebugClass.*;

public class Main {
    public static void main(String[] args) {
        //region MyPackagesUtil
        String s = "jabada";
        int i = 10;
        Integer in = 15;
        boolean b = true;
        Levels lvl1 = Levels.EASY;
        println(s);
        println(i);
        println(in);
        println();
        println(b);
        println(lvl1);
        print(lvl1);
        print(lvl1);
        println();
//        Vector v1 = new Vector();
        //endregion

        //region Multipackages
        debug("siema com.debugoff");
        com.matt.chapters.ch6.debug.DebugClass.debug("siema com.debug");
        //endregion

        //region Access
        Class1 c1 = new Class1();
        c1.i = 5; c1.s = "łańcuch";
        //endregion
    }
}

enum Levels {
    EASY, MEDIUM, HARD, IMPOSSIBLE
}

class Class1{
    int i;
    protected String s;
    private boolean b;
    public double d;
}
