package com.demo.algo.EASYs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {

    @Test
    void testCase1() {
        Pangram pangram = new Pangram();
        assertTrue(pangram.isPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));
    }

    @Test
    void testCase2() {
        Pangram pangram = new Pangram();
        assertFalse(pangram.isPangram("This is not a pangram"));
    }

    @Test
    void testCase3() {
        Pangram pangram = new Pangram();
        assertTrue(pangram.isPangram("abcdef ghijkl mnopqr stuvwxyz"));
    }

    @Test
    void testCase4() {
        Pangram pangram = new Pangram();
        assertFalse(pangram.isPangram(""));
    }

    @Test
    void testCase5() {
        Pangram pangram = new Pangram();
        assertTrue(pangram.isPangram("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

}