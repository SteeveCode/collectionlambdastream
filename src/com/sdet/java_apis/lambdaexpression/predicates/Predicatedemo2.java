package com.sdet.java_apis.lambdaexpression.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicatedemo2 {
    public static void main(String [] args){
        // Ex 1.
        Employee emp = new Employee("JOHN", 50000, 5);
        Predicate<Employee> pr = e->(e.salary>30000 && e.experience>3);
        System.out.println(pr.test(emp));

        //Ex 2.
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("JOhn", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("Scott", 40000, 6));

        for(Employee em:al){
            if(pr.test(em)){
                System.out.println(em.name + " " + em.salary);
            }
        }
    }
}
