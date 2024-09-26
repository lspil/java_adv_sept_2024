package org.acme;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    static List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            products.add(new Product(UUID.randomUUID()));
        }
    }
}