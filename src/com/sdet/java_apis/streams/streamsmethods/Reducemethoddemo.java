package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducemethoddemo {
    public static void main(String[] args) {
        List<String> stringLIst = Arrays.asList("A", "B", "C", "1", "2", "3");
        Optional<String> reduced = stringLIst.stream().reduce((value, combinedValue)->{return value + combinedValue;
        });
        System.out.println(reduced.get());
    }
}
