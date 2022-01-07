package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindanyFindfisrtmethoddemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "One");
        Optional<String> element = list.stream().findAny();
        System.out.println(element.get());
        element = list.stream().findFirst();
        System.out.println(element.get());
    }
}
