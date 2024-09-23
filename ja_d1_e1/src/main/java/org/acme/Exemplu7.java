package org.acme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu7 {


    public static void main(String[] args) {
        List<String> strings = List.of("AAA", "AA", "B", "BB", "CCCC");

        Map<Integer, Long> result =
            strings.stream()
                    .collect(Collectors.groupingBy(String::length,
                                Collectors.counting()));

        System.out.println(result);
    }
}
