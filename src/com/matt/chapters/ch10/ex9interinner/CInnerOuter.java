package com.matt.chapters.ch10.ex9interinner;

public class CInnerOuter {
    public MyInterEx9 myInterEx9(String name) {
        class CInner implements MyInterEx9 {
            private String name;

            private CInner(String name) {
                this.name = name;
            }

            @Override
            public void getName() {
                System.out.println(name);
            }
        }
        return new CInner(name);
    }
}
