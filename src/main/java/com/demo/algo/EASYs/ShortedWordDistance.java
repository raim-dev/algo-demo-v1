package com.demo.algo.EASYs;

import java.util.HashMap;
import java.util.Map;

public class ShortedWordDistance {

   /*
     Given an array of strings words and two different strings
     that already exist in the array word1 and word2,
     return the shortest distance between these two words in the list.
    */

    public static int shortestDistance(String[] words, String word1, String word2) {
     int distance = words.length;
     int position1 = -1, position2 = -1;
     for(int i = 0; i < words.length; i++){
        if(words[i].equals(word1)) {
            position1 = i;
        }else if(words[i].equals(word2)){
            position2 = i;
        }

        if(position1 != -1 && position2 != -1){
            distance = Math.min(distance, Math.abs(position1 - position2));
        }
     }
     return distance;
    }

    // time O(n) where n is the size of the input array
    // space O(1) is linear because we don't any extra space
}
