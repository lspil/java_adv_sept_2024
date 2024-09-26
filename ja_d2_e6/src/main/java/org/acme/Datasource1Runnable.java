package org.acme;

import java.time.Duration;

public class Datasource1Runnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Getting data from DS 1");
        try {
            Thread.sleep(Duration.ofSeconds(3));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data from DS 1 retrieved");
    }
}
