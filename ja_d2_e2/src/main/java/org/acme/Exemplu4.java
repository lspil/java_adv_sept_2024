package org.acme;

public class Exemplu4 {

    public static void main(String[] args) {
        final int v = 100;

        final int z =
            switch (v) {
                case 10 -> 100;
                case 20, 30 -> 200;
                default -> throw new RuntimeException();
            };

    }
}
