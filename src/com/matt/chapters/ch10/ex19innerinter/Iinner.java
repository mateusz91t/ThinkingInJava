package com.matt.chapters.ch10.ex19innerinter;

public interface Iinner {
    void f();
    class C1 implements Iinner{
        int i = 0;
        @Override
        public void f() {
            i++;
            System.out.println(i);
        }
        public static void main(String[] args){
            Iinner c1 = new C1();
            c1.f();
            c1.f();
            C1 c2 = new C1();
            c2.f();
        }
    }
}
