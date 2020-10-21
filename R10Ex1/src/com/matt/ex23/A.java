package com.matt.ex23;

public class A {
    public U createU() {
        return new U() {

            @Override
            public void u1() {
                System.out.println(A.this.getClass() + ".u1()");
            }

            @Override
            public void u2() {
                System.out.println(getClass() + ".u2()");
            }

            @Override
            public void u3() {
                System.out.println(getClass().getSimpleName() + ".u3()");
            }
        };
    }

}
