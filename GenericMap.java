package com.CodeWithSarnav;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Rohan");
        map.put(2,"Amit");
        map.put(3,"Satya");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> iter= set.iterator();
        while(iter.hasNext())
        {
            Map.Entry e= iter.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
