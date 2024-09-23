package org.acme;

import java.util.List;
import java.util.stream.Stream;

public class Exemplu3 {

    public static void main(String[] args) {

        List<String> list = List.of("Hello", "World"); // H e l l o W o r l d

//        list.stream()
//                .flatMapToInt(String::chars)
//                .forEach(c -> System.out.println((char) c)); // nu putem sa folosim System.out::println

//        list.stream()
//                .flatMap(s -> Stream.of(s.split("")))
//                .forEach(System.out::println);
    }
}
