package com.sdet.java_apis.streams.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo4 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Alex", 10000),
                new Employee(101, "Brian", 20000),
                new Employee(101, "Charles", 30000),
                new Employee(101, "David", 40000),
                new Employee(101, "Edward", 50000)
        );
        //    Combination of filter and map
        List<Integer> employeeSalList  = employeeList.stream()
                .filter(e->e.salary>20000)
                .map(e->e.salary)
                .collect(Collectors.toList());
        System.out.println(employeeSalList);
    }

}
