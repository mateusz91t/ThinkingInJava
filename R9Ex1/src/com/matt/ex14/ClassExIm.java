package com.matt.ex14;

public class ClassExIm extends ClassEx implements Id {

    @Override
    public void a() {
        System.out.println(this.getClass().getSimpleName() + ".a()");
    }

    @Override
    public void b() {
        System.out.println(this.getClass().getSimpleName() + ".b()");
    }

    @Override
    public void c() {
        System.out.println(this.getClass().getSimpleName() + ".c()");
    }

    @Override
    public void d() {
        System.out.println(this.getClass().getSimpleName() + ".d()");
    }

    @Override
    public void ce() {
        System.out.println(this.getClass().getSimpleName() + ".ce()");
    }
}

abstract class ClassEx {
    public abstract void ce();
}

interface Ia {
    void a();
}

interface Ib {
    void b();
}

interface Ic {
    void c();
}

interface Id extends Ia, Ib, Ic {
    void d();
}