package com.demo.algo.EASYs;

public class ValidSubsequence {

    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    A subsequence of a string is a new string that is formed from the original string by deleting
    some (can be none) of the characters without disturbing the relative positions of the remaining characters.
    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */

    public static boolean isSubsequence(String s, String t) {
        int l = 0, r = 0;
        while (l < s.length() && r < t.length()) {
            if (s.charAt(l) == t.charAt(r)) {
                l++;
            }
            r++;
        }
        return l == s.length();
    }


    public static boolean isSubsequence2(int[] array, int[] subsequence) {
        int arrayIdx = 0;
        int subsequenceIdx = 0;

        while (arrayIdx < array.length && subsequenceIdx < subsequence.length) {
            if (array[arrayIdx] == subsequence[subsequenceIdx])
                subsequenceIdx++;
            arrayIdx++;
        }
        return subsequenceIdx == subsequence.length;
    }
}
