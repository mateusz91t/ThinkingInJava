package com.matt.seqselector;

public interface Selector {
    boolean end();

    Object getCurrent();

    void goNext();
}