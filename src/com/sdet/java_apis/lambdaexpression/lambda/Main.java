package com.sdet.java_apis.lambdaexpression.lambda;

public class Main {
    public static void main(String [] args){

        // implementing an interface without lambda expression
        // Ola ola = new Ola();
       //  ola.bookCab();

        // implementing an interface using lambda expression. no need to create Ola class
        Cab cab = (source, destination)-> {
            System.out.println("Ola cab is booked from " + " " + source + " to " + destination);
            return "Price: 5000 Rs";
        };

        System.out.println(cab.bookCab("Hyd", "Mumbai"));
    }
}
