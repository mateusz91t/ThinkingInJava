package com.matt.chapters.ch10;

import com.matt.chapters.ch10.ex9interinner.CInnerOuter;
import com.matt.chapters.ch10.ex9interinner.MyInterEx9;

public class MainEx9interinner {
    public static void main(String[] args){
        CInnerOuter cio1 = new CInnerOuter();
        MyInterEx9 mi9 = cio1.myInterEx9("Bill");
        mi9.getName();
    }
}
