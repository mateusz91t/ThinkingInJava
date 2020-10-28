package com.matt.chapters.ch11;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static com.matt.myutil.Print.*;

public class MainEx15 {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        String text = "Bałaganwliterkach";

        List<Character> textList = new ArrayList<>();
        textList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Iterator<Character> iterator = textList.iterator();

        println(textList);

        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        print(stack.pop());
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        stack.push(String.valueOf(iterator.next()));
        print(stack.pop());
        print(stack.pop());
        print(stack.pop());
    }
}
