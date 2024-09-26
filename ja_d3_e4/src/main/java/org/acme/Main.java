package org.acme;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        try (ScheduledExecutorService service =
                Executors.newScheduledThreadPool(4)) {

            Runnable r = () -> System.out.println(System.currentTimeMillis());

//            service.schedule(r, 5, TimeUnit.SECONDS);

//            service.scheduleAtFixedRate(r, 0,  3, TimeUnit.SECONDS);
//            service.scheduleWithFixedDelay(r, 0, 3, TimeUnit.SECONDS);

            Thread.sleep(10000);
        }
    }
}