package com.matt.chapters.ch9.somanyi;

public interface InFinal extends InB, InC {
    void fin();
}

interface InA{
    void a();
}

interface InB extends InA {
    void b();
}

interface InC extends InA{
    void c();
}
