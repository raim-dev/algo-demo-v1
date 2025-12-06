package com.demo.algo.EASYs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortedWordDistanceTest {

    @Test
    void testCase1() {
        String[] words = {"the","quick","brown","fox","jumps","over","the","lazy","dog" };
        String word1 = "fox";
        String word2 = "dog";
        assertEquals(5, ShortedWordDistance.shortestDistance(words, word1, word2));
    }

    @Test
    void testCase2() {
        String[] words = {"a", "c", "d", "b", "a"};
        String word1 = "a";
        String word2 = "b";
        assertEquals(1, ShortedWordDistance.shortestDistance(words, word1, word2));
    }

    @Test
    void testCase3() {
        String[] words = {"a", "b", "c", "d", "e"};
        String word1 = "a";
        String word2 = "e";
        assertEquals(4, ShortedWordDistance.shortestDistance(words, word1, word2));

    }

}