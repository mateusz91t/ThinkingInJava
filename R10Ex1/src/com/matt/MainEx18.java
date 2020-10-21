package com.matt;

import com.matt.ex18.Device;
import com.matt.ex18.IGuarante;

public class MainEx18 {
    public static void main(String[] args){
        IGuarante iG1 = Device.getiGuarante();
        iG1.f();
    }
}
