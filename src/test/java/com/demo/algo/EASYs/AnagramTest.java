package com.demo.algo.EASYs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void testCase1(){
        String s = "listen";
        String t = "silent";
        assertTrue(Anagram.isAnagram(s, t));
    }

    @Test
    void testCase2(){
        String s = "rat";
        String t = "car";
        assertFalse(Anagram.isAnagram(s, t));
    }

}