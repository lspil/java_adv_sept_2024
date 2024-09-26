package org.acme;

import java.util.List;

public class Exemplu6 {

    public static void main(String[] args) {

        // Avand o lista de obiecte String afisati numarul cuvintelor care contin doar litere mici

        List<String> strings = List.of("Cherry", "Mary", "chocolate", "beer");

        strings.stream()
                .filter(s -> s.toLowerCase().equals(s))
                .forEach(System.out::println);
    }
}
