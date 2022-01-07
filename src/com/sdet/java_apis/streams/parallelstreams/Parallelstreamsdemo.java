package com.sdet.java_apis.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Parallelstreamsdemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David", 82),
                new Student("Bob", 90),
                new Student("John", 55),
                new Student("Mary", 65),
                new Student("Eric", 85),
                new Student("Smith", 88),
                new Student("Scott", 50)
                );
        // Using stream - sequential processing
        studentList.stream().filter(s->s.score>=80).limit(3).forEach(s->System.out.println(s.name + " "+ s.score));

        // Using parallel stream - parallel processing
        studentList.parallelStream().filter(s->s.score>=80).limit(3).forEach(s->System.out.println(s.name + " "+ s.score));

        // Convert stream to parallel stream using parallel() method
        studentList.stream().parallel().filter(s->s.score>=80).limit(3).forEach(s->System.out.println(s.name + " "+ s.score));
    }
}
