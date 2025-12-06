package com.demo.algo.EASYs;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    /*
      Longest Substring Without Repeating Characters
     */
    public static int lengthOfLongestSubstring(String s) {

        // [a b c a b c d]
        //first approach
        int maxLength = 0;
        int n = s.length();

        for(int i = 0; i < n; i++) {
            StringBuilder lastSenSub = new StringBuilder();
            for(int j = i; j < n; j++) {
                char c = s.charAt(j);
                if(lastSenSub.toString().contains(c+"")) {
                    break;
                }
                lastSenSub.append(c);
                maxLength = Math.max(maxLength, lastSenSub.length());
            }

        }

//        int n = s.length();
//        int maxLength = 0;
//        int left = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int right = 0; right < n; right++) {
//            char c = s.charAt(right);
//            if(map.containsKey(c) && map.get(right) >= left) {
//                left = map.get(right) + 1;
//            }
//            map.put(c, right);
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
       return maxLength;
    }
    /*
              l    r
    0 1 2 3 4 5 6 7
    a|b|c|a|b|c|b|b
    c = b
    right = 7
    left = 5
    maxlength = 3
    map:
    [a 3]
    [b 7]
    [c 5]

     */
}
