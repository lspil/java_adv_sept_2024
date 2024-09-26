package org.acme;

import java.util.List;

public class Exemplu3 {

    public static void main(String[] args) {
        // Avand o lista de numere intregi afisati numerele pare din lista

        List<Integer> list = List.of(2,4,5,6,7,5,3,1);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
