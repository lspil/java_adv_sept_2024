package org.acme;


import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        // RecursiveAction vs RecursiveTask<T>

        List<Integer> list = List.of(1,5,3,6,9,8,7,4,5,8,6,3,2,7,7,4,1,2,9);

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        var result = forkJoinPool.invoke(new SummingNumberRecursiveTask(list));

        System.out.println(result);

        System.out.println(list.stream().mapToInt(i -> i).sum());
    }
}