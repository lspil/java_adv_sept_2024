package org.acme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {
        Thread.ofPlatform().start(new ProducerRunnable("P1"));
        Thread.ofPlatform().start(new ProducerRunnable("P2"));
        Thread.ofPlatform().start(new ProducerRunnable("P3"));

        Thread.ofPlatform().start(new ConsumerRunnable("C1"));
        Thread.ofPlatform().start(new ConsumerRunnable("C2"));
        Thread.ofPlatform().start(new ConsumerRunnable("C3"));


    }
}