package com.demo.algo.MEDIUMs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    /*
    Given an array of intervals where intervals[i] = [starti, endi],
    merge all overlapping intervals, and return an array of the
    non-overlapping intervals that cover all the intervals in the input.
     */

    public static int[][] merge(int[][] intervals) {

        if(intervals.length <= 1) return intervals;
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int[] current = intervals[0];
        result.add(current);
        for(int i = 1; i < intervals.length; i++){
            int[] next = intervals[i];
            if(next[0] <= current[1]){
                current[1] = Math.max(current[1], next[1]);
            }else{
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge( new int[][]{{1,3},{2,6},{8,10},{15,18}})));
    }
}
