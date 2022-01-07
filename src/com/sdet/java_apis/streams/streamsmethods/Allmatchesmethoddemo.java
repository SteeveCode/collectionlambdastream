package com.sdet.java_apis.streams.streamsmethods;

import java.util.HashSet;
import java.util.Set;

public class Allmatchesmethoddemo {
    public static void main(String[] args) {
        Set<String> fruites = new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apple");
        fruites.add("More grapes");
        fruites.add("Two guavas");
        boolean resulf = fruites.stream().anyMatch(val->val.startsWith("One"));
        System.out.println(resulf);
        resulf = fruites.stream().allMatch(val->val.startsWith("One"));
        System.out.println(resulf);
        resulf = fruites.stream().noneMatch(val->val.startsWith("One"));
        System.out.println(resulf);
    }
}
