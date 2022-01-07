package com.sdet.java_apis.lambdaexpression.consumer;

import java.util.function.Consumer;

public class Consumerdemo1 {
    public static void main(String[] args) {
        Consumer<String> cn = s-> System.out.println(s);
        cn.accept("WELCOME");
    }
}
