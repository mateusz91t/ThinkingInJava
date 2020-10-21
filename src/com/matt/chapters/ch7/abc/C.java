package com.matt.chapters.ch7.abc;

class A {
    boolean ab;
    public A() {
        System.out.println("created A");
    }
    public A(boolean ab) {
        System.out.println("created A boolean");
        this.ab=ab;
    }
    void dispose(){
        System.out.println("Delete A");
    }
}

class B {
    int bi;
    public B() {
        System.out.println("created B");
    }
    public B(int bi) {
        System.out.println("created B int");
        this.bi=bi;
    }
    void dispose(){
        System.out.println("Delete B");
    }
}

public class C extends A {
    String cs;
    B b = new B();
    public C() {
        System.out.println("created C");
    }
    public C(String cs, boolean ab) {
        super(ab);
        System.out.println("created C String");
        this.cs=cs;
    }

    @Override
    public void dispose() {
        System.out.println("Delete C");
        b.dispose();
        super.dispose();
    }
}
