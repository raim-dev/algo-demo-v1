package com.demo.algo.EASYs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountDuplicateTest {
    CountDuplicate countDuplicate;

    @BeforeEach
    void setUp() {
        countDuplicate = new CountDuplicate();
    }

    @Test
    void testCase1(){
        int[] arr = {1, 2, 3, 4};
        assertFalse(countDuplicate.countDuplicates(arr));
    }

    @Test
    void testCase2(){
        int[] arr = {1, 2, 3, 1};
        assertTrue(countDuplicate.countDuplicates(arr));
    }

    @Test
    void testCase3(){
        int[] arr = {3, 2, 6, -1, 2, 1};
        assertTrue(countDuplicate.countDuplicates(arr));
    }


}