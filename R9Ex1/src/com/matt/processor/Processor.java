package com.matt.processor;

public interface Processor {
    String name();
    Object process(Object input);
}
