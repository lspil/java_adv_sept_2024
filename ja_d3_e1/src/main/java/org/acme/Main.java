package org.acme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String folder = "C:\\MANNINGS\\Securing Cloud Apps\\ja_d3_e1\\src\\main\\resources\\data";

        final List<Thread> threads = new ArrayList<>();
        final List<FileVowelCountingRunnable> runnables = new ArrayList<>();

        try {
            final var paths = Files.list(Paths.get(folder)).toList();

            for (final Path p : paths) {
                final var r = new FileVowelCountingRunnable(p);
                final var t = Thread.ofPlatform().start(r);
                threads.add(t);
                runnables.add(r);
            }

            threads.forEach(t -> {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            final var totalVowels =
                runnables.stream()
                        .mapToLong(r -> r.getResult())
                        .sum();

            System.out.println(totalVowels);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}