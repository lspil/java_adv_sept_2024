package org.acme;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws Exception {
        var t = Thread.ofVirtual().start(new ShowTenNumbersRunnable());


        t.join();
//        while (t.isAlive()) {
////            System.out.println("HELLO " + Thread.currentThread().getName()); // main
//            Thread.sleep(Duration.ofSeconds(1));
//        }

        System.out.println("END");
    }
}