package com.matt.chapters.ch10.ex13anonymous;

public class CInnerOuter {
    public MyInterEx13 cInner() {
        return new MyInterEx13() {
            private String name = "Boooo";
            @Override
            public void getName() {
                System.out.println(name);
            }
        };
    }
}
