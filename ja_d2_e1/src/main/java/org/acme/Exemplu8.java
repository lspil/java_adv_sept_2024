package org.acme;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplu8 {

    public static void main(String[] args) {
        // Avand o lista de objecte String afisati concatenat cu - pe cele care au numar par de litere, sortate alfabetic

        List<String> strings = List.of("Cherry", "Mary", "chocolate", "beer");

        String r =
            strings.stream()
                    .filter(s -> s.length() % 2 == 0)
                    .sorted()
                    .collect(Collectors.joining("-"));

    }
}
