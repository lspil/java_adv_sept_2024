package org.acme;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplu5 {

    public static void main(String[] args) {

        // Avand o lista de numere intregi faceti media aritmetica a numerelor mai mari ca 10 dar mai mici ca 100

        List<Integer> list = List.of(2,4,5,6,7,5,3,1);

        double a1 =
            list.stream()
                    .filter(x -> x > 10)
                    .filter(x -> x < 100)
                    .mapToInt(x -> x)
                    .summaryStatistics()
                    .getAverage();

        double a2 =
                list.stream()
                        .filter(x -> x > 10)
                        .filter(x -> x < 100)
                        .collect(Collectors.averagingDouble(x -> x));
    }
}
