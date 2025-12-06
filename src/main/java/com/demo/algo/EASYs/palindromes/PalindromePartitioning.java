package com.demo.algo.EASYs.palindromes;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    /*
        Given a string s, partition s such that every substring of the partition
        is a palindrome Return all possible palindrome partitioning of s.
        Input: s = "aab"
        Output: [["a","a","b"],["aa","b"]]
     */

    public static List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, String s, List<String> curr, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if(isPalindrome(s, start, end)){
                curr.add(s.substring(start, end+1));
                backtrack(end+1, s, curr, result);
                curr.removeLast();
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

}
