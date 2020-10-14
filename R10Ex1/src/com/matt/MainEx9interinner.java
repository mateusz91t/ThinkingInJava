package com.matt;

import com.matt.ex9interinner.CInnerOuter;
import com.matt.ex9interinner.MyInterEx9;

public class MainEx9interinner {
    public static void main(String[] args){
        CInnerOuter cio1 = new CInnerOuter();
        MyInterEx9 mi9 = cio1.myInterEx9("Bill");
        mi9.getName();
    }
}
