package org.acme;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Person p = new Person(UUID.randomUUID(), "Tom");

        System.out.println(p.id());
        System.out.println(p.name());

        System.out.println(p);

        // model pt endpoint, model pt DB (nu JPA)

        // JNI   native memory management -> native execution
    }
}