package com.demo.algo.EASYs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversVowelTest {

    @Test
    void testCase1() {
        String str = "hello";
        assertEquals("holle", ReversVowel.reverseVowels(str));
    }

    @Test
    void testCase2() {
        String str = "AEIOU";
        assertEquals("UOIEA", ReversVowel.reverseVowels(str));
    }

    @Test
    void testCase3() {
        String str = "DesignGUrus";
        assertEquals("DusUgnGires", ReversVowel.reverseVowels(str));
    }

}