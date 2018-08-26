package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("sd", "fads", " fads", " fa", " dsf");
        String collect = strings.stream().collect(Collectors.joining(" ---- "));
        System.out.println(collect);
    }
}
