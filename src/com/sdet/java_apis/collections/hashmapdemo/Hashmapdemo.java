package com.sdet.java_apis.collections.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashTable is not synchronized i.e multiple threads can use any HashTable method at the same time

public class Hashmapdemo {
    public static void main(String[] args) {
       // HashMap map = new HashMap();  // stores both keys and values as generic object type i.e heterogeneous

        HashMap<Integer, String> map = new HashMap<>(); // stores both keys and values as specific object type i.e heterogeneous
        map.put(101, "John");
        map.put(102 ,"David");
        map.put(103 ,"Scot");
        map.put(104 ,"Mary");
        map.put(105 ,"Tye");
        map.put(106 ,"David");

        System.out.println(map);
        System.out.println(map.get(105));
        System.out.println(map.remove(103));
        System.out.println(map.remove(106));
        System.out.println(map);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(106));
        System.out.println(map.containsValue("Mary"));
        System.out.println(map.containsValue("Ben"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for(Object i: map.keySet()){
            System.out.println(i);
        }

        for(Object i: map.values()){
            System.out.println(i);
        }

        for(Object i: map.keySet()){
            System.out.println(i + " = " + map.get(i));
        }

        // Entry  Interface methods:
        // Entry is a sub interface of Map and has methods used to operate on each entry (key/value pair) in a map
        for(Map.Entry entry :map.entrySet()){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }

        // Iterator methods:
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() +  " = " + entry.getValue());
        }
    }

}

