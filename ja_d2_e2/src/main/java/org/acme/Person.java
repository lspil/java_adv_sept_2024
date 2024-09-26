package org.acme;

import java.util.UUID;

public record Person (
        UUID id,
        String name
) {

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
