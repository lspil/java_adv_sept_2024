package org.acme;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        long t1 = System.currentTimeMillis();
//        list.stream().parallel()
        int sum = list.parallelStream()
                .mapToInt(x -> timeConsumingMethod(x))
                // other things...
                .sum();

        long t2 = System.currentTimeMillis();

        System.out.println(t2 - t1);
    }

    private static int timeConsumingMethod(int x) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return x;
    }
}