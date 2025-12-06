package com.demo.algo.MEDIUMs;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {

    /*
     Design an algorithm to encode a list of strings to a string.
     The encoded string is then sent over the network and is decoded back to the original list of
    */

    public static String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (j < str.length() && str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            result.add(str.substring(i, len + i));
            i += len;
        }
        return result;
    }
}
