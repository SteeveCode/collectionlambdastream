package com.sdet.java_apis.lambdaexpression.functions;

import java.util.function.Function;

public class Functiondemo3 {
    public static void main(String [] args){
        Function<Integer, Integer> f1 = n->n*2;
        Function<Integer, Integer> f2 = n->n*n*n;
        // f1 function is evaluated first and the result passed onto f2 function
        System.out.println(f1.andThen(f2).apply(2));
        // f2 function is evaluated first and the result passed onto f1 function
        System.out.println(f1.compose(f2).apply(2));
    }
}
