package com;

import java.util.Random;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> generate = Stream.generate(random::nextInt);
        generate.filter( number -> number > 0).distinct().limit(4).forEach(System.out::println);
    }
}
