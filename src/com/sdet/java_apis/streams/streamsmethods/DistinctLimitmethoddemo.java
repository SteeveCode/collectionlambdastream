package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Non-terminal methods/Preocessing methods
// distict()
//limit()

// Terminal methods
// count()
// forEach()

public class DistinctLimitmethoddemo {
    public static void main(String[] args) {
        List<String> vehiclesList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");
        List<String> distinctVehiclesList = vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehiclesList);
        vehiclesList.stream().distinct().forEach(System.out::println);
        long count = vehiclesList.stream().distinct().count();
        System.out.println(count);
        List<String> limitedVehiclesList = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles: "+limitedVehiclesList);

    }
}
