package com.demo.algo.MEDIUMs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void testCase1() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertEquals(Arrays.deepToString(expected), Arrays.deepToString(MergeIntervals.merge(input)));
    }

    @Test
    void testCase2() {
        int[][] input = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertEquals(Arrays.deepToString(expected), Arrays.deepToString(MergeIntervals.merge(input)));
    }

}