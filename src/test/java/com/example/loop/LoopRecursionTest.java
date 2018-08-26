package com.example.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopRecursionTest {

    @Test
    public void sum() {
        int sum = LoopRecursion.sum(new int[]{1, 2, 4, 5}, 0);
        assertEquals(12, sum);
    }
}