package org.acme;

public class Main {
    public static void main(String[] args) {
        // Runnable & Callable
        System.out.println("START " + Thread.currentThread().getName()); // main

//        Thread t = Thread.ofPlatform()
////                .daemon()
//                .unstarted(new DoSmthRunnable());

//        DoSmthThread t = new DoSmthThread(); NOT RECOMMENDED

        Thread t = new Thread(new DoSmthRunnable());
        t.start();

        System.out.println("END!" + Thread.currentThread().getName()); // main
    }
}