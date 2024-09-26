package org.acme;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskProcessor {

    public void processTasks(List<Runnable> tasks) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (Runnable task : tasks) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}
