package org.acme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Exemplu10 {

    public static void main(String[] args) {
        // Avand o lista de produse obtineti o lista a preturilor produselor.

        List<Product> products = List.of(
                new Product("chocolate", 10),
                new Product("beer", 5),
                new Product("candy", 3),
                new Product("lime", 1)
        );

        Map<Integer, List<Double>> res1 =
            products.stream()
                    .collect(groupingBy(p -> p.getName().length(),
                            mapping(Product::getPrice, toList())));

        List<Double> prices =
            products.stream()
                    .map(Product::getPrice)
                    .collect(Collectors.toList());
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
