package com.sdet.java_apis.streams.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 1, 20, 25, 30, 35, 40, 45, 50);
        List<Integer> evenNUmberList = new ArrayList<>();

        // Filtering even numbers Without using streams concept
        for(int num:numberList){
           if(num%2==0)
               evenNUmberList.add(num);
        }
        System.out.println(evenNUmberList);

        // Filtering even numbers using streams concept
        evenNUmberList= numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
        // store collection in  a variable before printing
        System.out.println(evenNUmberList);
        // print collection without storing in a variable
        numberList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
        numberList.stream().filter(n->n%2==0).forEach(System.out::println); // using method reference operator
    }
}
