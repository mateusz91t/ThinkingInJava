package com.matt.chapters.ch10;

import com.matt.chapters.ch10.ex13anonymous.CInnerOuter;
import com.matt.chapters.ch10.ex13anonymous.MyInterEx13;

public class Main13Anonymous {
    public static void main(String[] args){
        CInnerOuter cio1 = new CInnerOuter();
        MyInterEx13 mie1 = cio1.cInner();
        mie1.getName();
    }
}
