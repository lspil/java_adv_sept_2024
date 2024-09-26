package org.acme;

import java.util.List;

public class Exemplu4 {

    public static void main(String[] args) {

        // Avand o lista de numere intregi faceti suma primelor 5 numere impare

        List<Integer> list = List.of(2,4,5,6,7,5,3,1);

        int r1 =
            list.stream()
                    .filter(x -> x % 2 != 0)
                    .limit(5)
                    .reduce(0, (x, y) -> x + y);

        int r2 =
                list.stream()
                        .filter(x -> x % 2 != 0)
                        .mapToInt(x -> x)
                        .limit(5)
                        .sum();
    }
}
