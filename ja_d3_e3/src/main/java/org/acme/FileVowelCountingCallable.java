package org.acme;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class FileVowelCountingCallable implements Callable<Long> {

    private final Path file;

    public FileVowelCountingCallable(Path file) {
        this.file = file;
    }

    @Override
    public Long call() {
        try {
            return Files.readAllLines(file).stream()
                        .flatMap(s -> Stream.of(s.split("")))
                        .filter(c -> "AEIOUaeiou".contains(c))
                        .count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
