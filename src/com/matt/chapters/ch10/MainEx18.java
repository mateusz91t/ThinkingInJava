package com.matt.chapters.ch10;

import com.matt.chapters.ch10.ex18.Device;
import com.matt.chapters.ch10.ex18.IGuarante;

public class MainEx18 {
    public static void main(String[] args){
        IGuarante iG1 = Device.getiGuarante();
        iG1.f();
    }
}
