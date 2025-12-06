package com.demo.algo.MEDIUMs;

public class ProductExceptSelf {

    /*
     238. Product of Array Except Self
     Given an integer array nums, return an array answer such that answer[i] is equal to
     the product of all the elements of nums except nums[i].
    The solution must be implemented without using division and should run in O(n) time.
     */

    // input [1, 2, 3, 4]
    // output [24, 12, 8, 6]
    //i = 3
    //j = 3

    // brute force solution
    /*
    int n = arr.length;
    int[] ans = new int[n];
    Arrays.fill(ans, 1);
     for(int = i = 0, i < n; i++){
        for(int j = 0; j < n; j++){
            if(i != j){
                ans[i] *= arr[j]; => 2 * 3 = 6
            }
        }
     }
     return ans
     */

    //optimal approach

     public static int[] productExceptSelf(int[] arr) {
         int n = arr.length;
         int[] ans = new int[n];
         int L_product = 1;
         for (int i = 0; i < n; i++) {
             ans[i] = L_product;
             L_product *= arr[i];
         }
         int R_product = 1;
         for (int i = n - 1; i >= 0; i--) {
             ans[i] *= R_product;
             R_product *= arr[i];
         }
         return ans;

     }

}
