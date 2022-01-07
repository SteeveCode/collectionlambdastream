package com.sdet.java_apis.lambdaexpression.predicates;

// Joining predicates - and, or, negate
// p1 - check number is even
// p2 - check number is greater than 50

import java.util.function.Predicate;

public class Predicatedemo3 {
    public static void main(String [] args){
        int[] ar = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        Predicate<Integer> p1 = i->i%2==0;
        Predicate<Integer> p2= i->i>50;
        System.out.println("The following are numbers even and greater than 50...");
        for(Integer num:ar){
            // if(p1.test(num) && p12.test(num)) // joining predicates with && operator
            if(p1.and(p2).test(num)) // joining predicates with .and operator
            {
                System.out.println(num);
            }
        }
        System.out.println("The following are numbers even or greater than 50...");
        for(Integer num:ar){
            // if(p1.test(num) && p12.test(num)) // joining predicates with && operator
            if(p1.or(p2).test(num)) // joining predicates with .and operator
            {
                System.out.println(num);
            }
        }

        System.out.println("The negate() method negates (i.e returns opposite) whatever the lambda expression returns");
        for(Integer num:ar){
            // if(p1.test(num) && p12.test(num)) // joining predicates with && operator
            if(p1.negate().test(num)) // joining predicates with .and operator
            {
                System.out.println(num);
            }
        }
    }
}
