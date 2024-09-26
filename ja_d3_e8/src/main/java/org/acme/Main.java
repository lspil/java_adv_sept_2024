package org.acme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> synchList = Collections.synchronizedList(list);

        System.out.println(synchList.getClass());

        // ConcurrentHashMap
        // ConcurrentLinkedDeque
        // ConcurrentLinkedQueue
        // ConcurrentSkipListMap
        // ConcurrentSkipListSet

        // CopyOnWriteArrayList
        // CopyOnWriteArraySet

    }
}