package com.sdet.java_apis.streams.filterdemo;

import java.util.ArrayList;
import java.util.List;

public class Filterdemo4 {
    public static void main(String[] args) {

        List<Product> prList = new ArrayList<>();
        prList.add(new Product(1, "HP Laptop", 25000));
        prList.add(new Product(2, "Dell", 30000));
        prList.add(new Product(3, "Lenovo", 28000));
        prList.add(new Product(1, "Sony", 23000));
        prList.add(new Product(1, "Apple", 90000));
        prList.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price));
    }
}
