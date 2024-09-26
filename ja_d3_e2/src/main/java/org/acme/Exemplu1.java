package org.acme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {
    public static void main(String[] args) {
        try (ExecutorService service =
                    Executors.newSingleThreadExecutor()) {

            // Runnable & Callable<T>

            Runnable r = () -> System.out.println("Hello");
            service.submit(r);
        }
    }
}