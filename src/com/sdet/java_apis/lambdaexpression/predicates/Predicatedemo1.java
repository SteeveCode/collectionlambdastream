package com.sdet.java_apis.lambdaexpression.predicates;

import java.util.function.Predicate;

public class Predicatedemo1 {
    public static void main(String [] args){
        // Ex 1.
        Predicate<Integer> p = i->i>10;
        System.out.println( p.test(20));
        System.out.println( p.test(10));
        // Ex 2.
        Predicate<String> pr = s->s.length()>4;
        System.out.println( pr.test("Welcome"));
        System.out.println( pr.test("xyz"));
        // Ex 3
        String[] names = {"David", "Scott", "Smith", "John", "Mary" };
        for(String name:names){
            if(pr.test(name)){
                System.out.println(name);
            }
        }

    }
}
