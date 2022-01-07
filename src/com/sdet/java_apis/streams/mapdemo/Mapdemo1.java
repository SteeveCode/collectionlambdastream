package com.sdet.java_apis.streams.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Mapdemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle","flight", "train" );
        List<String> vehiclesListInUpperCaes = new ArrayList<>();
        // before streams api
//        for(String name:vehicles){
//            vehiclesListInUpperCaes.add(name.toUpperCase());
//        }
        // after streams api
        vehiclesListInUpperCaes = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListInUpperCaes);
    }
}
