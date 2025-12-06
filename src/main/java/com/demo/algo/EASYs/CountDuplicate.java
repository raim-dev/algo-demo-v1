package com.demo.algo.EASYs;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicate {

    /*
        Given an integer array nums, return true if any value appears at least twice in the array,
        and return false if every element is distinct.
     */

    public boolean countDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
