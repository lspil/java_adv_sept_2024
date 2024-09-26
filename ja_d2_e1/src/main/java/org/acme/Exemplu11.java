package org.acme;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class Exemplu11 {

    public static void main(String[] args) {
        // O persoana are nume, prenume si varsta (int). Grupati persoanele in minori si majori.

        List<Person> persons = List.of(new Person("Tom", 10),
                new Person("John", 20),
                new Person("Linda", 15),
                new Person("Mario", 30),
                new Person("Bob", 22),
                new Person("Mike", 11)
                );

        Map<Boolean, List<Person>> res =
            persons.stream()
                    .collect(partitioningBy(p -> p.getAge() < 18));
    }

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
