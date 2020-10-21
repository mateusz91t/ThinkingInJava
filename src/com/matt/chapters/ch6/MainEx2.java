package com.matt.chapters.ch6;

import static com.matt.chapters.ch6.connections.ConnectionManager.addConnection;
import static com.matt.chapters.ch6.connections.ConnectionManager.connectionsAccess;

public class MainEx2 {
    public static void main(String[] args){
        addConnection();
        addConnection();
        System.out.println(connectionsAccess()[1]);
        System.out.println(connectionsAccess()[2]);

        System.out.println();
        System.out.println("added some connections... how many?");

        for (int i = 0; i < 10; i++) {
            System.out.println(connectionsAccess()[i]);
        }
        System.out.println();
        System.out.println("now i'm filling all connections - more than i can");
        for (int i = 0; i < 10; i++) {
            addConnection();
        }
        System.out.println("... and check it");
        for (int i = 0; i < 10; i++) {
            System.out.println(connectionsAccess()[i]);
        }
    }
}
