package org.acme;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Exemplu10 {


    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "Beer", "Cherry", "Mary");

        // boolean  ->  Predicate

        Map<Boolean, Set<String>> result =
            strings.stream()
                   .collect(partitioningBy(s -> s.length() % 2 == 0, toSet()));

        System.out.println(result);
    }
}
