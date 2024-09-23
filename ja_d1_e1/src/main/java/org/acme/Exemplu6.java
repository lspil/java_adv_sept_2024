package org.acme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu6 {


    public static void main(String[] args) {
        List<String> strings = List.of("AAA", "AA", "B", "BB", "CCCC");

        Map<Integer, List<String>> result =
            strings.stream()
                    .collect(Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}
