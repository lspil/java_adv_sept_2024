package org.acme;

import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String[] args) {

        try (ExecutorService service =
                     Executors.newCachedThreadPool()) {

            // Runnable & Callable<T>

            Callable<Integer> c = () -> 10;

            Future<Integer> future = service.submit(c);
            // ...

            try {
                Integer i = future.get();

                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                // e.getCause()
                // ...
            }
        }

    }
}
