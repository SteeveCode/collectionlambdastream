package com.sdet.java_apis.lambdaexpression.consumer;

import com.sdet.java_apis.lambdaexpression.consumer.Employee;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumerdemo2 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Davvid", 50000, "Male"));
        empList.add(new Employee("John", 30000, "Male"));
        empList.add(new Employee("Mary", 20000, "Female"));
        empList.add(new Employee("Scott", 60000, "Male"));

        // FUnction
        Function<Employee, Integer> fn = emp->emp.salary * 10/100; // task 1

        // Predicate
        Predicate<Integer> pr = b->b >= 5000; // task 2

        // Consumer
        Consumer<Employee> cn = emp->{
            System.out.println(emp.name);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
        }; // task 3
        for(Employee em:empList){
           int bonus = fn.apply(em); // invoked function interface
           if(pr.test(bonus)){ // invoked predicate interface
               cn.accept(em); // invoke consumer interface
               System.out.println("Employee bonus: "+bonus);
           }
        }
    }
}
