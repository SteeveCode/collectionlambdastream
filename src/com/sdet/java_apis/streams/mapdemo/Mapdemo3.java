package com.sdet.java_apis.streams.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo3 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5);
        List<Integer> multipliedList = new ArrayList<>();
        // before streams api
//        for(Integer num:numbersList){
//            System.out.println(num*3);
//            multipliedList.add(num*3);
//        }
        // after streams api
       multipliedList = numbersList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println(multipliedList);
        numbersList.stream().map(num->num*3).forEach(System.out::println); // using method referencing

    }
}
