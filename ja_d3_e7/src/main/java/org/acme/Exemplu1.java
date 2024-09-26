package org.acme;

import java.util.concurrent.Semaphore;

public class Exemplu1 {
    public static void main(String[] args) {
//        Semaphore
//        CyclicBarrier
//        ReadWriteLock

        Semaphore s = new Semaphore(10);

        try {
            s.acquire();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
        }


        try {
            s.acquire();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
        }

    }
}