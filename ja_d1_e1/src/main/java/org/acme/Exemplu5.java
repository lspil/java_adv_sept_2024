package org.acme;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exemplu5 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        Set<Integer> set =
            list.stream()
                    .collect(Collectors.toSet());

        List<Integer> res =
                list.stream()
                        .collect(Collectors.toList());

        SortedSet<Integer> treeSet =
            list.stream()
                    .collect(Collectors.toCollection(TreeSet::new)); // () -> new TreeSet();
    }
}
