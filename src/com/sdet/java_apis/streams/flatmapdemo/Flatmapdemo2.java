package com.sdet.java_apis.streams.flatmapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapdemo2 {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Smith", 101, 'A'));
        studentList1.add(new Student("John", 102, 'B'));
        studentList1.add(new Student("Kennedy", 103, 'C'));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Scott", 104, 'A'));
        studentList2.add(new Student("Mary", 105, 'B'));
        studentList2.add(new Student("Kitty", 106, 'C'));

        List<List<Student> >studentList = Arrays.asList(studentList1, studentList2);

            // before streams api
        for(List<Student> student:studentList){
            for(Student s:student){
                System.out.println(s.name);
            }
        }
        // after streams api
        List<String> namesList = studentList.stream().flatMap(x->x.stream()).map(n->n.name).collect(Collectors.toList());
        System.out.println(namesList);
}

}
