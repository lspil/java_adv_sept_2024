package org.acme;

public class ConsumerRunnable implements Runnable {

    private final String name;

    public ConsumerRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Main.bucket) {
                    if (!Main.bucket.isEmpty()) {
                        int x = Main.bucket.getFirst();
                        Main.bucket.removeFirst();
                        System.out.println("Consumer " + name + " removed the value " + x);
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
