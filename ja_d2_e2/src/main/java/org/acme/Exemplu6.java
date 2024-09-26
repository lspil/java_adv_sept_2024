package org.acme;

public class Exemplu6 {

    public static void main(String[] args) {
        final Object o = 10;


        switch (o) {
            case String s -> System.out.println(s);
            case Integer i when i == 10 -> System.out.println(i);
            case Integer i -> System.out.println(i);
            default -> throw new RuntimeException();
        }

    }
}
