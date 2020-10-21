package com.matt.chapters.ch7.finaloverr;

public class OClass1 extends OClass2 {
    @Override
    public void oc2v2(String s) {
        System.out.print("From OClass1: ");
        super.oc2v2(s);
    }
    public void oc2v1(){
        System.out.println("OClass1.oc2v1()");
    }
//    public void oc2v1(String s){
//
//    }
}