package org.acme;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        final String folder = "C:\\MANNINGS\\Securing Cloud Apps\\ja_d3_e3\\src\\main\\resources\\data";

        try(ExecutorService service = Executors.newCachedThreadPool()) {
            final var futures = Files.list(Paths.get(folder))
                    .map(FileVowelCountingCallable::new)
                    .map(c -> service.submit(c))
                    .toList();

            final long sum = futures.stream()
                            .mapToLong(f -> getFileCount(f))
                            .sum();

            System.out.println(sum);
        }
    }

    private static Long getFileCount(Future<Long> f) {
        try {
            return f.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}