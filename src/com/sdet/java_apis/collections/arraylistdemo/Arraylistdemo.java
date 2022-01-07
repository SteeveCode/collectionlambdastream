package com.sdet.java_apis.collections.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylistdemo {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        ArrayList newlist = new ArrayList();
        String[] array = {"dog", "cat", "elephant"};
        alist.add(100);
        alist.add("word");
        alist.add(15.5);
        alist.add('A');
        alist.add(true);
        System.out.println(alist);
        System.out.println("Number of elements in alist is: " + alist.size());
        alist.remove(1);
        System.out.println("After removing element from "+ alist);
        alist.add(2,"python");
        System.out.println(alist);
        System.out.println(alist.get(2));
        alist.set(2, "c#");
        System.out.println(alist);
        System.out.println(alist.isEmpty());
        for(Object a:alist){
            System.out.println(a);
        }

        Iterator  it = alist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        newlist.addAll(alist);
        System.out.println(newlist);
        newlist.removeAll(alist);
        System.out.println(newlist);

        ArrayList newArrayList = new ArrayList(Arrays.asList(array));
        System.out.println(newArrayList);

    }
}
