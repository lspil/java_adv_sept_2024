package org.acme;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Exemplu9 {


    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "Beer", "Cherry", "Mary");

        Map<Integer, SortedSet<String>> result =
            strings.stream()
                    .collect(groupingBy(String::length, toCollection(TreeSet::new)));

        System.out.println(result);
    }
}
