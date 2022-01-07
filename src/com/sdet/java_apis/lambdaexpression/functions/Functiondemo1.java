package com.sdet.java_apis.lambdaexpression.functions;

import java.util.function.Function;

public class Functiondemo1 {
    public static void main(String [] args){
        Function<Integer, Integer> func = n->n*n;
        System.out.println(func.apply(5));
        System.out.println(func.apply(10));
        System.out.println(func.apply(2));

        Function<String, Integer> fn = s->s.length();
        System.out.println(fn.apply("Welcome"));
        System.out.println(fn.apply("Java programming"));

    }
}
