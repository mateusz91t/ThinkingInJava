package com.matt.chapters.ch10.ex6.pac3ex6;

import com.matt.chapters.ch10.ex6.pac1Ex6.Inter1;
import com.matt.chapters.ch10.ex6.pac2ex6.Cla1;

public class Cla2 extends Cla1 {
    public Inter1 createCla1Inner1() {
        return this.new Cla1Inner1();
    }
}