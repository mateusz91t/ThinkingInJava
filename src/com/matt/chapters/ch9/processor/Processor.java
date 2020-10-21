package com.matt.chapters.ch9.processor;

public interface Processor {
    String name();
    Object process(Object input);
}
