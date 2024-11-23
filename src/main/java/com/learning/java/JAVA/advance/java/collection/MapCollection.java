package com.learning.java.JAVA.advance.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"vishal");
        hm.put(2,"kunal");
        hm.put(3,"aditya");
        hm.put(4,"sachin");

        for(Map.Entry<Integer,String> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }


    }


}
