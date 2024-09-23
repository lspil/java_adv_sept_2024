package org.acme;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Exemplu1 {

    public static void main(String[] args) {

        // Stream ... IntStream, LongStream, DoubleStream

        // Sursa -> OI -> OT

        List<Integer> list1 = List.of(2,6,8,9,4,2);

//        Stream<Integer> s = list1.stream();

        // map()
        // flatMap()
        // reduce()
        // peek()


//        list1.stream()
//             .distinct()
//             .filter(x -> x % 2 == 0)
//             .forEach(System.out::println);

        list1.stream()
                .mapToInt(x -> x)
//                .mapToObj(x -> x)
                .sum();


    }
}
