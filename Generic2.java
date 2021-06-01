package com.CodeWithSarnav;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list=new ArrayList<String>();
        list.add("Sarnav");
        list.add("Jay");
        list.add("Rohan");
        System.out.println("Element is "+list.get(1));
        Iterator<String> iter= list.iterator();
        while(iter.hasNext())
        System.out.println(iter.next());
    }
}