package com.matt;

public class Main {

    public static void main(String[] args) {
        Point p1;
        Point p2 = new Point();
        p1 = p2;
        System.out.println(p1.name);
        System.out.println(p1.pa);
        String s1 = null;
        System.out.println(s1);
    }
}

class Point{
    int pa;
    int pb;
    String name;
}