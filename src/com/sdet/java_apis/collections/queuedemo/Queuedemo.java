package com.sdet.java_apis.collections.queuedemo;

import java.util.PriorityQueue;

public class Queuedemo {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("C");
        System.out.println(queue); // insetion order preserved and duplicates allowed
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll()); // returns null if queue is empty
        System.out.println(queue);
        System.out.println(queue.remove()); // returns NoSuchElementException if queue is empty
        System.out.println(queue);

    }
}
