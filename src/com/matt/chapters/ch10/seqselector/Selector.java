package com.matt.chapters.ch10.seqselector;

public interface Selector {
    boolean end();

    Object getCurrent();

    void goNext();
}