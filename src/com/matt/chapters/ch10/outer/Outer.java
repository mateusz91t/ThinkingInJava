package com.matt.chapters.ch10.outer;

public class Outer {
    public class Inner {
        public void f() {
            System.out.println(this.getClass().getSimpleName() + ".getMyInterEx9()");
        }

        public String getFieldString() {
            return fieldString;
        }

        public int getInneri() {
            return i;
        }

        public void setInneri(int ii) {
            i = ii;
        }
    }

    private int i;

    public int getOuteri() {
        return i;
    }

    public Inner getInner() {
        return new Inner();
    }

    private String fieldString;

    public Outer(String fieldString) {
        this.fieldString = fieldString;
    }

    public Outer() {
        fieldString = "default Constructor";
    }
}
