package com.matt.chapters.ch7.finaloverr;

public class OClass2 {
    private final void oc2v1(){
        System.out.println("OClass2.oc2v1()");
    }
    public final void oc2v1(String s){
        System.out.println("OClass2.oc2v1() + " + s);
    }
    private void oc2v2(){
        System.out.println("OClass2.oc2v2()");
    }
    protected void oc2v2(String s){
        System.out.println("OClass2.oc2v2() + " + s);
    }
    public final void oc2v3(){
        System.out.println("OClass2.oc2v3()");
    }
}