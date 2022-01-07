package com.sdet.java_apis.lambdaexpression.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functiondemo2 {
    public static void main(String [] args){
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Davvid", 50000));
        empList.add(new Employee("John", 30000));
        empList.add(new Employee("Mary", 20000));

        Function<Employee, Integer> func = employee -> {
            int salary = employee.salary;
            if(salary>=10000 && salary<=20000)
                return salary*10/100;
            else if(salary>20000 && salary<=30000)
                return salary*20/100;
            else if(salary>30000 && salary<=50000)
                return salary*30/100;
            else
                return salary*40/100;
        };

        Predicate<Integer> pr = i->i>5000;
        for(Employee emp:empList){
            int bonus = func.apply(emp);
            if(pr.test(bonus)){
                System.out.println(emp.name + " " + emp.salary);
                System.out.println("Bonus is " + bonus);
            }

        }
    }
}
