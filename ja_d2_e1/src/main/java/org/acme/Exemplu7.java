package org.acme;

import java.util.List;
import java.util.stream.Stream;

public class Exemplu7 {

    public static void main(String[] args) {
        // Avand o lista de obiecte String afisati numarul total al vocalelor din toate sirurile

        List<String> strings = List.of("Cherry", "Mary", "chocolate", "beer");

        long r =
            strings.stream()
                    .flatMap(s -> Stream.of(s.split("")))
                    .filter(c -> "aeiouAEIOU".contains(c))
                    .count();

    }
}
