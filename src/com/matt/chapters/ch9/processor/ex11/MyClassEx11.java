package com.matt.chapters.ch9.processor.ex11;

import com.matt.chapters.ch9.processor.Processor;

public class MyClassEx11 implements Processor {
    public String f(String input) {
        String s1 = "";
        char c1, c2;
        char[] ct1 = input.toCharArray();
        for (int i = 0; i < input.length() - 1; i += 2) {
            c1 = input.charAt(i);
            c2 = input.charAt(i + 1);
            ct1[i] = c2;
            ct1[i + 1] = c1;
        }
        for (char ch :
                ct1) {
            s1 += ch;
        }
        return s1;
    }

    @Override
    public String name() {
        return "//* " + this.getClass().getSimpleName() + " *\\\\";
    }

    @Override
    public String process(Object input) {
        return f((String) input);
    }
}
