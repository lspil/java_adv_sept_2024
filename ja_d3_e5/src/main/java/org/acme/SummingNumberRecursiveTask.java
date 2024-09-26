package org.acme;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SummingNumberRecursiveTask extends RecursiveTask<Integer> {

    private final List<Integer> input;

    public SummingNumberRecursiveTask(List<Integer> input) {
        this.input = input;
    }

    @Override
    protected Integer compute() {
        if (input.size() <= 3) {
            return input.stream().mapToInt(i -> i).sum();
        }

        int mid = input.size() / 2;
        List<Integer> list1 = input.subList(0, mid);
        List<Integer> list2 = input.subList(mid, input.size());

        SummingNumberRecursiveTask t1 = new SummingNumberRecursiveTask(list1);
        SummingNumberRecursiveTask t2 = new SummingNumberRecursiveTask(list2);

        t2.fork();

        return t1.compute() + t2.join(); // join + compute NU!
    }
}
