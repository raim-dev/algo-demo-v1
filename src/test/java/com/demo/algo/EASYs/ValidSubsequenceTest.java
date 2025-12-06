package com.demo.algo.EASYs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ValidSubsequenceTest {

    @Test
    void testCase0(){
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(ValidSubsequence.isSubsequence(s, t));

    }

    @Test
    void testCase1() {
        var array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        var sequence = new int[]{5, 1, 22, 25, 6, -1, 8, 10, 10};
        assertFalse(ValidSubsequence.isSubsequence2(array, sequence));
    }

    @Test
    void testCase2() {
        var array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        var sequence = new int[]{1, 6, -1, 5};
        Assertions.assertFalse(ValidSubsequence.isSubsequence2(array, sequence));
    }

    @Test
    void testCase3() {
        var array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        var sequence = new int[]{1, 6, -1, 10};
        Assertions.assertTrue(ValidSubsequence.isSubsequence2(array, sequence));
    }

}