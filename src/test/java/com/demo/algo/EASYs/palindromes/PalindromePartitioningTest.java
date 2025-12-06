package com.demo.algo.EASYs.palindromes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    void testCase1() {

        List<List<String>> result =  PalindromePartitioning.partition("aab");
        List<List<String>> expected = List.of(
                Arrays.asList("a","a","b"),
                Arrays.asList("aa","b"));
        assertEquals(expected, result);
    }

    @Test
    void testCase2() {
        List<List<String>> result =  PalindromePartitioning.partition("ab");
        List<List<String>> expected = List.of(
                Arrays.asList("a", "b"));
        assertEquals(expected, result);
    }

}