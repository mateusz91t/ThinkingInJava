package com.matt.ex6.pac2ex6;

import com.matt.ex6.pac1Ex6.Inter1;

public class Cla1 {
    protected class Cla1Inner1 implements Inter1 {
        @Override
        public void f() {
            System.out.println(this.getClass().getSimpleName() + ".getMyInterEx9()");
        }
        public Cla1Inner1(){
            System.out.println("Cla1.Cla1Inner1()");
        }
    }
}
