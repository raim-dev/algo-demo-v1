package com.demo.algo.EASYs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReversVowel {

    /*
    Given a string s, reverse only all the vowels in the string and return it.
    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     */

    // hello -> holle
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int l = 0, r = s.length() - 1;
        Set<Character> charSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        while (l < r) {
            if (!charSet.contains(chars[l])) l++;
            else if (!charSet.contains(chars[r])) r--;
            else {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++; r--;
            }
        }
        return new String(chars);
    }
}
