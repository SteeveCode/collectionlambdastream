package com.sdet.java_apis.collections.linkedhashsetdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashsetdemo {

    public static void main(String[] args) {

        LinkedHashSet hash = new LinkedHashSet();
        HashSet ha = new HashSet(100, (float)0.90);
        HashSet<Integer> hs = new HashSet<Integer>();
        hash.add(100);
        hash.add("word");
        hash.add(15.5);
        hash.add('A');
        hash.add(true);
        hash.add(null);

        System.out.println(hash); //Insertion order is preserved in the way data is stored
    }
}
