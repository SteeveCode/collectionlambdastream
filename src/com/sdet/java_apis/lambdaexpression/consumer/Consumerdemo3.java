package com.sdet.java_apis.lambdaexpression.consumer;

import java.util.function.Consumer;

public class Consumerdemo3 {
    public static void main(String[] args) {
        Consumer<String> cn1 = s-> System.out.println(s + " is white");
        Consumer<String> cn2 = s-> System.out.println(s + " has four legs");
        Consumer<String> cn3 = s-> System.out.println(s + " eats grass");
        cn1.andThen(cn2).andThen(cn3).accept("cow");
    }
}
