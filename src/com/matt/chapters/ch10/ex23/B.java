package com.matt.chapters.ch10.ex23;

public class B {
    U[] ut;
    public B(int index){
        ut = new U[index];
    }
    public void fillUTab(U u, int index){
        ut[index] = u;
    }
    public void nullUTab(int index){
        ut[index] = null;
    }
    public void checkElementsUTab(){
        for (U u :
                ut) {
            u.u1();
            u.u2();
            u.u3();
        }
    }
}
