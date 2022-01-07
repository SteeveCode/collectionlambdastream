package com.sdet.java_apis.collections.hashtabledemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashTable is synchronized i.e only one thread can use any HashTable method at a same time

public class Hashtabledemo {
    public static void main(String[] args) {
        Hashtable <Integer, String> table = new Hashtable<>();
        table.put(101, "John");
        table.put(102, "David");
        table.put(103, "Smith");
        // table.put(null, "John"); // does not accept null as key or value
        // table.put(104, null); // does not accept null as key or value
        // insertion order is not preserved in HashTable
        System.out.println(table.containsKey(101));
        System.out.println(table.containsKey(106));
        System.out.println(table.containsValue("David"));
        System.out.println(table.containsValue("Ben"));
        System.out.println(table.isEmpty());
        System.out.println(table.keySet());
        System.out.println(table.values());
        System.out.println(table.entrySet());

        for(Object i: table.keySet()){
            System.out.println(i);
        }

        // Entry  Interface methods:
        // Entry is a sub interface of Map and has methods used to operate on each entry (key/value pair) in a map
        for(Map.Entry entry :table.entrySet()){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }

        // Iterator methods:
        Set set = table.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() +  " = " + entry.getValue());
        }

    }
}
