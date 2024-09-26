package org.acme;

import java.util.Random;
import java.util.stream.Stream;

public class Exemplu1 {

    public static void main(String[] args) {
        // Generati 10 valori aleatoare folosind Stream API

        Stream.generate(() -> new Random().nextInt())
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(0, i -> i + 1)
                .limit(10)
                .map(i -> new Random().nextInt())
                .forEach(System.out::println);

        Stream.iterate(0, i -> i < 10, i -> i + 1)
                .map(i -> new Random().nextInt())
                .forEach(System.out::println);
    }
}
