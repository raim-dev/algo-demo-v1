package com.demo.algo.EASYs.palindromes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testCase1(){
        String testString = "aba";
        assertTrue(Palindrome.isPalindrome(testString));
    }

    @Test
    void testCase2(){
        String testString = "A man, a plan, a canal, Panama!";
        assertTrue(Palindrome.isPalindrome(testString));
    }

    @Test
    void testCase3(){
        String testString = "race a car";
        assertFalse(Palindrome.isPalindrome(testString));
    }

    @Test
    void testCase4(){
        String testString = "Was it a car or a cat I saw?";
        assertTrue(Palindrome.isPalindrome(testString));
    }

}