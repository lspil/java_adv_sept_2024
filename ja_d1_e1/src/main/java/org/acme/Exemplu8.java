package org.acme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu8 {


    public static void main(String[] args) {
        List<String> strings = List.of("Hello", "Beer", "Cherry", "Mary");

        Map<Integer, String> result =
            strings.stream()
                    .collect(Collectors.groupingBy(String::length,
                                Collectors.mapping(s -> new StringBuilder(s).reverse(),
                                        Collectors.joining())));

        System.out.println(result);
    }
}
