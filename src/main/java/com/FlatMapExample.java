package com;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(3,4,5,6);
        List<Integer> second = Arrays.asList(6,9,8);
        List<Integer> third = Arrays.asList(12,34,68);
        List<List<Integer>> parentList = Arrays.asList(first,second,third);

        parentList.stream().flatMap(list -> list.stream()).forEach(System.out::println);

    }
}
