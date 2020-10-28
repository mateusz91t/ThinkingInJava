package com.matt.chapters.ch11.test;

import java.util.Stack;

import static com.matt.myutil.Print.println;

public class StackTest {
    public static void main(String[] args){
        Stack<String> pies = new Stack<>();
        for (String s :
                "Mój pies ma pchły".split(" ")) {
            pies.push(s);
        }
        while (!pies.empty())
            println(pies.pop());
    }
}
