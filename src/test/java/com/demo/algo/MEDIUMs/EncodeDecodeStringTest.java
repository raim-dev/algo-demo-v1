package com.demo.algo.MEDIUMs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeStringTest {

    @Test
    void testCase1() {
        var expected = Arrays.asList("lint", "code", "love", "you");
        String String = EncodeDecodeString.encode(expected);
        var actual = EncodeDecodeString.decode(String);
        assertEquals(expected, actual);
    }

}