package com.CodeWithSarnav;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        NumberingList(list);
        int total = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer val = iter.next();
            total += val;
        }
        System.out.print(total);
    }

    public static void NumberingList(ArrayList<Integer> list) {
        list.add(1);
        list.add(5);
        list.add(9);
    }
}