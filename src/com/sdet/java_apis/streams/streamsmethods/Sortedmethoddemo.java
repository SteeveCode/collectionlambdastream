package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortedmethoddemo {
    public static void main(String[] args) {
        List<Integer> numberLIst = Arrays.asList(2,4,1,3,7,5,9);
        List<Integer> sortedList = numberLIst.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        List<Integer> reverseSortedList = numberLIst.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList);

        List<String> nameList = Arrays.asList("John", "Mary", "Kim", "David", "Smith");
        List<String>  sortedNameList = nameList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNameList);
        List<String>  reverseSortedNameList = nameList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedNameList);
    }
}
