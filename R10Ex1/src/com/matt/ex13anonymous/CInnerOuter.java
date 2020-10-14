package com.matt.ex13anonymous;

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
