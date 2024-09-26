package org.acme;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class Exemplu9 {

    public static void main(String[] args) {
        // Un Produs are un nume (String) si un pret (double). Grupati produsele dupa numarul de litere din nume si obtineti media aritmetica a preturilor fiecarei grupari.

        List<Product> products = List.of(
                new Product("chocolate", 10),
                new Product("beer", 5),
                new Product("candy", 3),
                new Product("lime", 1)
        );

        Map<Integer, Double> res =
            products.stream()
                    .collect(groupingBy(p -> p.getName().length(),
                            averagingDouble(Product::getPrice)));

        System.out.println(res);
    }

    private static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
