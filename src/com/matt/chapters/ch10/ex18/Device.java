package com.matt.chapters.ch10.ex18;

public class Device {
    protected static class Guarante implements IGuarante {
        public void f(){
            System.out.println(getClass().getSimpleName() + ".f()");
        }
    }
    public static IGuarante getiGuarante(){
        return new Guarante();
    }
}
