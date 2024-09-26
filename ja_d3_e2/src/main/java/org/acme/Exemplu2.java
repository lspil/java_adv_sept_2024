package org.acme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu2 {
    public static void main(String[] args) {
        int n = Runtime.getRuntime().availableProcessors();
        try (ExecutorService service =
                    Executors.newFixedThreadPool(n)) {

            // Runnable & Callable<T>

            Runnable r = () -> System.out.println("Hello");
            service.submit(r);
        }
    }
}