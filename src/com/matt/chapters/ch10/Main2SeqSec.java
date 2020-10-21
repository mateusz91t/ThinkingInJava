package com.matt.chapters.ch10;

import com.matt.chapters.ch10.seqselector.ClassWithString;
import com.matt.chapters.ch10.seqselector.Selector;
import com.matt.chapters.ch10.seqselector.Sequence;

public class Main2SeqSec {
    public static void main(String[] ards){
        Sequence seq1 = new Sequence(5);
        seq1.add(new ClassWithString("t1"));
        seq1.add(new ClassWithString("t2"));
        seq1.add(new ClassWithString("t3"));
        seq1.add(new ClassWithString("t4"));
        seq1.add(new ClassWithString("t5"));
        seq1.add(new ClassWithString("t6"));
        seq1.add(new ClassWithString("t7"));

        Selector sel1 = seq1.getSelector();
        while (!sel1.end()){
            System.out.println(sel1.getCurrent());
            sel1.goNext();
        }
    }
}
