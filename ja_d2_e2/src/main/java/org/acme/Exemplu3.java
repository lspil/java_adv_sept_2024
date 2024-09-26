package org.acme;

public class Exemplu3 {

    public static void main(String[] args) {

        int v = 100;

        switch (v) {
            case 10 -> System.out.println(10);
            case 20, 30 -> System.out.println(20);
            default -> System.out.println(30);
        }

    }
}
