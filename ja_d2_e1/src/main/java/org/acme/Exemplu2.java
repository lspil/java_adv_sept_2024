package org.acme;

import java.util.Random;
import java.util.stream.Stream;

public class Exemplu2 {

    public static void main(String[] args) {

        // Afisati primele 10 numere pare folosint Stream API

        Stream.iterate(0, i -> i < 20, i -> i + 2)
                .forEach(System.out::println);

        Stream.iterate(0, i -> i + 1)
                .filter(x -> x % 2 == 0)
                .limit(10)
                .forEach(System.out::println);
    }
}
