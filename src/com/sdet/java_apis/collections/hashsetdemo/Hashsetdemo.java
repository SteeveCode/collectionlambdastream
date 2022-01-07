package com.sdet.java_apis.collections.hashsetdemo;

import java.util.HashSet;

public class Hashsetdemo {
    public static void main(String[] args) {

        HashSet hash = new HashSet();
        HashSet ha = new HashSet(100, (float)0.90);
        HashSet<Integer> hs = new HashSet<Integer>();
        hash.add(100);
        hash.add("word");
        hash.add(15.5);
        hash.add('A');
        hash.add(true);
        hash.add(null);

        System.out.println(hash); //Insertion order not preserved in the way data is stored
    }

}

