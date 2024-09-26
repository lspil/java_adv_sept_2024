package org.acme;

import java.time.Duration;

public class ShowTenNumbersRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().threadId());
                Thread.sleep(Duration.ofSeconds(1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
