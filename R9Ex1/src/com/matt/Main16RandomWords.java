package com.matt;

import com.matt.randomwords.RandomChars;
import com.matt.randomwords.RandomWords;

import java.util.Scanner;

public class Main16RandomWords {
    public static void main(String[] ards) {
        //region RewriteScanner
        Scanner s = new Scanner(new RandomWords(20));
        while (s.hasNext())
            System.out.println(s.next());
        //endregion

        System.out.println();
        System.out.println();
        System.out.println();

        //region MyScanner
        RandomChars rc1 = new RandomChars(20);
        Scanner scanner1 = new Scanner(rc1);
        while (scanner1.hasNext())
            System.out.println(scanner1.next());
        //endregion
    }
}
