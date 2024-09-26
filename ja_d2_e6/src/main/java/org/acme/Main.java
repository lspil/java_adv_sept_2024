package org.acme;

public class Main {
    public static void main(String[] args) throws Exception {
        var t1 = Thread.ofPlatform().unstarted(new Datasource1Runnable());
        var t2 = Thread.ofPlatform().unstarted(new Datasource2Runnable());

        long tm1 = System.currentTimeMillis();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        long tm2 = System.currentTimeMillis();

        System.out.println("Processing " + (tm2 - tm1)); // max(3,2) = ~3000
    }
}