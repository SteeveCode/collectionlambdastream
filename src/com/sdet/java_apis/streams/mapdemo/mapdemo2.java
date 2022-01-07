package com.sdet.java_apis.streams.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mapdemo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle","flight", "train" );
        List<String> vehiclesListInUpperCaes = new ArrayList<>();
        // before streams api
//        for(String name:vehicles){
//            System.out.println(name.length());
//        }
        // after streams api
        vehicles.stream().map(name->name.length()).forEach(System.out::println);
    }
}
