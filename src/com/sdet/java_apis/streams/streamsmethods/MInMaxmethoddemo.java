package com.sdet.java_apis.streams.streamsmethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// NOn-terminal methods
// min() and max()
public class MInMaxmethoddemo {
    public static void main(String[] args) {
        List<Integer> numberLIst = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-2);
        // count method
        long numberOfEvenNUmbers = numberLIst.stream().filter(n->n%2==0).count();
        System.out.println(numberOfEvenNUmbers);
       Optional<Integer> min = numberLIst.stream().min((val1, val2)->{return val1.compareTo(val2);
       });
        System.out.println(min.get()); // we cannot directly get the value from the min object hence min.get() is used
        Optional<Integer> max = numberLIst.stream().max((val1, val2)->{return val1.compareTo(val2);
        });
        System.out.println(max.get());
    }
}
