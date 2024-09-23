package org.acme;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Exemplu4 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        //===================================================
        List<Integer> result = new ArrayList<>();

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> result.add(x)); // GRESIT!

        List<Integer> result2 = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        //===================================================

        StringBuilder sb = new StringBuilder();

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> sb.append(x)); // GRESIT!


        list.stream()
                .filter(x -> x % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining());
        //===================================================

        AtomicInteger r = new AtomicInteger();  // GRESIT!
        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> r.getAndIncrement()); // GRESIT!

        long c = list.stream()
                .filter(x -> x % 2 == 0)
                .count();
    }
}
