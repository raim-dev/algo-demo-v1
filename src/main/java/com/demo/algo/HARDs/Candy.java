package com.demo.algo.HARDs;

import java.util.Arrays;

public class Candy {

  /*  There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

    You are giving candies to these children subjected to the following requirements:

    Each child must have at least one candy.
    Children with a higher rating get more candies than their neighbors.

    Return the minimum number of candies you need to have to distribute the candies to the children
    */

    public int candy(int[] ratings){

        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies,1);
        // compare with right neighbor
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }
        int sum = 0;
        //compare with left neighbor
        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        for(int c : candies)
            sum += c;
        return sum;

        // ratings = [1,2,2] candies = [1, 1, 1]
        // walk throw
        //first step: left --> right

        //i = 1 -> ratings[i]2 > ratings[i-1]1 => 2 > 1 = true
        // candies[i]1 = candies[i-1]1 => 1 + 1 = 2 => candies[ 1, 2, 1]
        //i = 2 -> ratings[2]2 > ratings[i-1]2 => 2 > 1 = false and then do nothing

        // result first step candies[1, 2, 1]

        //second step right --> left
        // i = 1 -> ratings[i]2 > ratings[i+1]2 => 2 > 2 false
        //do nothing

        // i = 0 -> ratings[i]1 > ratings[i+1]2 => 1 > 2 false
        // do nothing
        // result: [1, 2, 1]

        /* ********************************************** */
        // ratings{1, 2, 3} candies[1, 1, 1]
        // chack right neighbors
        // int i = 1; because first position don't have left neighbors
        // if(ratings[i] > ratings[i-1])
        // i=1 -> (2 > 1) true (position 1 with value 2 is greater position ZERO with value 1 )
        //candies[i] = candies[i - 1] + 1 => [1, 2, 1]
        // i=2 -> (3 > 2) true
        //candies[i]1 = candies[i-1]+1 => [1, 2, 3]
        // i = 3 end of loop

        // right -> left
        //if(ratings[i] > ratings[i + 1]+1)
        // int i = length - 2 => 3-2 = 1
        // i = 1 -> (2 > 3) false do nothing
        // i = 0 -> (1 > 2) false do noting

    }
}
