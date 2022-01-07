package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.List;

public class Toarraymethoddemo {
    public static void main(String[] args) {
        List<String> stringLIst = Arrays.asList("A", "B", "C", "1", "2", "3");
       Object[] arr = stringLIst.stream().toArray();
        System.out.println(arr.length);
       for(Object v:arr){
           System.out.println(v);
       }
    }
}
