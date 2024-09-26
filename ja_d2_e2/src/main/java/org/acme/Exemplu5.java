package org.acme;

public class Exemplu5 {

    public static void main(String[] args) {
        final Object o = 10;

        if (o instanceof Integer i) {
            //...
        }

        switch (o) {
            case String s -> System.out.println(s);
            case Integer i -> System.out.println(i);
            default -> throw new RuntimeException();
        }

    }
}
