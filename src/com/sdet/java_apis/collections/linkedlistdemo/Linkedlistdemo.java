package com.sdet.java_apis.collections.linkedlistdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistdemo {

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            LinkedList newlist = new LinkedList(Arrays.asList("X", "Y", "Z", "A", "B", "C"));
            LinkedList animals = new LinkedList(Arrays.asList("dog", "cat", "snake"));

            list.add(100);
            list.add("word");
            list.add(15.5);
            list.add('A');
            list.add(true);
            list.add(null);
            System.out.println(newlist);
            Collections.sort(newlist);
            System.out.println(newlist);
            Collections.sort(newlist, Collections.reverseOrder());
            System.out.println(newlist);
            Collections.shuffle(newlist);
            System.out.println(newlist);
            System.out.println(animals);
            animals.addFirst("tiger");
            animals.addLast("element");
            System.out.println(animals);
            System.out.println(animals.getFirst());
            System.out.println(animals.getLast());
            animals.removeFirst();
            animals.removeLast();
            System.out.println(animals);
        }
}
