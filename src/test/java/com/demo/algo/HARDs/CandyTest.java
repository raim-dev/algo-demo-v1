package com.demo.algo.HARDs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void testCase1() {
        int[] ratings = new int[]{1,2,2};
        Candy candy = new Candy();
        int actual = candy.candy(ratings);
        assertEquals(4, actual);
    }

    @Test
    void testCase2() {
        int[] ratings = new int[]{1, 2, 3};
        Candy candy = new Candy();
        int actual = candy.candy(ratings);
        assertEquals(6, actual);
    }

    @Test
    void testCase3() {
        int[] ratings = new int[]{1, 2, 3, 2, 1};
        Candy candy = new Candy();
        int actual = candy.candy(ratings);
        assertEquals(9, actual);
    }

    @Test
    void testCase4() {
        int[] ratings = new int[]{1, 4, 3, 2, 1};
        Candy candy = new Candy();
        int actual = candy.candy(ratings);
        assertEquals(11, actual);
    }

}