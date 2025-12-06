package com.demo.algo.EASYs;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

   /*
   Given a string sentence containing English letters (lower- or upper-case),
   return true if sentence is a Pangram, or false otherwise.
   A Pangram is a sentence where every letter of the English alphabet appears at least once.
    */

    public boolean isPangram(String sentence) {
        Set<Character> pangram = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if(Character.isLetter(c)) {
                pangram.add(Character.toLowerCase(c));
            }
        }
        return pangram.size() == 26;
    }
}
