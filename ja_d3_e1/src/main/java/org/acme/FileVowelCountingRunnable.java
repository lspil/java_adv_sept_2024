package org.acme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileVowelCountingRunnable implements Runnable {

    private final Path file;

    private long result;

    public FileVowelCountingRunnable(Path file) {
        this.file = file;
    }

    @Override
    public void run() {
        try {
            result =  Files.readAllLines(file).stream()
                        .flatMap(s -> Stream.of(s.split("")))
                        .filter(c -> "AEIOUaeiou".contains(c))
                        .count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public long getResult() {
        return result;
    }
}
