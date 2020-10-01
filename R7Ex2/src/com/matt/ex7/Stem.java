package com.matt.ex7;

public class Stem extends Root {
    public Stem() {
        System.out.println("created Stem");
    }
}

class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    {
        component1 = new Component1();
        component2 = new Component2();
        component3 = new Component3();
    }

    public Root() {
        System.out.println("created Root");
    }
}

class Component1 {
    public Component1() {
        System.out.println("created Component1");
    }
}

class Component2 {
    public Component2() {
        System.out.println("created Component2");
    }

}

class Component3 {
    public Component3() {
        System.out.println("created Component3");
    }

}