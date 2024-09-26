package org.acme;

public class DoSmthRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("HELLO " + Thread.currentThread().getName());
    }
}
