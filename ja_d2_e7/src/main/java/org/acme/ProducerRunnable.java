package org.acme;

import java.util.Random;

public class ProducerRunnable implements Runnable {

    private final String name;

    public ProducerRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            while (true) {
                synchronized (Main.bucket) {
                    if (Main.bucket.size() < 100) {
                        int x = r.nextInt();
                        Main.bucket.add(x);
                        System.out.println("Producer " + name + " added value " + x);
                        Main.bucket.notifyAll();
                    } else {
                        Main.bucket.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
