package com.demo.algo.MEDIUMs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    @Test
    void testCase1() {
        int[] products = new int[]{1, 2, 3, 4, 5};
        int[] expectedProducts = new int[]{120, 60, 40, 30, 24};
        assertArrayEquals(expectedProducts, ProductExceptSelf.productExceptSelf(products));
    }

    @Test
    void testCase2() {
        int[] products = new int[]{-1, 1, 0, -3, 3};
        int[] expectedProducts = new int[]{0, 0, 9, 0, 0};
        //System.out.println(Arrays.toString(ProductExceptSelf.productExceptSelf(products)));
        assertArrayEquals(expectedProducts, ProductExceptSelf.productExceptSelf(products));
    }

}