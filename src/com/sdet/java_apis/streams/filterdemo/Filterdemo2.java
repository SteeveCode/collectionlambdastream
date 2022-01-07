package com.sdet.java_apis.streams.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre", "Sandra", "JOhn", "Daeanerys", "Joffery");
        List<String> longNames = new ArrayList<>();
        longNames = names.stream().filter(s->s.length()>6 && s.length()<8).collect(Collectors.toList());
       //  System.out.println(longNames);
        names.stream().filter(s->s.length()>6 && s.length()<8).forEach(System.out::println);
    }
}
