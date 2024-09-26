package org.acme;

import java.time.Duration;

public class Datasource2Runnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Getting data from DS 2");
        try {
            Thread.sleep(Duration.ofSeconds(2));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data from DS 2 retrieved");
    }
}
