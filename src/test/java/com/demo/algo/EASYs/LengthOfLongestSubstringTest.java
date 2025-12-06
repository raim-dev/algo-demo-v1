package com.demo.algo.EASYs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void testCase1() {
        String s = "abcabcd";
        assertEquals(4, LengthOfLongestSubstring.lengthOfLongestSubstring(s));
    }

}