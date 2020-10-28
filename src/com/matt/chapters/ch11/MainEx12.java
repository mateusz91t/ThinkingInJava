package com.matt.chapters.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static com.matt.myutil.Print.println;

public class MainEx12 {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l1.add(i);
        }
        println(IntIterator.reverseList(l1));
    }
}
class IntIterator {
    public static List<Integer>
    reverseList(List<Integer> list){
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        List<Integer> returnList = new ArrayList<>();
        while (listIterator.hasPrevious()){
            returnList.add(listIterator.previous());
        }
        return returnList;
    }
}
